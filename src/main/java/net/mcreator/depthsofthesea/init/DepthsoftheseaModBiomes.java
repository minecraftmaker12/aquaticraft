
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.depthsofthesea.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.depthsofthesea.world.biome.OceanTrenchBiome;
import net.mcreator.depthsofthesea.DepthsoftheseaMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DepthsoftheseaModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome OCEAN_TRENCH = register("ocean_trench", OceanTrenchBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(DepthsoftheseaMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			OceanTrenchBiome.init();
		});
	}
}
