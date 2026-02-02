package com.crowsofwar.avatar.client.render;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;

public class ModelFlyingBison extends SinglePartEntityModel<EntitySkyBison> {
	private final ModelPart root;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart leg5;
	private final ModelPart leg6;
	private final ModelPart body;
	private final ModelPart upTail;
	private final ModelPart lowTail;
	private final ModelPart head;

	public ModelFlyingBison(ModelPart root) {
		this.root = root;
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.leg5 = root.getChild("leg5");
		this.leg6 = root.getChild("leg6");
		this.body = root.getChild("body");
		this.upTail = root.getChild("upTail");
		this.lowTail = this.upTail.getChild("lowTail");
		this.head = root.getChild("head");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData root = modelData.getRoot();

		root.addChild("leg1", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F),
				ModelTransform.pivot(5.98F, 11.98F, -7.98F));

		root.addChild("leg2", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F),
				ModelTransform.pivot(5.98F, 11.98F, 3.0F));

		root.addChild("leg3", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F),
				ModelTransform.pivot(5.98F, 11.98F, 13.98F));

		root.addChild("leg4", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F),
				ModelTransform.pivot(-5.98F, 11.98F, -7.98F));

		root.addChild("leg5", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F),
				ModelTransform.pivot(-5.98F, 11.98F, 3.0F));

		root.addChild("leg6", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F),
				ModelTransform.pivot(-5.98F, 11.98F, 13.98F));

		root.addChild("body", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-9.0F, -7.5F, -14.0F, 18.0F, 15.0F, 28.0F),
				ModelTransform.pivot(0.0F, 4.5F, 3.0F));

		ModelPartData upTail = root.addChild("upTail", ModelPartBuilder.create().uv(35, 55)
				.cuboid(-8.5F, 0.0F, 0.0F, 17.0F, 3.0F, 14.0F),
				ModelTransform.pivot(0.0F, -2.8F, 15.0F));

		upTail.addChild("lowTail", ModelPartBuilder.create().uv(32, 72)
				.cuboid(-8.0F, -1.5F, 0.0F, 16.0F, 3.0F, 14.0F),
				ModelTransform.pivot(0.0F, 1.52F, 13.5F));

		ModelPartData head = root.addChild("head", ModelPartBuilder.create().uv(0, 43)
				.cuboid(-5.5F, -6.0F, -10.0F, 11.0F, 11.0F, 10.0F),
				ModelTransform.pivot(0.0F, 2.5F, -10.0F));

		head.addChild("cheeks", ModelPartBuilder.create().uv(0, 80)
				.cuboid(-5.5F, 0.0F, 0.0F, 11.0F, 1.0F, 3.0F),
				ModelTransform.pivot(0.0F, 4.5F, -9.99F));

		head.addChild("nose", ModelPartBuilder.create().uv(40, 43)
				.cuboid(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 1.0F),
				ModelTransform.pivot(0.0F, 2.5F, -10.0F));

		head.addChild("jaw", ModelPartBuilder.create().uv(42, 43)
				.cuboid(-5.0F, 0.0F, -5.0F, 10.0F, 2.0F, 10.0F),
				ModelTransform.pivot(0.0F, 4.98F, -4.7F));

		head.addChild("hair", ModelPartBuilder.create().uv(0, 64)
				.cuboid(-6.0F, -2.5F, -5.5F, 12.0F, 5.0F, 11.0F),
				ModelTransform.pivot(0.0F, -3.6F, -5.0F));

		head.addChild("horn1", ModelPartBuilder.create().uv(0, 64)
				.cuboid(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F),
				ModelTransform.of(6.5F, -2.0F, -7.0F, -0.20943951F, 0.0F, 0.034906586F));

		head.addChild("horn2", ModelPartBuilder.create().uv(0, 64).mirrored()
				.cuboid(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F),
				ModelTransform.of(-6.5F, -2.0F, -7.0F, -0.20943951F, 0.0F, -0.034906586F));

		head.addChild("ear1", ModelPartBuilder.create().uv(32, 43)
				.cuboid(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F),
				ModelTransform.of(4.0F, -1.0F, -5.0F, 0.0F, 0.0F, -0.38397244F));

		head.addChild("ear2", ModelPartBuilder.create().uv(32, 43).mirrored()
				.cuboid(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F),
				ModelTransform.of(-4.0F, -1.0F, -5.0F, 0.0F, 0.0F, 0.38397244F));

		return TexturedModelData.of(modelData, 112, 96);
	}

	@Override
	public ModelPart getPart() {
		return root;
	}

	@Override
	public void setAngles(EntitySkyBison entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.pitch = headPitch * 0.017453292F;
		head.yaw = netHeadYaw * 0.017453292F;

		float swing = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		leg1.pitch = -swing;
		leg4.pitch = -swing;
		leg3.pitch = -swing;

		leg2.pitch = swing;
		leg5.pitch = swing;
		leg6.pitch = swing;

		upTail.pitch = MathHelper.cos(limbSwing * 0.2F) * 0.1F * limbSwingAmount - 0.2F;
		lowTail.pitch = MathHelper.cos(limbSwing * 0.2F + 0.6F) * 0.1F * limbSwingAmount;
	}
}
