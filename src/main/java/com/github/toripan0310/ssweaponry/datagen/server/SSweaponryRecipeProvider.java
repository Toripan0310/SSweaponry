package com.github.toripan0310.ssweaponry.datagen.server;

import com.github.toripan0310.ssweaponry.block.SSweaponryBlocks;
import com.github.toripan0310.ssweaponry.item.SSweaponryItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import java.util.function.Consumer;

public class SSweaponryRecipeProvider extends RecipeProvider {
    public SSweaponryRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC,//ここは動画と違う変更があった"pWriter"のとこ
                SSweaponryItems.STEEL_INGOT.get(),
                RecipeCategory.BUILDING_BLOCKS,
                SSweaponryBlocks.STEEL_BLOCK.get());
//鋼鉄インゴット
        SimpleCookingRecipeBuilder.blasting(
                Ingredient.of(Items.IRON_INGOT),
                RecipeCategory.MISC,
                SSweaponryItems.STEEL_INGOT.get(),
                0.8f,
                100

        )
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(pWriter, "ssweaponry:steel_ingot_from_blasting");
//ウィザーロッド
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SSweaponryItems.WITHER_LOD.get())
                .pattern("iyi")
                .pattern("ixi")
                .pattern("isi")
                .define('x',Items.NETHER_STAR)
                .define('y', Items.WITHER_SKELETON_SKULL)
                .define('s', Items.STICK)
                .define('i', SSweaponryItems.STEEL_INGOT.get())
                .unlockedBy("has_nether_star", has(Items.NETHER_STAR))
                .save(pWriter);
//ss武器スター
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SSweaponryItems.SSWEAPON_STAR.get())
                .pattern("xxx")
                .pattern("xyx")
                .pattern("xxx")
                .define('x', Items.NETHER_STAR)
                .define('y', Items.WITHER_SKELETON_SKULL)
                .unlockedBy("has_nether_star", has(Items.NETHER_STAR))
                .save(pWriter);
//ss鍛治型
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SSweaponryItems.SSSMITHING_TEMPLATE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.DIAMOND)
                .define('A', SSweaponryItems.SSWEAPON_STAR.get())
                .unlockedBy("has_diamod", has(Items.DIAMOND))
                .save(pWriter);
//鍛治型強化+1 シリーズ
        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                Ingredient.of(Items.WOODEN_SWORD),
                Ingredient.of(SSweaponryItems.SSWEAPON_STAR.get()),
                RecipeCategory.COMBAT,
                SSweaponryItems.WOODEN_SWORD_PLUS1.get()
        )
                .unlocks("has_wooden_sword", has(Items.WOODEN_SWORD))
                .save(pWriter, "ssweaponry:wooden_sword_plus1");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.STONE_SWORD),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STONE_SWORD_PLUS1.get()
                )
                .unlocks("has_stone_sword", has(Items.STONE_SWORD))
                .save(pWriter, "ssweaponry:stone_sword_plus1");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_SWORD),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.IRON_SWORD_PLUS1.get()
                )
                .unlocks("has_iron_sword", has(Items.IRON_SWORD))
                .save(pWriter, "ssweaponry:iron_sword_plus1");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.GOLDEN_SWORD),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.GOLDEN_SWORD_PLUS1.get()
                )
                .unlocks("has_golden_sword", has(Items.GOLDEN_SWORD))
                .save(pWriter, "ssweaponry:golden_sword_plus1");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.DIAMOND_SWORD),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.DIAMOND_SWORD_PLUS1.get()
                )
                .unlocks("has_diamond_sword", has(Items.DIAMOND_SWORD))
                .save(pWriter, "ssweaponry:diamond_sword_plus1");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_SWORD),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.NETHERITE_SWORD_PLUS1.get()
                )
                .unlocks("has_netherite_sword", has(Items.NETHERITE_SWORD))
                .save(pWriter, "ssweaponry:netherite_sword_plus1");
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                                  RecipeCategory pUnpackedCategory,
                                                  ItemLike pUnpacked,
                                                  RecipeCategory pPackedCategory,
                                                  ItemLike pPacked){
        ShapelessRecipeBuilder.shapeless(pUnpackedCategory, pUnpacked, 9)
                .requires(pPacked).unlockedBy(getHasName(pPacked), has(pPacked)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pPackedCategory, pPacked).define('#', pUnpacked)
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy(getHasName(pUnpacked), has(pUnpacked)).save(pFinishedRecipeConsumer);
    }
}
