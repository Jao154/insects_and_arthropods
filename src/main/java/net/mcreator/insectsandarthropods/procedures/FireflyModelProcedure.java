package net.mcreator.insectsandarthropods.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.insectsandarthropods.entity.FireflyEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class FireflyModelProcedure extends AnimatedGeoModel<FireflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(FireflyEntity entity) {
		return new ResourceLocation("insects_and_arthropods", "animations/firefly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FireflyEntity entity) {
		return new ResourceLocation("insects_and_arthropods", "geo/firefly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FireflyEntity entity) {
		return new ResourceLocation("insects_and_arthropods", "textures/entities/firefly.png");
		/**
		}
		@Override
		public void setLivingAnimations(FireflyEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
		super.setLivingAnimations(entity, uniqueID, customPredicate);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = entity.getFactory().getOrCreateAnimationData(uniqueID);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
		/** **/
	}
}
