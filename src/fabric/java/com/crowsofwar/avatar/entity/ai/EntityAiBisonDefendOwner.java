package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal;

public class EntityAiBisonDefendOwner extends TrackOwnerAttackerGoal {
	public EntityAiBisonDefendOwner(EntitySkyBison bison) {
		super(bison);
	}
}
