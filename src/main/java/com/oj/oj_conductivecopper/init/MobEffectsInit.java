package com.oj.oj_conductivecopper.init;

import com.oj.oj_conductivecopper.oj_conductivecopper;
import com.oj.oj_conductivecopper.world.effect.ShockEffect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MobEffectsInit {
	public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, oj_conductivecopper.MODID);
	
	public static final RegistryObject<ShockEffect> SHOCK = EFFECTS.register("shock",
			() -> new ShockEffect(MobEffectCategory.HARMFUL, 0));
}
