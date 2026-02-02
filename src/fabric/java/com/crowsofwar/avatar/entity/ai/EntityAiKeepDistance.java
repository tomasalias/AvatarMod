package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntityBender;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class EntityAiKeepDistance extends Goal {
	private final EntityBender bender;
	private final double minDistance;
	private final double speed;

	public EntityAiKeepDistance(EntityBender bender, double minDistance, double speed) {
		this.bender = bender;
		this.minDistance = minDistance;
		this.speed = speed;
		this.setControls(EnumSet.of(Control.MOVE));
	}

	@Override
	public boolean canStart() {
		LivingEntity target = bender.getTarget();
		return target != null && bender.squaredDistanceTo(target) < minDistance * minDistance;
	}

	@Override
	public void start() {
		LivingEntity target = bender.getTarget();
		if (target == null) {
			return;
		}

		Vec3d away = bender.getPos().subtract(target.getPos()).normalize();
		Vec3d dest = bender.getPos().add(away.multiply(minDistance));
		bender.getNavigation().startMovingTo(dest.x, dest.y, dest.z, speed);
	}
}
