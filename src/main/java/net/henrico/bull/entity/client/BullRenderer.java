package net.henrico.bull.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cpw.mods.modlauncher.api.ITransformationService;
import net.henrico.bull.entity.custom.BullEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BullRenderer extends GeoEntityRenderer<BullEntity> {
    public BullRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BullModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public RenderType getRenderType(BullEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packetLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packetLightIn, textureLocation);
    }
}
