package com.github.toripan0310.ssweaponry.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class SteelToolMaterial implements Tier {
    @Override
    public int getUses() {
        return 500; // 鉄: 250 → 約2倍
    }

    @Override
    public float getSpeed() {
        return 7.5F; // 鉄: 6.0
    }

    @Override
    public float getAttackDamageBonus() {
        return 3.0F; // 鉄: 2.0
    }

    @Override
    public int getLevel() {
        return 3; // 鉄: 2
    }

    @Override
    public int getEnchantmentValue() {
        return 18; // 鉄: 14
    }

    @Override
    public Ingredient getRepairIngredient() {
        // 鉄インゴットを修理素材に
        return Ingredient.of(Items.IRON_INGOT);
    }
}
