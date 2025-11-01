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
                .define('x', Items.NETHER_STAR)
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
                .save(pWriter, "ssweaponry:sssmithing_template_add");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SSweaponryItems.SSSMITHING_TEMPLATE.get(), 2)
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.DIAMOND)
                .define('A', SSweaponryItems.SSSMITHING_TEMPLATE.get())
                .unlockedBy("has_diamod", has(Items.DIAMOND))
                .save(pWriter);
//Infinite Toripan
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, SSweaponryItems.INFINITE_TORIPAN.get())
                .pattern(" B ")
                .pattern("LTL")
                .pattern(" B ")
                .define('B', Items.BONE)
                .define('L', Items.BLAZE_ROD)
                .define('T', SSweaponryItems.TORIPAN.get())
                .unlockedBy("has_toripan", has(SSweaponryItems.TORIPAN.get()))
                .save(pWriter);
//骨付きにく
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, SSweaponryItems.BONED_CHICKEN.get())
                .pattern("C")
                .pattern("B")
                .define('C', Items.BONE)
                .define('B', Items.COOKED_CHICKEN)
                .unlockedBy("has_cooked_chicken", has(Items.COOKED_CHICKEN))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, SSweaponryItems.BONED_PORKCHOP.get())
                .pattern("P")
                .pattern("B")
                .define('B', Items.BONE)
                .define('P', Items.COOKED_PORKCHOP)
                .unlockedBy("has_cooked_porkchop", has(Items.COOKED_PORKCHOP))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, SSweaponryItems.BONED_BEEF.get())
                .pattern("F")
                .pattern("B")
                .define('B', Items.BONE)
                .define('F', Items.COOKED_BEEF)
                .unlockedBy("has_cooked_beef", has(Items.COOKED_BEEF))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, SSweaponryItems.MYTHIC_BONED_CHICKEN.get())
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .define('C', SSweaponryItems.BONED_CHICKEN.get())
                .define('S', SSweaponryItems.SSWEAPON_STAR_TIER5.get())
                .unlockedBy("has_boned_chicken", has(SSweaponryItems.BONED_CHICKEN.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, SSweaponryItems.MYTHIC_BONED_PORKCHOP.get())
                .pattern("SSS")
                .pattern("SPS")
                .pattern("SSS")
                .define('P', SSweaponryItems.BONED_PORKCHOP.get())
                .define('S', SSweaponryItems.SSWEAPON_STAR_TIER5.get())
                .unlockedBy("has_boned_porkchop", has(SSweaponryItems.BONED_PORKCHOP.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, SSweaponryItems.MYTHIC_BONED_BEEF.get())
                .pattern("SSS")
                .pattern("SBS")
                .pattern("SSS")
                .define('B', SSweaponryItems.BONED_BEEF.get())
                .define('S', SSweaponryItems.SSWEAPON_STAR_TIER5.get())
                .unlockedBy("has_boned_beef", has(SSweaponryItems.BONED_BEEF.get()))
                .save(pWriter);
        //SteelTool
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, SSweaponryItems.STEEL_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" K ")
                .define('K', Items.STICK)
                .define('S', SSweaponryItems.STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", has(SSweaponryItems.STEEL_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, SSweaponryItems.STEEL_AXE.get())
                .pattern(" SS")
                .pattern(" KS")
                .pattern(" K ")
                .define('K', Items.STICK)
                .define('S', SSweaponryItems.STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", has(SSweaponryItems.STEEL_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, SSweaponryItems.STEEL_SHOVEL.get())
                .pattern(" S ")
                .pattern(" K ")
                .pattern(" K ")
                .define('K', Items.STICK)
                .define('S', SSweaponryItems.STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", has(SSweaponryItems.STEEL_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, SSweaponryItems.STEEL_PICKAXE.get())
                .pattern("SSS")
                .pattern(" K ")
                .pattern(" K ")
                .define('K', Items.STICK)
                .define('S', SSweaponryItems.STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", has(SSweaponryItems.STEEL_INGOT.get()))
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

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.STEEL_SWORD.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STEEL_SWORD_PLUS1.get()
                )
                .unlocks("has_steel_sword", has(SSweaponryItems.STEEL_SWORD.get()))
                .save(pWriter, "ssweaponry:steel_sword_plus1");

//鍛治型強化+2シリーズ
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR.get()),
                        Ingredient.of(Items.NETHER_STAR),
                        RecipeCategory.MISC,
                        SSweaponryItems.SSWEAPON_STAR_TIER2.get()
                )
                .unlocks("has_ssweapon_star", has(SSweaponryItems.SSWEAPON_STAR.get()))
                .save(pWriter, "ssweaponry:ssweapon_star_tier2");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.WOODEN_SWORD_PLUS1.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER2.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.WOODEN_SWORD_PLUS2.get()
                )
                .unlocks("has_wooden_sword_plus1", has(SSweaponryItems.WOODEN_SWORD_PLUS1.get()))
                .save(pWriter, "ssweaponry:wooden_sword_plus2");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.STONE_SWORD_PLUS1.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER2.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STONE_SWORD_PLUS2.get()
                )
                .unlocks("has_stone_sword_plus1", has(SSweaponryItems.STONE_SWORD_PLUS1.get()))
                .save(pWriter, "ssweaponry:stone_sword_plus2");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.IRON_SWORD_PLUS1.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER2.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.IRON_SWORD_PLUS2.get()
                )
                .unlocks("has_iron_sword_plus1", has(SSweaponryItems.IRON_SWORD_PLUS1.get()))
                .save(pWriter, "ssweaponry:iron_sword_plus2");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.GOLDEN_SWORD_PLUS1.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER2.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.GOLDEN_SWORD_PLUS2.get()
                )
                .unlocks("has_golden_sword_plus1", has(SSweaponryItems.GOLDEN_SWORD_PLUS1.get()))
                .save(pWriter, "ssweaponry:golden_sword_plus2");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.DIAMOND_SWORD_PLUS1.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER2.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.DIAMOND_SWORD_PLUS2.get()
                )
                .unlocks("has_diamond_sword_plus1", has(SSweaponryItems.DIAMOND_SWORD_PLUS1.get()))
                .save(pWriter, "ssweaponry:diamond_sword_plus2");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.NETHERITE_SWORD_PLUS1.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER2.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.NETHERITE_SWORD_PLUS2.get()
                )
                .unlocks("has_netherite_sword_plus1", has(SSweaponryItems.NETHERITE_SWORD_PLUS1.get()))
                .save(pWriter, "ssweaponry:netherite_sword_plus2");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.STEEL_SWORD_PLUS1.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER2.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STEEL_SWORD_PLUS2.get()
                )
                .unlocks("has_steel_sword_plus1", has(SSweaponryItems.STEEL_SWORD_PLUS1.get()))
                .save(pWriter, "ssweaponry:steel_sword_plus2");

