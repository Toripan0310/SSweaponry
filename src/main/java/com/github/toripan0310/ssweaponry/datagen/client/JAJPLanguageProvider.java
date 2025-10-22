package com.github.toripan0310.ssweaponry.datagen.client;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import com.github.toripan0310.ssweaponry.block.SSweaponryBlocks;
import com.github.toripan0310.ssweaponry.item.SSweaponryItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class JAJPLanguageProvider extends LanguageProvider {
    public JAJPLanguageProvider(PackOutput output) {
        super(output, SSweaponryMod.MOD_ID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(SSweaponryItems.SSWEAPON_STAR, "SS武器スター");
        addItem(SSweaponryItems.SSSMITHING_TEMPLATE, "SS鍛治型");
        addItem(SSweaponryItems.WITHER_LOD, "ウィザーロッド");
        addItem(SSweaponryItems.STEEL_INGOT, "鋼鉄インゴット");

        add("creativetabs.ssweaponry_tab", "SS武器");
        addBlock(SSweaponryBlocks.STEEL_BLOCK, "鋼鉄ブロック");
    }
}
