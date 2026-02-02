package com.crowsofwar.avatar.client.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public class SimpleQuadrupedRenderer<T extends MobEntity> extends MobEntityRenderer<T, PigEntityModel<T>> {
	private final Identifier texture;

	public SimpleQuadrupedRenderer(EntityRendererFactory.Context context, Identifier texture, EntityModelLayer modelLayer) {
		super(context, new PigEntityModel<>(context.getPart(modelLayer)), 0.7f);
		this.texture = texture;
	}

	@Override
	public Identifier getTexture(T entity) {
		return texture;
	}
}
