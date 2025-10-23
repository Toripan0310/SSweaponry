package com.github.toripan0310.ssweaponry.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class GlowingSwordItem extends SwordItem {
    public GlowingSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        // 常に光沢（エンチャントエフェクト）を表示
        return true;
    }
}
