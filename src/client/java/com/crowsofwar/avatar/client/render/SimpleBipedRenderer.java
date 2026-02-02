package com.crowsofwar.avatar.client.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public class SimpleBipedRenderer<T extends MobEntity> extends MobEntityRenderer<T, BipedEntityModel<T>> {
	private final Identifier texture;

	public SimpleBipedRenderer(EntityRendererFactory.Context context, Identifier texture) {
		super(context, new BipedEntityModel<>(context.getPart(EntityModelLayers.PLAYER)), 0.5f);
		this.texture = texture;
	}

	@Override
	public Identifier getTexture(T entity) {
		return texture;
	}
}
