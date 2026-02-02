package com.crowsofwar.avatar.entity.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.world.World;

public class EntityAirbender extends EntityHumanBender {
	public EntityAirbender(EntityType<? extends EntityAirbender> entityType, World world) {
		super(entityType, world);
	}

	public static DefaultAttributeContainer.Builder createAttributes() {
		return EntityBender.createBaseAttributes();
	}
}
