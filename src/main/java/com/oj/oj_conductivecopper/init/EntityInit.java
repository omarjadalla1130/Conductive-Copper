package com.oj.oj_conductivecopper.init;

import java.util.function.Supplier;

import com.oj.oj_conductivecopper.oj_conductivecopper;
import com.oj.oj_conductivecopper.common.entities.projectiles.ShockArrow;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
			oj_conductivecopper.MODID);
	
	public static final RegistryObject<EntityType<ShockArrow>> SHOCK_ARROW = registerEntityType("shock_arrow",
			() -> EntityType.Builder.<ShockArrow>of((ShockArrow::new), MobCategory.MISC)
					.sized(0.5f, 0.5f)
	);
	
	
	
	//thanks choonsters testmod3
	private static <T extends Entity> RegistryObject<EntityType<T>> registerEntityType(final String name, final Supplier<EntityType.Builder<T>> factory) {
		return ENTITIES.register(name,
				() -> factory.get().build(new ResourceLocation(oj_conductivecopper.MODID, name).toString())
		);
	}
}
