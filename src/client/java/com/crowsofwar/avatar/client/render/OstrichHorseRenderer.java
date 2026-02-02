package com.crowsofwar.avatar.client.render;

import com.crowsofwar.avatar.AvatarMod;
import com.crowsofwar.avatar.entity.mob.EntityOstrichHorse;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class OstrichHorseRenderer extends MobEntityRenderer<EntityOstrichHorse, ModelOstrichHorse> {
	public static final EntityModelLayer LAYER = new EntityModelLayer(new Identifier(AvatarMod.MOD_ID, "ostrich_horse"), "main");
	private static final Identifier TEXTURE = new Identifier(AvatarMod.MOD_ID, "textures/mob/ostrich_wild.png");

	public OstrichHorseRenderer(EntityRendererFactory.Context context) {
		super(context, new ModelOstrichHorse(context.getPart(LAYER)), 0.6f);
	}

	@Override
	public Identifier getTexture(EntityOstrichHorse entity) {
		return TEXTURE;
	}
}
