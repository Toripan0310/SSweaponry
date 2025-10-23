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
        addItem(SSweaponryItems.WOODEN_SWORD_PLUS1, "木の剣+1");
        addItem(SSweaponryItems.STONE_SWORD_PLUS1, "石の剣+1");
        addItem(SSweaponryItems.IRON_SWORD_PLUS1, "鉄の剣+1");
        addItem(SSweaponryItems.GOLDEN_SWORD_PLUS1, "金の剣+1");
        addItem(SSweaponryItems.DIAMOND_SWORD_PLUS1, "ダイヤの剣+1");
        addItem(SSweaponryItems.NETHERITE_SWORD_PLUS1, "ネザライトの剣+1");

        add("creativetabs.ssweaponry_tab", "SS武器");
        addBlock(SSweaponryBlocks.STEEL_BLOCK, "鋼鉄ブロック");
    }
}
