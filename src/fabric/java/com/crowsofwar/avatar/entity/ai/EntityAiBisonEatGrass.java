package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.EatGrassGoal;

public class EntityAiBisonEatGrass extends EatGrassGoal {
	public EntityAiBisonEatGrass(EntitySkyBison bison) {
		super(bison);
	}
}
