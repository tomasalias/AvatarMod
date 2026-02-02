package com.crowsofwar.avatar.client.render;

import com.crowsofwar.avatar.AvatarMod;
import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class SkyBisonRenderer extends MobEntityRenderer<EntitySkyBison, ModelFlyingBison> {
	public static final EntityModelLayer LAYER = new EntityModelLayer(new Identifier(AvatarMod.MOD_ID, "sky_bison"), "main");
	private static final Identifier TEXTURE = new Identifier(AvatarMod.MOD_ID, "textures/mob/flyingbison.png");

	public SkyBisonRenderer(EntityRendererFactory.Context context) {
		super(context, new ModelFlyingBison(context.getPart(LAYER)), 0.7f);
	}

	@Override
	public Identifier getTexture(EntitySkyBison entity) {
		return TEXTURE;
	}
}
