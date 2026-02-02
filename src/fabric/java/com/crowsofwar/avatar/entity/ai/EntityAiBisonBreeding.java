package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.AnimalMateGoal;

public class EntityAiBisonBreeding extends AnimalMateGoal {
	public EntityAiBisonBreeding(EntitySkyBison bison) {
		super(bison, 1.0);
	}
}
