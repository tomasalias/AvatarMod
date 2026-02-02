package com.crowsofwar.avatar.entity.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.world.World;

public class EntityFirebender extends EntityHumanBender {
	public EntityFirebender(EntityType<? extends EntityFirebender> entityType, World world) {
		super(entityType, world);
	}

	public static DefaultAttributeContainer.Builder createAttributes() {
		return EntityBender.createBaseAttributes();
	}
}
