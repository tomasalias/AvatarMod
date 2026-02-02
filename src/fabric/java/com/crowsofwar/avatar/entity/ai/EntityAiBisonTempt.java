package com.crowsofwar.avatar.entity.ai;

import com.crowsofwar.avatar.entity.mob.EntitySkyBison;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;

public class EntityAiBisonTempt extends TemptGoal {
	public EntityAiBisonTempt(EntitySkyBison bison) {
		super(bison, 1.0, Ingredient.ofItems(Items.WHEAT), false);
	}
}
