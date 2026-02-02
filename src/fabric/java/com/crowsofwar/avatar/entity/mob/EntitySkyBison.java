package com.crowsofwar.avatar.entity.mob;

import com.crowsofwar.avatar.entity.ai.EntityAiBisonBreeding;
import com.crowsofwar.avatar.entity.ai.EntityAiBisonDefendOwner;
import com.crowsofwar.avatar.entity.ai.EntityAiBisonEatGrass;
import com.crowsofwar.avatar.entity.ai.EntityAiBisonFollowAttacker;
import com.crowsofwar.avatar.entity.ai.EntityAiBisonFollowOwner;
import com.crowsofwar.avatar.entity.ai.EntityAiBisonHelpOwnerTarget;
import com.crowsofwar.avatar.entity.ai.EntityAiBisonLand;
import com.crowsofwar.avatar.entity.ai.EntityAiBisonSit;
import com.crowsofwar.avatar.entity.ai.EntityAiBisonTempt;
import com.crowsofwar.avatar.entity.ai.EntityAiBisonWander;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class EntitySkyBison extends TameableEntity {
	public EntitySkyBison(EntityType<? extends EntitySkyBison> entityType, World world) {
		super(entityType, world);
	}

	public static DefaultAttributeContainer.Builder createAttributes() {
		return MobEntity.createMobAttributes()
				.add(EntityAttributes.GENERIC_MAX_HEALTH, 100.0)
				.add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
				.add(EntityAttributes.GENERIC_FLYING_SPEED, 0.35)
				.add(EntityAttributes.GENERIC_FOLLOW_RANGE, 24.0);
	}

	@Override
	protected void initGoals() {
		goalSelector.add(0, new SwimGoal(this));
		goalSelector.add(1, new EntityAiBisonSit(this));
		goalSelector.add(2, new EntityAiBisonTempt(this));
		goalSelector.add(3, new EntityAiBisonBreeding(this));
		goalSelector.add(4, new EntityAiBisonEatGrass(this));
		goalSelector.add(5, new EntityAiBisonLand(this));
		goalSelector.add(6, new EntityAiBisonFollowOwner(this));
		goalSelector.add(7, new EntityAiBisonWander(this));
		goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
		goalSelector.add(9, new LookAroundGoal(this));

		targetSelector.add(1, new EntityAiBisonDefendOwner(this));
		targetSelector.add(2, new EntityAiBisonHelpOwnerTarget(this));
		targetSelector.add(3, new EntityAiBisonFollowAttacker(this));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack) {
		return stack.isOf(Items.WHEAT);
	}

	@Nullable
	@Override
	public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
		return (PassiveEntity) getType().create(world);
	}

	@Override
	public World method_48926() {
		return getWorld();
	}
}
