package com.github.toripan0310.ssweaponry.datagen.client;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import com.github.toripan0310.ssweaponry.block.SSweaponryBlocks;
import com.github.toripan0310.ssweaponry.item.SSweaponryItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class ENUSLanguageProvider extends LanguageProvider {
    public ENUSLanguageProvider(PackOutput output) {
        super(output, SSweaponryMod.MOD_ID, Locale.US.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(SSweaponryItems.SSWEAPON_STAR, "SSweapon Star");
        addItem(SSweaponryItems.SSWEAPON_STAR_TIER2, "SSweapon Star Tier2");
        addItem(SSweaponryItems.SSSMITHING_TEMPLATE, "SSSmithing Template");
        addItem(SSweaponryItems.WITHER_LOD, "Wither Lod");
        addItem(SSweaponryItems.STEEL_INGOT, "Steel Ingot");
        addItem(SSweaponryItems.WOODEN_SWORD_PLUS1, "Wooden Sword+1");
        addItem(SSweaponryItems.STONE_SWORD_PLUS1, "Stone Sword+1");
        addItem(SSweaponryItems.IRON_SWORD_PLUS1, "Iron Sword+1");
        addItem(SSweaponryItems.GOLDEN_SWORD_PLUS1, "Golden Sword+1");
        addItem(SSweaponryItems.DIAMOND_SWORD_PLUS1, "Diamond Sword+1");
        addItem(SSweaponryItems.NETHERITE_SWORD_PLUS1, "Netherite Sword+1");
        addItem(SSweaponryItems.WOODEN_SWORD_PLUS2, "Wooden Sword+2");
        addItem(SSweaponryItems.STONE_SWORD_PLUS2, "Stone Sword+2");
        addItem(SSweaponryItems.IRON_SWORD_PLUS2, "Iron Sword+2");
        addItem(SSweaponryItems.GOLDEN_SWORD_PLUS2, "Golden Sword+2");
        addItem(SSweaponryItems.DIAMOND_SWORD_PLUS2, "Diamond Sword+2");
        addItem(SSweaponryItems.NETHERITE_SWORD_PLUS2, "Netherite Sword+2");

        add("creativetabs.ssweaponry_tab", "SSweaponry");
        addBlock(SSweaponryBlocks.STEEL_BLOCK, "Steel Block");
    }
}
