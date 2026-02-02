package com.crowsofwar.avatar.client;

import com.crowsofwar.avatar.AvatarMod;
import com.crowsofwar.avatar.client.render.SimpleBipedRenderer;
import com.crowsofwar.avatar.client.render.SimpleQuadrupedRenderer;
import com.crowsofwar.avatar.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

public class AvatarModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(ModEntities.SKY_BISON,
				context -> new SimpleQuadrupedRenderer<>(context,
						new Identifier(AvatarMod.MOD_ID, "textures/mob/flyingbison.png"),
						EntityModelLayers.PIG));

		EntityRendererRegistry.register(ModEntities.FLYING_LEMUR,
				context -> new SimpleQuadrupedRenderer<>(context,
						new Identifier(AvatarMod.MOD_ID, "textures/mob/lemur.png"),
						EntityModelLayers.PIG));

		EntityRendererRegistry.register(ModEntities.ASCENDED_FLYING_LEMUR,
				context -> new SimpleQuadrupedRenderer<>(context,
						new Identifier(AvatarMod.MOD_ID, "textures/mob/lemur2.png"),
						EntityModelLayers.PIG));

		EntityRendererRegistry.register(ModEntities.OSTRICH_HORSE,
				context -> new SimpleQuadrupedRenderer<>(context,
						new Identifier(AvatarMod.MOD_ID, "textures/mob/ostrich_wild.png"),
						EntityModelLayers.PIG));

		EntityRendererRegistry.register(ModEntities.OTTER_PENGUIN,
				context -> new SimpleQuadrupedRenderer<>(context,
						new Identifier(AvatarMod.MOD_ID, "textures/mob/otterpenguin.png"),
						EntityModelLayers.PIG));

		EntityRendererRegistry.register(ModEntities.AIRBENDER,
				context -> new SimpleBipedRenderer<>(context,
						new Identifier(AvatarMod.MOD_ID, "textures/mob/airbender_0.png")));

		EntityRendererRegistry.register(ModEntities.WATERBENDER,
				context -> new SimpleBipedRenderer<>(context,
						new Identifier(AvatarMod.MOD_ID, "textures/mob/airbender_0.png")));

		EntityRendererRegistry.register(ModEntities.FIREBENDER,
				context -> new SimpleBipedRenderer<>(context,
						new Identifier(AvatarMod.MOD_ID, "textures/mob/firebender_0.png")));
	}
}
