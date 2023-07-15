package com.oj.oj_conductivecopper.init;

import com.oj.oj_conductivecopper.oj_conductivecopper;
import com.oj.oj_conductivecopper.common.entities.projectiles.ShockArrow;
import com.oj.oj_conductivecopper.common.item.ShockArrowItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			oj_conductivecopper.MODID);
	
	
	public static final RegistryObject<Item> SMALL_BATTERY = ITEMS.register("small_battery", () -> new Item(new Item.Properties()));
	
	public static final RegistryObject<ShockArrowItem> SHOCK_ARROW = ITEMS.register("shock_arrow", () -> new ShockArrowItem(new Item.Properties()));
}
