package net.henrico.bull.entity.client;

import net.henrico.bull.Bull;
import net.henrico.bull.entity.custom.BullEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BullModel extends AnimatedGeoModel<BullEntity> {

    @Override
    public ResourceLocation getModelResource(BullEntity object) {
        return new ResourceLocation(Bull.MOD_ID, "geo/bull.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BullEntity object) {
        return new ResourceLocation(Bull.MOD_ID, "textures/entity/bull/bull.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BullEntity animatable) {
        return new ResourceLocation(Bull.MOD_ID, "animations/bull.animation.json");
    }
}