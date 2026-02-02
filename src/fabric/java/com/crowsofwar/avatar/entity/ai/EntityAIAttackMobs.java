package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntityBender;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.mob.HostileEntity;

public class EntityAIAttackMobs extends ActiveTargetGoal<HostileEntity> {
	public EntityAIAttackMobs(EntityBender bender) {
		super(bender, HostileEntity.class, true);
	}
}
