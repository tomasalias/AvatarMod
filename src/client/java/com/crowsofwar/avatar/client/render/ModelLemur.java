package com.crowsofwar.avatar.client.render;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;

public class ModelLemur<T extends MobEntity> extends SinglePartEntityModel<T> {
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart rightArm;
	private final ModelPart leftArm;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;
	private final ModelPart tail1;
	private final ModelPart tail2;

	public ModelLemur(ModelPart root) {
		this.root = root;
		this.body = root.getChild("body");
		this.head = body.getChild("head");
		this.rightArm = body.getChild("rightArm");
		this.leftArm = body.getChild("leftArm");
		this.rightLeg = body.getChild("rightLeg");
		this.leftLeg = body.getChild("leftLeg");
		this.tail1 = body.getChild("tail1");
		this.tail2 = tail1.getChild("tail2");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData root = modelData.getRoot();

		ModelPartData body = root.addChild("body", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-2.5F, -5.0F, -2.0F, 5.0F, 5.0F, 4.0F),
				ModelTransform.pivot(0.0F, 7.5F, 0.0F));

		body.addChild("head", ModelPartBuilder.create().uv(0, 9)
				.cuboid(-2.5F, -3.5F, -3.5F, 5.0F, 4.0F, 4.0F),
				ModelTransform.pivot(0.0F, -5.5F, -0.5F));

		body.addChild("rightArm", ModelPartBuilder.create().uv(0, 27)
				.cuboid(0.0F, 0.0F, -1.01F, 1.0F, 8.0F, 1.0F),
				ModelTransform.pivot(2.5F, -5.0F, 0.0F));

		body.addChild("leftArm", ModelPartBuilder.create().uv(0, 27)
				.mirrored()
				.cuboid(-1.0F, 0.0F, -1.01F, 1.0F, 8.0F, 1.0F),
				ModelTransform.pivot(-2.5F, -5.0F, 0.0F));

		body.addChild("rightLeg", ModelPartBuilder.create().uv(0, 19)
				.cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F),
				ModelTransform.pivot(1.3F, 0.0F, 1.2F));

		body.addChild("leftLeg", ModelPartBuilder.create().uv(0, 19)
				.mirrored()
				.cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F),
				ModelTransform.pivot(-1.3F, 0.0F, 1.2F));

		ModelPartData tail1 = body.addChild("tail1", ModelPartBuilder.create().uv(24, 0)
				.cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F),
				ModelTransform.pivot(0.0F, -1.0F, 2.0F));

		tail1.addChild("tail2", ModelPartBuilder.create().uv(24, 0)
				.cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F),
				ModelTransform.pivot(0.0F, 5.5F, 0.0F));

		return TexturedModelData.of(modelData, 160, 64);
	}

	@Override
	public ModelPart getPart() {
		return root;
	}

	@Override
	public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.yaw = netHeadYaw * 0.017453292F;
		head.pitch = headPitch * 0.017453292F;

		float swing = MathHelper.cos(limbSwing * 0.6662F) * 1.1F * limbSwingAmount;
		rightLeg.pitch = swing;
		leftLeg.pitch = -swing;
		rightArm.pitch = -swing * 0.5F;
		leftArm.pitch = swing * 0.5F;

		tail1.yaw = MathHelper.cos(ageInTicks * 0.1F) * 0.2F;
		tail2.yaw = MathHelper.cos(ageInTicks * 0.1F + 0.5F) * 0.2F;
	}
}
