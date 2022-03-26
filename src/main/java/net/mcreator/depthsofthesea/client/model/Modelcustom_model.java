package net.mcreator.depthsofthesea.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("depthsofthesea", "modelcustom_model"),
			"main");
	public final ModelPart bone5;
	public final ModelPart bone6;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.bone5 = root.getChild("bone5");
		this.bone6 = root.getChild("bone6");
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone7 = root.getChild("bone7");
		this.bone8 = root.getChild("bone8");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(8, 8).addBox(3.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 19)
						.addBox(5.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -2.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(0, 3).addBox(-2.0F, -2.0F, 5.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 23.0F, -8.0F));
		PartDefinition cube_r1 = bone6.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 2).addBox(8.0F, -2.0F, -1.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(20, 8).addBox(3.0F, 0.5F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(18, 0).addBox(3.0F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(8, 10).addBox(3.0F, 0.5F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 15).addBox(3.0F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(16, 20).addBox(8.0F, -1.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 23.0F, -9.0F, 0.0F, -2.0944F, 0.0F));
		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.5F, -2.0F, -14.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 17).addBox(7.0F, -2.0F, 7.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(6.0F, -1.0F, 7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(16, 10).addBox(-1.0F, -1.0F, 13.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.8727F, 0.0F));
		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(16, 15).addBox(9.0F, -1.0F, 7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 0).addBox(8.0F, -1.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 9.0F, 3.1416F, 2.0944F, 0.0F));
		PartDefinition cube_r8 = bone4.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -1.0F, 13.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.8727F, 0.0F));
		PartDefinition cube_r9 = bone4.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(8, 14).addBox(9.0F, -1.0F, 7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r10 = bone4.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 15).addBox(6.0F, -1.0F, 7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, 23.0F, -8.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bone7.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(16, 19).addBox(-2.0F, -1.0F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bone7.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(2, 9).addBox(0.0F, 0.0F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, 23.0F, -1.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r13 = bone8.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(14, 18).addBox(-2.0F, -1.0F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone8.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, 0.0F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(6, 20).addBox(1.0F, -0.5F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 15)
						.addBox(-1.0F, -0.5F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 8)
						.addBox(-1.0F, -0.5F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 15)
						.addBox(1.0F, -0.5F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		bone5.render(poseStack, buffer, packedLight, packedOverlay);
		bone6.render(poseStack, buffer, packedLight, packedOverlay);
		bone.render(poseStack, buffer, packedLight, packedOverlay);
		bone2.render(poseStack, buffer, packedLight, packedOverlay);
		bone3.render(poseStack, buffer, packedLight, packedOverlay);
		bone4.render(poseStack, buffer, packedLight, packedOverlay);
		bone7.render(poseStack, buffer, packedLight, packedOverlay);
		bone8.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
