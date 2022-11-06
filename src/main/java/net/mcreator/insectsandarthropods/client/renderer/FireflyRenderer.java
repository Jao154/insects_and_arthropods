
package net.mcreator.insectsandarthropods.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.insectsandarthropods.procedures.FireflyModelProcedure;
import net.mcreator.insectsandarthropods.procedures.FireflyLayerProcedure;
import net.mcreator.insectsandarthropods.entity.FireflyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FireflyRenderer extends GeoEntityRenderer<FireflyEntity> {
	public FireflyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FireflyModelProcedure());
		this.shadowRadius = 0.2f;
		this.addLayer(new FireflyLayerProcedure(this));
	}

	@Override
	public RenderType getRenderType(FireflyEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
