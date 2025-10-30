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
        addItem(SSweaponryItems.SSWEAPON_STAR_TIER3, "SSweapon Star Tier3");
        addItem(SSweaponryItems.SSWEAPON_STAR_TIER4, "SSweapon Star Tier4");
        addItem(SSweaponryItems.SSWEAPON_STAR_TIER5, "SSweapon Star Tier5");
        addItem(SSweaponryItems.SSSMITHING_TEMPLATE, "SSSmithing Template");
        addItem(SSweaponryItems.WITHER_LOD, "Wither Lod");
        addItem(SSweaponryItems.STEEL_INGOT, "Steel Ingot");
        addItem(SSweaponryItems.STEEL_AXE, "Steel Axe");
        addItem(SSweaponryItems.STEEL_SWORD, "Steel Sword");
        addItem(SSweaponryItems.STEEL_PICKAXE, "Steel Pickaxe");
        addItem(SSweaponryItems.STEEL_SHOVEL, "Steel Shovel");
        addItem(SSweaponryItems.BONED_CHICKEN, "Boned Chicken");
        addItem(SSweaponryItems.MYTHIC_BONED_CHICKEN, "Mythic Boned Chicken");
        addItem(SSweaponryItems.BONED_PORKCHOP, "Boned Porkchop");
        addItem(SSweaponryItems.MYTHIC_BONED_PORKCHOP, "Mythic Boned Porkchop");
        addItem(SSweaponryItems.BONED_BEEF, "Boned Beef");
        addItem(SSweaponryItems.MYTHIC_BONED_BEEF, "Mythic Boned Beef");
        addItem(SSweaponryItems.TORIPAN, "Toripan");
        addItem(SSweaponryItems.INFINITE_TORIPAN, "Infinite Toripan");
//plus1
/*        addItem(SSweaponryItems.WOODEN_SWORD_PLUS1, "Wooden Sword+1");
        addItem(SSweaponryItems.STONE_SWORD_PLUS1, "Stone Sword+1");
        addItem(SSweaponryItems.IRON_SWORD_PLUS1, "Iron Sword+1");
        addItem(SSweaponryItems.STEEL_SWORD_PLUS1, "Steel Sword+1");
        addItem(SSweaponryItems.GOLDEN_SWORD_PLUS1, "Golden Sword+1");
        addItem(SSweaponryItems.DIAMOND_SWORD_PLUS1, "Diamond Sword+1");
        addItem(SSweaponryItems.NETHERITE_SWORD_PLUS1, "Netherite Sword+1");
//plus2
        addItem(SSweaponryItems.WOODEN_SWORD_PLUS2, "Wooden Sword+2");
        addItem(SSweaponryItems.STONE_SWORD_PLUS2, "Stone Sword+2");
        addItem(SSweaponryItems.IRON_SWORD_PLUS2, "Iron Sword+2");
        addItem(SSweaponryItems.STEEL_SWORD_PLUS2, "Steel Sword+2");
        addItem(SSweaponryItems.GOLDEN_SWORD_PLUS2, "Golden Sword+2");
        addItem(SSweaponryItems.DIAMOND_SWORD_PLUS2, "Diamond Sword+2");
        addItem(SSweaponryItems.NETHERITE_SWORD_PLUS2, "Netherite Sword+2");
        addItem(SSweaponryItems.WOODEN_SWORD_PLUS3, "Wooden Sword+3");
//plus3
        addItem(SSweaponryItems.STONE_SWORD_PLUS3, "Stone Sword+3");
        addItem(SSweaponryItems.IRON_SWORD_PLUS3, "Iron Sword+3");
        addItem(SSweaponryItems.STEEL_SWORD_PLUS3, "Steel Sword+3");
        addItem(SSweaponryItems.GOLDEN_SWORD_PLUS3, "Golden Sword+3");
        addItem(SSweaponryItems.DIAMOND_SWORD_PLUS3, "Diamond Sword+3");
        addItem(SSweaponryItems.NETHERITE_SWORD_PLUS3, "Netherite Sword+3");
//plus4
        addItem(SSweaponryItems.STONE_SWORD_PLUS4, "Stone Sword+4");
        addItem(SSweaponryItems.IRON_SWORD_PLUS4, "Iron Sword+4");
        addItem(SSweaponryItems.STEEL_SWORD_PLUS4, "Steel Sword+4");
        addItem(SSweaponryItems.GOLDEN_SWORD_PLUS4, "Golden Sword+4");
        addItem(SSweaponryItems.DIAMOND_SWORD_PLUS4, "Diamond Sword+4");
        addItem(SSweaponryItems.NETHERITE_SWORD_PLUS4, "Netherite Sword+4");
//plus5
        addItem(SSweaponryItems.STONE_SWORD_PLUS5, "Stone Sword+5");
        addItem(SSweaponryItems.IRON_SWORD_PLUS5, "Iron Sword+5");
        addItem(SSweaponryItems.STEEL_SWORD_PLUS5, "Steel Sword+5");
        addItem(SSweaponryItems.GOLDEN_SWORD_PLUS5, "Golden Sword+5");
        addItem(SSweaponryItems.DIAMOND_SWORD_PLUS5, "Diamond Sword+5");
        addItem(SSweaponryItems.NETHERITE_SWORD_PLUS5, "Netherite Sword+5");

 */

        add("creativetabs.ssweaponry_tab", "SSweaponry");
        addBlock(SSweaponryBlocks.STEEL_BLOCK, "Steel Block");
    }
}
