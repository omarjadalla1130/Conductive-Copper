package com.oj.oj_conductivecopper.world.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.player.Player;

public class ShockEffect extends MobEffect {
	//todo: make effect have different particles by using mixins in livingentity class
	public ShockEffect(MobEffectCategory p_19451_, int p_19452_) {
		super(p_19451_, p_19452_);
	}
	
	@SuppressWarnings("resource")
	@Override
	public void applyEffectTick(LivingEntity plr, int pAmplifier) { //no clue what pamplifier is
		if (!plr.level().isClientSide) {
			Double X = plr.getX();
			Double Y = plr.getY();
			Double Z = plr.getZ();
			
			//plr.teleportTo(X, Y, Z);
			//plr.setDeltaMovement(0,0,0);
		}
		super.applyEffectTick(plr, pAmplifier);
	}
	
	@Override
	public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
		return true;
	}
}
