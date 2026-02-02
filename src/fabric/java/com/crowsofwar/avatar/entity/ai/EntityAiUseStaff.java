package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntityBender;
import net.minecraft.entity.ai.goal.Goal;

public class EntityAiUseStaff extends Goal {
	private final EntityBender bender;

	public EntityAiUseStaff(EntityBender bender) {
		this.bender = bender;
	}

	@Override
	public boolean canStart() {
		return false;
	}
}
