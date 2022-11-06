
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insectsandarthropods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.insectsandarthropods.item.GlowSlimeItem;
import net.mcreator.insectsandarthropods.item.FlashlightOnItem;
import net.mcreator.insectsandarthropods.item.FlashlightItem;
import net.mcreator.insectsandarthropods.InsectsAndArthropodsMod;

public class InsectsAndArthropodsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, InsectsAndArthropodsMod.MODID);
	public static final RegistryObject<Item> FIREFLY = REGISTRY.register("firefly_spawn_egg",
			() -> new ForgeSpawnEggItem(InsectsAndArthropodsModEntities.FIREFLY, -27904, -14413312,
					new Item.Properties().tab(InsectsAndArthropodsModTabs.TAB_MOD_TAB)));
	public static final RegistryObject<Item> GLOW_SLIME = REGISTRY.register("glow_slime", () -> new GlowSlimeItem());
	public static final RegistryObject<Item> FLASHLIGHT = REGISTRY.register("flashlight", () -> new FlashlightItem());
	public static final RegistryObject<Item> FLASHLIGHT_ON = REGISTRY.register("flashlight_on", () -> new FlashlightOnItem());
	public static final RegistryObject<Item> FLASHLIGHT_BLOCK = block(InsectsAndArthropodsModBlocks.FLASHLIGHT_BLOCK, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
