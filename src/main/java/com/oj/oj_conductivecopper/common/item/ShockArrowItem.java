package com.oj.oj_conductivecopper.common.item;

import com.oj.oj_conductivecopper.common.entities.projectiles.ShockArrow;
import com.oj.oj_conductivecopper.init.ItemInit;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ShockArrowItem extends ArrowItem {

	public ShockArrowItem(Item.Properties p_40512_) {
		super(p_40512_);
	}

	public AbstractArrow createArrow(Level p_40513_, ItemStack p_40514_, LivingEntity p_40515_) {
			ShockArrow arrow = new ShockArrow(p_40513_, p_40515_);
			arrow.setEffectsFromItem(p_40514_);
			return arrow;
	}
}
