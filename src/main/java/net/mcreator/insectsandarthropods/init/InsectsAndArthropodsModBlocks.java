
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insectsandarthropods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.insectsandarthropods.block.FlashlightBlockBlock;
import net.mcreator.insectsandarthropods.InsectsAndArthropodsMod;

public class InsectsAndArthropodsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, InsectsAndArthropodsMod.MODID);
	public static final RegistryObject<Block> FLASHLIGHT_BLOCK = REGISTRY.register("flashlight_block", () -> new FlashlightBlockBlock());
}
