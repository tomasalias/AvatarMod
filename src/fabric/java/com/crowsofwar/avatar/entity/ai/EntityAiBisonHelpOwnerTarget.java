package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.AttackWithOwnerGoal;

public class EntityAiBisonHelpOwnerTarget extends AttackWithOwnerGoal {
	public EntityAiBisonHelpOwnerTarget(EntitySkyBison bison) {
		super(bison);
	}
}
