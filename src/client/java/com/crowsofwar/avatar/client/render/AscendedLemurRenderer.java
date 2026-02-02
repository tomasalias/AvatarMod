package com.crowsofwar.avatar.client.render;

import com.crowsofwar.avatar.AvatarMod;
import com.crowsofwar.avatar.entity.mob.EntityAscendedFlyingLemur;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class AscendedLemurRenderer extends MobEntityRenderer<EntityAscendedFlyingLemur, ModelLemur<EntityAscendedFlyingLemur>> {
	public static final EntityModelLayer LAYER = new EntityModelLayer(new Identifier(AvatarMod.MOD_ID, "ascended_lemur"), "main");
	private static final Identifier TEXTURE = new Identifier(AvatarMod.MOD_ID, "textures/mob/lemur2.png");

	public AscendedLemurRenderer(EntityRendererFactory.Context context) {
		super(context, new ModelLemur<>(context.getPart(LAYER)), 0.3f);
	}

	@Override
	public Identifier getTexture(EntityAscendedFlyingLemur entity) {
		return TEXTURE;
	}
}
