package com.crowsofwar.avatar.client.render;

import com.crowsofwar.avatar.entity.mob.EntityOtterPenguin;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;

public class ModelOtterPenguin extends SinglePartEntityModel<EntityOtterPenguin> {
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart leftArm;
	private final ModelPart rightArm;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;
	private final ModelPart tail1;
	private final ModelPart tail2;

	public ModelOtterPenguin(ModelPart root) {
		this.root = root;
		this.body = root.getChild("body");
		this.head = body.getChild("head");
		this.leftArm = body.getChild("leftArm");
		this.rightArm = body.getChild("rightArm");
		this.leftLeg = body.getChild("leftLeg");
		this.rightLeg = body.getChild("rightLeg");
		this.tail1 = body.getChild("tail1");
		this.tail2 = tail1.getChild("tail2");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData root = modelData.getRoot();

		ModelPartData body = root.addChild("body", ModelPartBuilder.create().uv(0, 17)
				.cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 7.0F),
				ModelTransform.pivot(0.0F, 7.0F, 0.0F));

		body.addChild("head", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 8.0F),
				ModelTransform.pivot(0.0F, 0.01F, 0.5F));

		body.addChild("leftArm", ModelPartBuilder.create().uv(33, 7)
				.mirrored()
				.cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 10.0F, 4.0F),
				ModelTransform.pivot(4.3F, 0.0F, -1.5F));

		body.addChild("rightArm", ModelPartBuilder.create().uv(33, 7)
				.cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 10.0F, 4.0F),
				ModelTransform.pivot(-4.3F, 0.0F, -1.5F));

		body.addChild("leftLeg", ModelPartBuilder.create().uv(25, 0)
				.mirrored()
				.cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F),
				ModelTransform.pivot(2.1F, 11.99F, 0.2F));

		body.addChild("rightLeg", ModelPartBuilder.create().uv(25, 0)
				.cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F),
				ModelTransform.pivot(-2.1F, 11.99F, 0.2F));

		ModelPartData tail1 = body.addChild("tail1", ModelPartBuilder.create().uv(31, 22)
				.cuboid(-3.0F, 0.0F, -2.0F, 6.0F, 7.0F, 2.0F),
				ModelTransform.of(0.0F, 8.0F, 4.0F, 0.38397244F, 0.0F, 0.0F));

		tail1.addChild("tail2", ModelPartBuilder.create().uv(47, 22)
				.cuboid(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 1.0F),
				ModelTransform.of(0.0F, 7.0F, -1.3F, 0.6981317F, 0.0F, 0.0F));

		return TexturedModelData.of(modelData, 64, 48);
	}

	@Override
	public ModelPart getPart() {
		return root;
	}

	@Override
	public void setAngles(EntityOtterPenguin entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.yaw = netHeadYaw * 0.017453292F;
		head.pitch = headPitch * 0.017453292F;

		float swing = MathHelper.cos(limbSwing * 0.6F) * 0.6F * limbSwingAmount;
		leftLeg.pitch = swing;
		rightLeg.pitch = -swing;

		leftArm.roll = MathHelper.cos(limbSwing * 0.6F) * 0.2F * limbSwingAmount - 0.12F;
		rightArm.roll = -MathHelper.cos(limbSwing * 0.6F) * 0.2F * limbSwingAmount + 0.12F;
	}
}
