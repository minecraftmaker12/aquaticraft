package net.mcreator.depthsofthesea.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.depthsofthesea.entity.YetiCrabEntity;
import net.mcreator.depthsofthesea.client.model.Modelcustom_model;

public class YetiCrabRenderer extends MobRenderer<YetiCrabEntity, Modelcustom_model<YetiCrabEntity>> {
	public YetiCrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(YetiCrabEntity entity) {
		return new ResourceLocation("depthsofthesea:textures/yeticrab.png");
	}
}
