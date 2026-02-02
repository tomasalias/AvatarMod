package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntityBender;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.mob.HostileEntity;

public class EntityAIBenderDefendVillage extends ActiveTargetGoal<HostileEntity> {
	public EntityAIBenderDefendVillage(EntityBender bender) {
		super(bender, HostileEntity.class, true);
	}
}
