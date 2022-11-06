
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insectsandarthropods.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class InsectsAndArthropodsModTabs {
	public static CreativeModeTab TAB_MOD_TAB;

	public static void load() {
		TAB_MOD_TAB = new CreativeModeTab("tabmod_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.BLUE_ORCHID);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
