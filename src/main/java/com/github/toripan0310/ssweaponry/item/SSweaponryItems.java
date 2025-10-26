package com.github.toripan0310.ssweaponry.item;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SSweaponryItems {
    //レジストリを追加
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SSweaponryMod.MOD_ID);

    //レジストリにアイテムを追加
    public static final RegistryObject<Item> SSWEAPON_STAR = ITEMS.register("ssweapon_star", () -> new SSweaponStarItem(new Item.Properties()
            .rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SSWEAPON_STAR_TIER2 = ITEMS.register("ssweapon_star_tier2", () -> new SSweaponStarItem(new Item.Properties()
            .rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> SSWEAPON_STAR_TIER3 = ITEMS.register("ssweapon_star_tier3", () -> new SSweaponStarItem(new Item.Properties()
            .rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> SSWEAPON_STAR_TIER4 = ITEMS.register("ssweapon_star_tier4", () -> new SSweaponStarItem(new Item.Properties()
            .rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> SSWEAPON_STAR_TIER5 = ITEMS.register("ssweapon_star_tier5", () -> new SSweaponStarItem(new Item.Properties()
            .rarity(SSweaponryRarities.LEGENDARY)));

    public static final RegistryObject<Item> SSSMITHING_TEMPLATE = ITEMS.register("sssmithing_template", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WITHER_LOD = ITEMS.register("wither_lod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    //骨付き焼き鳥肉
    public static final RegistryObject<Item> BONED_CHICKEN = ITEMS.register("boned_chicken", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationMod(0.8f)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 150, 0),1.0f)
                    .build())));
    public static final RegistryObject<Item> MYTHIC_BONED_CHICKEN = ITEMS.register("mythic_boned_chicken", () -> new Item(new Item.Properties()
            .rarity(SSweaponryRarities.MYTHIC)
            .food(new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationMod(1f)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3600, 0),2.0f)
                    .build())));
    //骨付き豚肉
    public static final RegistryObject<Item> BONED_PORKCHOP = ITEMS.register("boned_porkchop", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationMod(0.8f)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 150, 0),1.0f)
                    .build())));
    public static final RegistryObject<Item> MYTHIC_BONED_PORKCHOP = ITEMS.register("mythic_boned_porkchop", () -> new Item(new Item.Properties()
            .rarity(SSweaponryRarities.MYTHIC)
            .food(new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationMod(1f)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3600, 0),2.0f)
                    .build())));
    //骨付き牛肉
    public static final RegistryObject<Item> BONED_BEEF = ITEMS.register("boned_beef", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationMod(0.8f)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 150, 0),1.0f)
                    .build())));
    public static final RegistryObject<Item> MYTHIC_BONED_BEEF = ITEMS.register("mythic_boned_beef", () -> new Item(new Item.Properties()
            .rarity(SSweaponryRarities.MYTHIC)
            .food(new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationMod(1f)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3600, 0),2.0f)
                    .build())));

    public static final RegistryObject<Item> WOODEN_SWORD_PLUS1 = ITEMS.register("wooden_sword_plus1", () ->
            new GlowingSwordItem(Tiers.WOOD,
                    5,
                    -2.2f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> STONE_SWORD_PLUS1 = ITEMS.register("stone_sword_plus1", () ->
            new GlowingSwordItem(Tiers.STONE,
                    5,
                    -2.1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IRON_SWORD_PLUS1 = ITEMS.register("iron_sword_plus1", () ->
            new GlowingSwordItem(Tiers.IRON,
                    5,
                    -2f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> GOLDEN_SWORD_PLUS1 = ITEMS.register("golden_sword_plus1", () ->
            new GlowingSwordItem(Tiers.GOLD,
                    5,
                    -1.9f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DIAMOND_SWORD_PLUS1 = ITEMS.register("diamond_sword_plus1", () ->
            new GlowingSwordItem(Tiers.DIAMOND,
                    5,
                    -1.8f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_SWORD_PLUS1 = ITEMS.register("netherite_sword_plus1", () ->
            new GlowingSwordItem(Tiers.NETHERITE,
                    5,
                    -1.7f,
                    new Item.Properties().fireResistant()));
    //Plus2
    public static final RegistryObject<Item> WOODEN_SWORD_PLUS2 = ITEMS.register("wooden_sword_plus2", () ->
            new GlowingSwordItem(Tiers.WOOD,
                    6,
                    -2.1f,
                    new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STONE_SWORD_PLUS2 = ITEMS.register("stone_sword_plus2", () ->
            new GlowingSwordItem(Tiers.STONE,
                    6,
                    -2f,
                    new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> IRON_SWORD_PLUS2 = ITEMS.register("iron_sword_plus2", () ->
            new GlowingSwordItem(Tiers.IRON,
                    6,
                    -1.9f,
                    new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> GOLDEN_SWORD_PLUS2 = ITEMS.register("golden_sword_plus2", () ->
            new GlowingSwordItem(Tiers.GOLD,
                    6,
                    -1.8f,
                    new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DIAMOND_SWORD_PLUS2 = ITEMS.register("diamond_sword_plus2", () ->
            new GlowingSwordItem(Tiers.DIAMOND,
                    6,
                    -1.7f,
                    new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NETHERITE_SWORD_PLUS2 = ITEMS.register("netherite_sword_plus2", () ->
            new GlowingSwordItem(Tiers.NETHERITE,
                    6,
                    -1.6f,
                    new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));
    //Plus3
    public static final RegistryObject<Item> WOODEN_SWORD_PLUS3 = ITEMS.register("wooden_sword_plus3", () ->
            new GlowingSwordItem(Tiers.WOOD,
                    7,
                    -2f,
                    new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> STONE_SWORD_PLUS3 = ITEMS.register("stone_sword_plus3", () ->
            new GlowingSwordItem(Tiers.STONE,
                    7,
                    -1.9f,
                    new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> IRON_SWORD_PLUS3 = ITEMS.register("iron_sword_plus3", () ->
            new GlowingSwordItem(Tiers.IRON,
                    7,
                    -1.8f,
                    new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GOLDEN_SWORD_PLUS3 = ITEMS.register("golden_sword_plus3", () ->
            new GlowingSwordItem(Tiers.GOLD,
                    7,
                    -1.7f,
                    new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> DIAMOND_SWORD_PLUS3 = ITEMS.register("diamond_sword_plus3", () ->
            new GlowingSwordItem(Tiers.DIAMOND,
                    7,
                    -1.6f,
                    new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> NETHERITE_SWORD_PLUS3 = ITEMS.register("netherite_sword_plus3", () ->
            new GlowingSwordItem(Tiers.NETHERITE,
                    7,
                    -1.5f,
                    new Item.Properties().fireResistant().rarity(Rarity.RARE)));
//plus4
    public static final RegistryObject<Item> WOODEN_SWORD_PLUS4 = ITEMS.register("wooden_sword_plus4", () ->
            new GlowingSwordItem(Tiers.WOOD,
                    8,
                    -1.9f,
                    new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> STONE_SWORD_PLUS4 = ITEMS.register("stone_sword_plus4", () ->
            new GlowingSwordItem(Tiers.STONE,
                    8,
                    -1.8f,
                    new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> IRON_SWORD_PLUS4 = ITEMS.register("iron_sword_plus4", () ->
            new GlowingSwordItem(Tiers.IRON,
                    8,
                    -1.7f,
                    new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> GOLDEN_SWORD_PLUS4 = ITEMS.register("golden_sword_plus4", () ->
            new GlowingSwordItem(Tiers.GOLD,
                    8,
                    -1.6f,
                    new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> DIAMOND_SWORD_PLUS4 = ITEMS.register("diamond_sword_plus4", () ->
            new GlowingSwordItem(Tiers.DIAMOND,
                    8,
                    -1.5f,
                    new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> NETHERITE_SWORD_PLUS4 = ITEMS.register("netherite_sword_plus4", () ->
            new GlowingSwordItem(Tiers.NETHERITE,
                    8,
                    -1.4f,
                    new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
//plus5
    public static final RegistryObject<Item> WOODEN_SWORD_PLUS5 = ITEMS.register("wooden_sword_plus5", () ->
            new GlowingSwordItem(Tiers.WOOD,
                    9,
                    -1.8f,
                    new Item.Properties().fireResistant().rarity(SSweaponryRarities.LEGENDARY)));
    public static final RegistryObject<Item> STONE_SWORD_PLUS5 = ITEMS.register("stone_sword_plus5", () ->
            new GlowingSwordItem(Tiers.STONE,
                    9,
                    -1.7f,
                    new Item.Properties().fireResistant().rarity(SSweaponryRarities.LEGENDARY)));
    public static final RegistryObject<Item> IRON_SWORD_PLUS5 = ITEMS.register("iron_sword_plus5", () ->
            new GlowingSwordItem(Tiers.IRON,
                    9,
                    -1.6f,
                    new Item.Properties().fireResistant().rarity(SSweaponryRarities.LEGENDARY)));
    public static final RegistryObject<Item> GOLDEN_SWORD_PLUS5 = ITEMS.register("golden_sword_plus5", () ->
            new GlowingSwordItem(Tiers.GOLD,
                    9,
                    -1.5f,
                    new Item.Properties().fireResistant().rarity(SSweaponryRarities.LEGENDARY)));
    public static final RegistryObject<Item> DIAMOND_SWORD_PLUS5 = ITEMS.register("diamond_sword_plus5", () ->
            new GlowingSwordItem(Tiers.DIAMOND,
                    9,
                    -1.4f,
                    new Item.Properties().fireResistant().rarity(SSweaponryRarities.LEGENDARY)));
    public static final RegistryObject<Item> NETHERITE_SWORD_PLUS5 = ITEMS.register("netherite_sword_plus5", () ->
            new GlowingSwordItem(Tiers.NETHERITE,
                    9,
                    -1.3f,
                    new Item.Properties().fireResistant().rarity(SSweaponryRarities.LEGENDARY)));


    //アイテムイベントバスを作成
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
