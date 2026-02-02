package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;

public class EntityAiBisonWander extends WanderAroundFarGoal {
	public EntityAiBisonWander(EntitySkyBison bison) {
		super(bison, 0.8);
	}
}
