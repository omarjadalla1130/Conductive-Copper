package com.oj.oj_conductivecopper.events;
import java.util.Collection;

import com.oj.oj_conductivecopper.oj_conductivecopper;
import com.oj.oj_conductivecopper.init.MobEffectsInit;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = oj_conductivecopper.MODID)
public class PlayerEvents {
	
	
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent event) {
		Player plr = event.player;
		if (plr.hasEffect(MobEffectsInit.SHOCK.get())) {
			plr.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0); //failure
		}
	}
}
