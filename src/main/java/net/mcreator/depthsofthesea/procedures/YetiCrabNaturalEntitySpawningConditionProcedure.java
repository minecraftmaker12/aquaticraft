package net.mcreator.depthsofthesea.procedures;

import net.minecraft.world.entity.Entity;

public class YetiCrabNaturalEntitySpawningConditionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWater() == false) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
