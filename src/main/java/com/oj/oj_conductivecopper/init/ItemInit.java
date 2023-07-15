package com.oj.oj_conductivecopper.init;

import com.oj.oj_conductivecopper.oj_conductivecopper;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			oj_conductivecopper.MODID);
	
	
	public static final RegistryObject<Item> SMALL_BATTERY = ITEMS.register("small_battery", () -> new Item(new Item.Properties()));
}
