
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insectsandarthropods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.insectsandarthropods.block.entity.FlashlightBlockBlockEntity;
import net.mcreator.insectsandarthropods.InsectsAndArthropodsMod;

public class InsectsAndArthropodsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			InsectsAndArthropodsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FLASHLIGHT_BLOCK = register("flashlight_block",
			InsectsAndArthropodsModBlocks.FLASHLIGHT_BLOCK, FlashlightBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
