
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.depthsofthesea.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DepthsoftheseaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item YETI_CRAB = register(
			new SpawnEggItem(DepthsoftheseaModEntities.YETI_CRAB, -11358, -8493493, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("yeti_crab_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
