
package net.mcreator.insectsandarthropods.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.insectsandarthropods.procedures.FlashlightRightclickedProcedure;
import net.mcreator.insectsandarthropods.init.InsectsAndArthropodsModTabs;

public class FlashlightItem extends Item {
	public FlashlightItem() {
		super(new Item.Properties().tab(InsectsAndArthropodsModTabs.TAB_MOD_TAB).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FlashlightRightclickedProcedure.execute(entity, itemstack);
		return ar;
	}
}
