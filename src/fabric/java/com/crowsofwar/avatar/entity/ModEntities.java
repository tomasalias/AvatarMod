package com.crowsofwar.avatar.entity;

import com.crowsofwar.avatar.AvatarMod;
import com.crowsofwar.avatar.entity.mob.EntityAirbender;
import com.crowsofwar.avatar.entity.mob.EntityAscendedFlyingLemur;
import com.crowsofwar.avatar.entity.mob.EntityFirebender;
import com.crowsofwar.avatar.entity.mob.EntityFlyingLemur;
import com.crowsofwar.avatar.entity.mob.EntityOstrichHorse;
import com.crowsofwar.avatar.entity.mob.EntityOtterPenguin;
import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import com.crowsofwar.avatar.entity.mob.EntityWaterbender;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModEntities {
	public static EntityType<EntitySkyBison> SKY_BISON;
	public static EntityType<EntityFlyingLemur> FLYING_LEMUR;
	public static EntityType<EntityAscendedFlyingLemur> ASCENDED_FLYING_LEMUR;
	public static EntityType<EntityOstrichHorse> OSTRICH_HORSE;
	public static EntityType<EntityOtterPenguin> OTTER_PENGUIN;
	public static EntityType<EntityAirbender> AIRBENDER;
	public static EntityType<EntityWaterbender> WATERBENDER;
	public static EntityType<EntityFirebender> FIREBENDER;

	private ModEntities() {
	}

	public static void register() {
		SKY_BISON = Registry.register(Registries.ENTITY_TYPE,
				new Identifier(AvatarMod.MOD_ID, "sky_bison"),
				FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntitySkyBison::new)
						.dimensions(EntityDimensions.fixed(2.5f, 2.0f))
						.trackRangeChunks(10)
						.build());

		FLYING_LEMUR = Registry.register(Registries.ENTITY_TYPE,
				new Identifier(AvatarMod.MOD_ID, "flying_lemur"),
				FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityFlyingLemur::new)
						.dimensions(EntityDimensions.fixed(0.6f, 0.7f))
						.trackRangeChunks(8)
						.build());

		ASCENDED_FLYING_LEMUR = Registry.register(Registries.ENTITY_TYPE,
				new Identifier(AvatarMod.MOD_ID, "ascended_flying_lemur"),
				FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityAscendedFlyingLemur::new)
						.dimensions(EntityDimensions.fixed(0.8f, 0.9f))
						.trackRangeChunks(8)
						.build());

		OSTRICH_HORSE = Registry.register(Registries.ENTITY_TYPE,
				new Identifier(AvatarMod.MOD_ID, "ostrich_horse"),
				FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityOstrichHorse::new)
						.dimensions(EntityDimensions.fixed(1.4f, 2.0f))
						.trackRangeChunks(8)
						.build());

		OTTER_PENGUIN = Registry.register(Registries.ENTITY_TYPE,
				new Identifier(AvatarMod.MOD_ID, "otter_penguin"),
				FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityOtterPenguin::new)
						.dimensions(EntityDimensions.fixed(0.6f, 0.5f))
						.trackRangeChunks(8)
						.build());

		AIRBENDER = Registry.register(Registries.ENTITY_TYPE,
				new Identifier(AvatarMod.MOD_ID, "airbender"),
				FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityAirbender::new)
						.dimensions(EntityDimensions.fixed(0.6f, 1.8f))
						.trackRangeChunks(8)
						.build());

		WATERBENDER = Registry.register(Registries.ENTITY_TYPE,
				new Identifier(AvatarMod.MOD_ID, "waterbender"),
				FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityWaterbender::new)
						.dimensions(EntityDimensions.fixed(0.6f, 1.8f))
						.trackRangeChunks(8)
						.build());

		FIREBENDER = Registry.register(Registries.ENTITY_TYPE,
				new Identifier(AvatarMod.MOD_ID, "firebender"),
				FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityFirebender::new)
						.dimensions(EntityDimensions.fixed(0.6f, 1.8f))
						.trackRangeChunks(8)
						.build());

		FabricDefaultAttributeRegistry.register(SKY_BISON, EntitySkyBison.createAttributes());
		FabricDefaultAttributeRegistry.register(FLYING_LEMUR, EntityFlyingLemur.createAttributes());
		FabricDefaultAttributeRegistry.register(ASCENDED_FLYING_LEMUR, EntityAscendedFlyingLemur.createAttributes());
		FabricDefaultAttributeRegistry.register(OSTRICH_HORSE, EntityOstrichHorse.createAttributes());
		FabricDefaultAttributeRegistry.register(OTTER_PENGUIN, EntityOtterPenguin.createAttributes());
		FabricDefaultAttributeRegistry.register(AIRBENDER, EntityAirbender.createAttributes());
		FabricDefaultAttributeRegistry.register(WATERBENDER, EntityWaterbender.createAttributes());
		FabricDefaultAttributeRegistry.register(FIREBENDER, EntityFirebender.createAttributes());
	}
}
