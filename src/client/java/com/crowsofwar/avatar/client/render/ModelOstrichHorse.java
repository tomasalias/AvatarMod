package com.crowsofwar.avatar.client.render;

import com.crowsofwar.avatar.entity.mob.EntityOstrichHorse;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;

public class ModelOstrichHorse extends SinglePartEntityModel<EntityOstrichHorse> {
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;

	public ModelOstrichHorse(ModelPart root) {
		this.root = root;
		this.body = root.getChild("body");
		this.neck = body.getChild("neck");
		this.head = neck.getChild("head");
		this.leftLeg = body.getChild("leftLeg");
		this.rightLeg = body.getChild("rightLeg");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData root = modelData.getRoot();

		ModelPartData body = root.addChild("body", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-4.5F, -4.0F, -7.0F, 9.0F, 8.0F, 14.0F),
				ModelTransform.pivot(0.0F, 10.0F, 0.0F));

		ModelPartData neck = body.addChild("neck", ModelPartBuilder.create().uv(0, 22)
				.cuboid(-1.5F, -10.0F, -1.5F, 3.0F, 10.0F, 3.0F),
				ModelTransform.pivot(0.0F, -2.0F, -6.0F));

		neck.addChild("head", ModelPartBuilder.create().uv(12, 22)
				.cuboid(-2.5F, -3.5F, -5.0F, 5.0F, 4.0F, 5.0F),
				ModelTransform.pivot(0.0F, -10.0F, 0.0F));

		body.addChild("leftLeg", ModelPartBuilder.create().uv(0, 36)
				.cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 10.0F, 3.0F),
				ModelTransform.pivot(3.0F, 3.0F, 4.0F));

		body.addChild("rightLeg", ModelPartBuilder.create().uv(0, 36)
				.mirrored()
				.cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 10.0F, 3.0F),
				ModelTransform.pivot(-3.0F, 3.0F, 4.0F));

		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public ModelPart getPart() {
		return root;
	}

	@Override
	public void setAngles(EntityOstrichHorse entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		neck.yaw = netHeadYaw * 0.017453292F;
		neck.pitch = headPitch * 0.017453292F + MathHelper.sin(limbSwing * 0.2F) * 0.05F;

		leftLeg.pitch = MathHelper.sin(limbSwing * 0.6F) * limbSwingAmount * 0.5F + 0.35F;
		rightLeg.pitch = MathHelper.sin(limbSwing * 0.6F + (float) Math.PI) * limbSwingAmount * 0.5F + 0.35F;
	}
}