//鍛治型強化+3シリーズ
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER2.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR.get()),
                        RecipeCategory.MISC,
                        SSweaponryItems.SSWEAPON_STAR_TIER3.get()
                )
                .unlocks("has_ssweapon_star_tier2", has(SSweaponryItems.SSWEAPON_STAR_TIER2.get()))
                .save(pWriter, "ssweaponry:ssweapon_star_tier3");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.WOODEN_SWORD_PLUS2.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER3.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.WOODEN_SWORD_PLUS3.get()
                )
                .unlocks("has_wooden_sword_plus2", has(SSweaponryItems.WOODEN_SWORD_PLUS2.get()))
                .save(pWriter, "ssweaponry:wooden_sword_plus3");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.STONE_SWORD_PLUS2.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER3.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STONE_SWORD_PLUS3.get()
                )
                .unlocks("has_stone_sword_plus2", has(SSweaponryItems.STONE_SWORD_PLUS2.get()))
                .save(pWriter, "ssweaponry:stone_sword_plus3");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.IRON_SWORD_PLUS2.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER3.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.IRON_SWORD_PLUS3.get()
                )
                .unlocks("has_iron_sword_plus2", has(SSweaponryItems.IRON_SWORD_PLUS2.get()))
                .save(pWriter, "ssweaponry:iron_sword_plus3");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.GOLDEN_SWORD_PLUS2.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER3.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.GOLDEN_SWORD_PLUS3.get()
                )
                .unlocks("has_golden_sword_plus2", has(SSweaponryItems.GOLDEN_SWORD_PLUS2.get()))
                .save(pWriter, "ssweaponry:golden_sword_plus3");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.DIAMOND_SWORD_PLUS2.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER3.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.DIAMOND_SWORD_PLUS3.get()
                )
                .unlocks("has_diamond_sword_plus2", has(SSweaponryItems.DIAMOND_SWORD_PLUS2.get()))
                .save(pWriter, "ssweaponry:diamond_sword_plus3");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.NETHERITE_SWORD_PLUS2.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER3.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.NETHERITE_SWORD_PLUS3.get()
                )
                .unlocks("has_netherite_sword_plus2", has(SSweaponryItems.NETHERITE_SWORD_PLUS2.get()))
                .save(pWriter, "ssweaponry:netherite_sword_plus3");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.STEEL_SWORD_PLUS2.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER3.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STEEL_SWORD_PLUS3.get()
                )
                .unlocks("has_steel_sword_plus2", has(SSweaponryItems.STEEL_SWORD_PLUS2.get()))
                .save(pWriter, "ssweaponry:steel_sword_plus3");

