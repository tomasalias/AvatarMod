package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.Goal;

public class EntityAiBisonLand extends Goal {
	private final EntitySkyBison bison;

	public EntityAiBisonLand(EntitySkyBison bison) {
		this.bison = bison;
	}

	@Override
	public boolean canStart() {
		return bison.isOnGround();
	}
}
