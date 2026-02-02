package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.AttackWithOwnerGoal;

public class EntityAiBisonFollowAttacker extends AttackWithOwnerGoal {
	public EntityAiBisonFollowAttacker(EntitySkyBison bison) {
		super(bison);
	}
}
