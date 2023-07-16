package com.oj.oj_conductivecopper.common.entities.projectiles;

import com.oj.oj_conductivecopper.init.EntityInit;
import com.oj.oj_conductivecopper.init.ItemInit;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class ShockArrow extends Arrow{
	//thanks choonster part 2
	public ShockArrow(final EntityType<? extends ShockArrow> entityType, final Level world) {
		super(entityType, world);
	}

	public ShockArrow(Level p_36866_, LivingEntity p_36867_) {
		super(p_36866_, p_36867_);
		// TODO Auto-generated constructor stub
	}
	
	//allows it to render its own entity texture
	@Override
	public EntityType<?> getType() {
		// TODO Auto-generated method stub
		return EntityInit.SHOCK_ARROW.get();
				
	}
	
	public ItemStack getPickupItem() {
		return ItemInit.SHOCK_ARROW.get().getDefaultInstance();	
	}
	
	@Override
	public void setEffectsFromItem(ItemStack p_36879_) {
		// TODO Auto-generated method stub
		super.setEffectsFromItem(new ItemStack(Items.ARROW)); //need to make a custom effect: shock
	}
	
	@Override
	protected void onHitEntity(EntityHitResult p_36757_) {
		// TODO Auto-generated method stub
		System.out.println("PENIS PENIS PENIS PENIS PENIS");
	}
	
}
