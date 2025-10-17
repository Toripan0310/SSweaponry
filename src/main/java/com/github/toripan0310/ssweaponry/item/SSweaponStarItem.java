package com.github.toripan0310.ssweaponry.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SSweaponStarItem extends Item {
    public SSweaponStarItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFoil(ItemStack stack){
        return true;
    }
}

