package com.crowsofwar.avatar.client;

import com.crowsofwar.avatar.AvatarMod;
import com.crowsofwar.avatar.client.render.SimpleBipedRenderer;
import com.crowsofwar.avatar.client.render.LemurRenderer;
import com.crowsofwar.avatar.client.render.AscendedLemurRenderer;
import com.crowsofwar.avatar.client.render.OtterPenguinRenderer;
import com.crowsofwar.avatar.client.render.OstrichHorseRenderer;
import com.crowsofwar.avatar.client.render.ModelLemur;
import com.crowsofwar.avatar.client.render.ModelOtterPenguin;
import com.crowsofwar.avatar.client.render.ModelOstrichHorse;
import com.crowsofwar.avatar.client.render.ModelFlyingBison;
import com.crowsofwar.avatar.client.render.SkyBisonRenderer;
import com.crowsofwar.avatar.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.util.Identifier;

public class AvatarModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityModelLayerRegistry.registerModelLayer(SkyBisonRenderer.LAYER, ModelFlyingBison::getTexturedModelData);
		EntityRendererRegistry.register(ModEntities.SKY_BISON, SkyBisonRenderer::new);

		EntityModelLayerRegistry.registerModelLayer(LemurRenderer.LAYER, ModelLemur::getTexturedModelData);
		EntityRendererRegistry.register(ModEntities.FLYING_LEMUR, LemurRenderer::new);

		EntityModelLayerRegistry.registerModelLayer(AscendedLemurRenderer.LAYER, ModelLemur::getTexturedModelData);
		EntityRendererRegistry.register(ModEntities.ASCENDED_FLYING_LEMUR, AscendedLemurRenderer::new);

		EntityModelLayerRegistry.registerModelLayer(OtterPenguinRenderer.LAYER, ModelOtterPenguin::getTexturedModelData);
		EntityRendererRegistry.register(ModEntities.OTTER_PENGUIN, OtterPenguinRenderer::new);

		EntityModelLayerRegistry.registerModelLayer(OstrichHorseRenderer.LAYER, ModelOstrichHorse::getTexturedModelData);
		EntityRendererRegistry.register(ModEntities.OSTRICH_HORSE, OstrichHorseRenderer::new);

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
