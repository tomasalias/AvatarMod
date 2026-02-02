package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.SitGoal;

public class EntityAiBisonSit extends SitGoal {
	public EntityAiBisonSit(EntitySkyBison bison) {
		super(bison);
	}
}
