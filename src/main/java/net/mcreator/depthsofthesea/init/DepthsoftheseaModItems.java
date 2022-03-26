
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.depthsofthesea.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DepthsoftheseaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item YETI_CRAB = register(
			new SpawnEggItem(DepthsoftheseaModEntities.YETI_CRAB, -11358, -8493493, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("yeti_crab_spawn_egg"));
	public static final Item HYDROTHERMAL_VENT = register(DepthsoftheseaModBlocks.HYDROTHERMAL_VENT, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
