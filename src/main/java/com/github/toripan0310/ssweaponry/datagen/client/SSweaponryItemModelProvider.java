package com.github.toripan0310.ssweaponry.datagen.client;

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
        basicItem(SSweaponryItems.SSWEAPON_STAR_TIER2.get());
        basicItem(SSweaponryItems.SSWEAPON_STAR_TIER3.get());
        basicItem(SSweaponryItems.SSWEAPON_STAR_TIER4.get());
        basicItem(SSweaponryItems.SSWEAPON_STAR_TIER5.get());
        basicItem(SSweaponryItems.SSSMITHING_TEMPLATE.get());
        basicItem(SSweaponryItems.BONED_CHICKEN.get());
        basicItem(SSweaponryItems.MYTHIC_BONED_CHICKEN.get());
        basicItem(SSweaponryItems.BONED_PORKCHOP.get());
        basicItem(SSweaponryItems.MYTHIC_BONED_PORKCHOP.get());
        basicItem(SSweaponryItems.BONED_BEEF.get());
        basicItem(SSweaponryItems.TORIPAN.get());
        basicItem(SSweaponryItems.INFINITE_TORIPAN.get());
        basicItem(SSweaponryItems.MYTHIC_BONED_BEEF.get());
        basicItem(SSweaponryItems.STEEL_INGOT.get());
        basicItem(SSweaponryItems.STEEL_PICKAXE.get());
        basicItem(SSweaponryItems.STEEL_AXE.get());
        basicItem(SSweaponryItems.STEEL_SHOVEL.get());
        basicItem(SSweaponryItems.STEEL_SWORD.get());
        basicItem(SSweaponryItems.WITHER_LOD.get());

        //木の剣のモデル
        withExistingParent(SSweaponryItems.WOODEN_SWORD_PLUS1.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/wooden_sword_plus1"));
        withExistingParent(SSweaponryItems.WOODEN_SWORD_PLUS2.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/wooden_sword_plus2"));
        withExistingParent(SSweaponryItems.WOODEN_SWORD_PLUS3.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/wooden_sword_plus3"));
        withExistingParent(SSweaponryItems.WOODEN_SWORD_PLUS4.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/wooden_sword_plus4"));
        withExistingParent(SSweaponryItems.WOODEN_SWORD_PLUS5.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/wooden_sword_plus5"));
        //石の剣のモデル
        withExistingParent(SSweaponryItems.STONE_SWORD_PLUS1.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/stone_sword_plus1"));
        withExistingParent(SSweaponryItems.STONE_SWORD_PLUS2.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/stone_sword_plus2"));
        withExistingParent(SSweaponryItems.STONE_SWORD_PLUS3.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/stone_sword_plus3"));
        withExistingParent(SSweaponryItems.STONE_SWORD_PLUS4.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/stone_sword_plus4"));
        withExistingParent(SSweaponryItems.STONE_SWORD_PLUS5.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/stone_sword_plus5"));
        //鉄の剣のモデル
        withExistingParent(SSweaponryItems.IRON_SWORD_PLUS1.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/iron_sword_plus1"));
        withExistingParent(SSweaponryItems.IRON_SWORD_PLUS2.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/iron_sword_plus2"));
        withExistingParent(SSweaponryItems.IRON_SWORD_PLUS3.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/iron_sword_plus3"));
        withExistingParent(SSweaponryItems.IRON_SWORD_PLUS4.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/iron_sword_plus4"));
        withExistingParent(SSweaponryItems.IRON_SWORD_PLUS5.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/iron_sword_plus5"));
        //金の剣のモデル
        withExistingParent(SSweaponryItems.GOLDEN_SWORD_PLUS1.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/golden_sword_plus1"));
        withExistingParent(SSweaponryItems.GOLDEN_SWORD_PLUS2.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/golden_sword_plus2"));
        withExistingParent(SSweaponryItems.GOLDEN_SWORD_PLUS3.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/golden_sword_plus3"));
        withExistingParent(SSweaponryItems.GOLDEN_SWORD_PLUS4.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/golden_sword_plus4"));
        withExistingParent(SSweaponryItems.GOLDEN_SWORD_PLUS5.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/golden_sword_plus5"));
        //ダイヤの剣のモデル
        withExistingParent(SSweaponryItems.DIAMOND_SWORD_PLUS1.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/diamond_sword_plus1"));
        withExistingParent(SSweaponryItems.DIAMOND_SWORD_PLUS2.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/diamond_sword_plus2"));
        withExistingParent(SSweaponryItems.DIAMOND_SWORD_PLUS3.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/diamond_sword_plus3"));
        withExistingParent(SSweaponryItems.DIAMOND_SWORD_PLUS4.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/diamond_sword_plus4"));
        withExistingParent(SSweaponryItems.DIAMOND_SWORD_PLUS5.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/diamond_sword_plus5"));
        //ネザライトの剣のモデル
        withExistingParent(SSweaponryItems.NETHERITE_SWORD_PLUS1.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/netherite_sword_plus1"));
        withExistingParent(SSweaponryItems.NETHERITE_SWORD_PLUS2.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/netherite_sword_plus2"));
        withExistingParent(SSweaponryItems.NETHERITE_SWORD_PLUS3.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/netherite_sword_plus3"));
        withExistingParent(SSweaponryItems.NETHERITE_SWORD_PLUS4.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/netherite_sword_plus4"));
        withExistingParent(SSweaponryItems.NETHERITE_SWORD_PLUS5.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/netherite_sword_plus5"));
        //鋼鉄の剣のモデル
        withExistingParent(SSweaponryItems.STEEL_SWORD_PLUS1.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/steel_sword_plus1"));
        withExistingParent(SSweaponryItems.STEEL_SWORD_PLUS2.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/steel_sword_plus2"));
        withExistingParent(SSweaponryItems.STEEL_SWORD_PLUS3.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/steel_sword_plus3"));
        withExistingParent(SSweaponryItems.STEEL_SWORD_PLUS4.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/steel_sword_plus4"));
        withExistingParent(SSweaponryItems.STEEL_SWORD_PLUS5.getId().getPath(),
                mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/steel_sword_plus5"));

    }
}
