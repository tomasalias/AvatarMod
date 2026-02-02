package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.FollowOwnerGoal;

public class EntityAiBisonFollowOwner extends FollowOwnerGoal {
	public EntityAiBisonFollowOwner(EntitySkyBison bison) {
		super(bison, 1.0, 8.0f, 3.0f, false);
	}
}