//鍛治型強化+4シリーズ
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER3.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER2.get()),
                        RecipeCategory.MISC,
                        SSweaponryItems.SSWEAPON_STAR_TIER4.get()
                )
                .unlocks("has_ssweapon_star_tier3", has(SSweaponryItems.SSWEAPON_STAR_TIER3.get()))
                .save(pWriter, "ssweaponry:ssweapon_star_tier4");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.WOODEN_SWORD_PLUS3.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER4.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.WOODEN_SWORD_PLUS4.get()
                )
                .unlocks("has_wooden_sword_plus3", has(SSweaponryItems.WOODEN_SWORD_PLUS3.get()))
                .save(pWriter, "ssweaponry:wooden_sword_plus4");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.STONE_SWORD_PLUS3.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER4.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STONE_SWORD_PLUS4.get()
                )
                .unlocks("has_stone_sword_plus3", has(SSweaponryItems.STONE_SWORD_PLUS3.get()))
                .save(pWriter, "ssweaponry:stone_sword_plus4");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.IRON_SWORD_PLUS3.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER4.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.IRON_SWORD_PLUS4.get()
                )
                .unlocks("has_iron_sword_plus3", has(SSweaponryItems.IRON_SWORD_PLUS3.get()))
                .save(pWriter, "ssweaponry:iron_sword_plus4");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.GOLDEN_SWORD_PLUS3.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER4.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.GOLDEN_SWORD_PLUS4.get()
                )
                .unlocks("has_golden_sword_plus3", has(SSweaponryItems.GOLDEN_SWORD_PLUS3.get()))
                .save(pWriter, "ssweaponry:golden_sword_plus4");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.DIAMOND_SWORD_PLUS3.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER4.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.DIAMOND_SWORD_PLUS4.get()
                )
                .unlocks("has_diamond_sword_plus3", has(SSweaponryItems.DIAMOND_SWORD_PLUS3.get()))
                .save(pWriter, "ssweaponry:diamond_sword_plus4");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.NETHERITE_SWORD_PLUS3.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER4.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.NETHERITE_SWORD_PLUS4.get()
                )
                .unlocks("has_netherite_sword_plus3", has(SSweaponryItems.NETHERITE_SWORD_PLUS3.get()))
                .save(pWriter, "ssweaponry:netherite_sword_plus4");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.STEEL_SWORD_PLUS3.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER4.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STEEL_SWORD_PLUS4.get()
                )
                .unlocks("has_steel_sword_plus3", has(SSweaponryItems.STEEL_SWORD_PLUS3.get()))
                .save(pWriter, "ssweaponry:steel_sword_plus4");

//鍛治型強化+5シリーズ
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER4.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER3.get()),
                        RecipeCategory.MISC,
                        SSweaponryItems.SSWEAPON_STAR_TIER5.get()
                )
                .unlocks("has_ssweapon_star_tier4", has(SSweaponryItems.SSWEAPON_STAR_TIER4.get()))
                .save(pWriter, "ssweaponry:ssweapon_star_tier5");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.WOODEN_SWORD_PLUS4.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER5.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.WOODEN_SWORD_PLUS5.get()
                )
                .unlocks("has_wooden_sword_plus4", has(SSweaponryItems.WOODEN_SWORD_PLUS4.get()))
                .save(pWriter, "ssweaponry:wooden_sword_plus5");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.STONE_SWORD_PLUS4.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER5.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STONE_SWORD_PLUS5.get()
                )
                .unlocks("has_stone_sword_plus4", has(SSweaponryItems.STONE_SWORD_PLUS4.get()))
                .save(pWriter, "ssweaponry:stone_sword_plus5");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.IRON_SWORD_PLUS4.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER5.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.IRON_SWORD_PLUS5.get()
                )
                .unlocks("has_iron_sword_plus4", has(SSweaponryItems.IRON_SWORD_PLUS4.get()))
                .save(pWriter, "ssweaponry:iron_sword_plus5");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.GOLDEN_SWORD_PLUS4.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER5.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.GOLDEN_SWORD_PLUS5.get()
                )
                .unlocks("has_golden_sword_plus4", has(SSweaponryItems.GOLDEN_SWORD_PLUS4.get()))
                .save(pWriter, "ssweaponry:golden_sword_plus5");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.DIAMOND_SWORD_PLUS4.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER5.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.DIAMOND_SWORD_PLUS5.get()
                )
                .unlocks("has_diamond_sword_plus4", has(SSweaponryItems.DIAMOND_SWORD_PLUS4.get()))
                .save(pWriter, "ssweaponry:diamond_sword_plus5");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.NETHERITE_SWORD_PLUS4.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER5.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.NETHERITE_SWORD_PLUS5.get()
                )
                .unlocks("has_netherite_sword_plus4", has(SSweaponryItems.NETHERITE_SWORD_PLUS4.get()))
                .save(pWriter, "ssweaponry:netherite_sword_plus5");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(SSweaponryItems.SSSMITHING_TEMPLATE.get()),
                        Ingredient.of(SSweaponryItems.STEEL_SWORD_PLUS4.get()),
                        Ingredient.of(SSweaponryItems.SSWEAPON_STAR_TIER5.get()),
                        RecipeCategory.COMBAT,
                        SSweaponryItems.STEEL_SWORD_PLUS5.get()
                )
                .unlocks("has_steel_sword_plus4", has(SSweaponryItems.STEEL_SWORD_PLUS4.get()))
                .save(pWriter, "ssweaponry:steel_sword_plus5");
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
