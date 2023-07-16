package com.oj.oj_conductivecopper.renderer.entity;

import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class RenderShockArrow extends ArrowRenderer {
	private final ResourceLocation entityTexture;
	
	public RenderShockArrow(Context p_173917_, final ResourceLocation entityTexture) {
		super(p_173917_);
		this.entityTexture = entityTexture;
	}

	@Override
	public ResourceLocation getTextureLocation(Entity p_114482_) {
		// TODO Auto-generated method stub
		return entityTexture;
	}

}
