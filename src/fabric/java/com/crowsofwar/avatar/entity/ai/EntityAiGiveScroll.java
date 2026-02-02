package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntityHumanBender;
import net.minecraft.entity.ai.goal.Goal;

public class EntityAiGiveScroll extends Goal {
	private final EntityHumanBender bender;

	public EntityAiGiveScroll(EntityHumanBender bender) {
		this.bender = bender;
	}

	@Override
	public boolean canStart() {
		return false;
	}
}
