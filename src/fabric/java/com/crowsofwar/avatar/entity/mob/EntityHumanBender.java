package com.crowsofwar.avatar.entity.mob;

import com.crowsofwar.avatar.entity.ai.EntityAIAttackMobs;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public abstract class EntityHumanBender extends EntityBender {
	private static final TrackedData<Integer> SKIN = DataTracker.registerData(EntityHumanBender.class, TrackedDataHandlerRegistry.INTEGER);

	protected EntityHumanBender(EntityType<? extends EntityHumanBender> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected void initGoals() {
		super.initGoals();
		goalSelector.add(2, new WanderAroundFarGoal(this, 0.8));
		goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
		goalSelector.add(4, new LookAroundGoal(this));

		targetSelector.add(1, new EntityAIAttackMobs(this));
	}

	@Override
	protected void initDataTracker() {
		super.initDataTracker();
		dataTracker.startTracking(SKIN, 0);
	}

	public int getSkin() {
		return dataTracker.get(SKIN);
	}

	public void setSkin(int skin) {
		dataTracker.set(SKIN, skin);
	}
}
