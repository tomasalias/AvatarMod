package com.crowsofwar.avatar.client.render;

import com.crowsofwar.avatar.AvatarMod;
import com.crowsofwar.avatar.entity.mob.EntityOtterPenguin;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class OtterPenguinRenderer extends MobEntityRenderer<EntityOtterPenguin, ModelOtterPenguin> {
	public static final EntityModelLayer LAYER = new EntityModelLayer(new Identifier(AvatarMod.MOD_ID, "otter_penguin"), "main");
	private static final Identifier TEXTURE = new Identifier(AvatarMod.MOD_ID, "textures/mob/otterpenguin.png");

	public OtterPenguinRenderer(EntityRendererFactory.Context context) {
		super(context, new ModelOtterPenguin(context.getPart(LAYER)), 0.4f);
	}

	@Override
	public Identifier getTexture(EntityOtterPenguin entity) {
		return TEXTURE;
	}
}
