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
