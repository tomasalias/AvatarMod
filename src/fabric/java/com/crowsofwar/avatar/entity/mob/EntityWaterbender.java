package com.crowsofwar.avatar.entity.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.world.World;

public class EntityWaterbender extends EntityHumanBender {
	public EntityWaterbender(EntityType<? extends EntityWaterbender> entityType, World world) {
		super(entityType, world);
	}

	public static DefaultAttributeContainer.Builder createAttributes() {
		return EntityBender.createBaseAttributes();
	}
}
