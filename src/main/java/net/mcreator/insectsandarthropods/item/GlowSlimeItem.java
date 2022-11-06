
package net.mcreator.insectsandarthropods.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.insectsandarthropods.init.InsectsAndArthropodsModTabs;

public class GlowSlimeItem extends Item {
	public GlowSlimeItem() {
		super(new Item.Properties().tab(InsectsAndArthropodsModTabs.TAB_MOD_TAB).stacksTo(16).rarity(Rarity.COMMON));
	}
}
