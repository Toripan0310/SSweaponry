package com.github.toripan0310.ssweaponry.datagen;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import com.github.toripan0310.ssweaponry.item.SSweaponryItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SSweaponryItemModelProvider extends ItemModelProvider {
    public SSweaponryItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SSweaponryMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(SSweaponryItems.SSWEAPON_STAR.get());
        basicItem(SSweaponryItems.SSSMITHING_TEMPLATE.get());
        basicItem(SSweaponryItems.STEEL_INGOT.get());
        basicItem(SSweaponryItems.WITHER_LOD.get());
    }
}
