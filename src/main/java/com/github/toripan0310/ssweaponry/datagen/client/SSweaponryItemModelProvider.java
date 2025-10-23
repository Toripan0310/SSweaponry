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
        basicItem(SSweaponryItems.SSSMITHING_TEMPLATE.get());
        basicItem(SSweaponryItems.STEEL_INGOT.get());
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
    }
}
