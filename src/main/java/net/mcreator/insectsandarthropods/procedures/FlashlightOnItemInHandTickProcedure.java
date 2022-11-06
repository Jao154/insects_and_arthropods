package net.mcreator.insectsandarthropods.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.insectsandarthropods.init.InsectsAndArthropodsModBlocks;

public class FlashlightOnItemInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		if (!world.isClientSide()) {
			distance = 1;
			for (int index0 = 0; index0 < (int) (17); index0++) {
				if ((world.getBlockState(new BlockPos(
						entity.level.clip(
								new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getX(),
						entity.level.clip(
								new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getY(),
						entity.level.clip(
								new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getZ())))
						.getBlock() == InsectsAndArthropodsModBlocks.FLASHLIGHT_BLOCK.get() && new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world,
								new BlockPos(
										entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
												ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
												ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
												ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
								"Delay") < 5) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(
								entity.level.clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
										ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
										ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
										ClipContext.Fluid.NONE, entity)).getBlockPos().getZ());
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("Delay", 5);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					if ((world.getBlockState(new BlockPos(
							entity.level.clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
									ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
							entity.level.clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
									ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
							entity.level.clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
							.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
						world.setBlock(
								new BlockPos(
										entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
												ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
												ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.OUTLINE,
												ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
								InsectsAndArthropodsModBlocks.FLASHLIGHT_BLOCK.get().defaultBlockState(), 3);
					}
				}
				distance = distance + 1;
			}
		}
	}
}
