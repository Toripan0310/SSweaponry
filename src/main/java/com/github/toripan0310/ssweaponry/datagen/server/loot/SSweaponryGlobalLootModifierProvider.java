package com.github.toripan0310.ssweaponry.datagen.server.loot;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import com.github.toripan0310.ssweaponry.item.SSweaponryItems;
import com.github.toripan0310.ssweaponry.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class SSweaponryGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public SSweaponryGlobalLootModifierProvider(PackOutput output) {
        super(output, SSweaponryMod.MOD_ID);
    }

    @Override
    @SuppressWarnings({ "unchecked", "removal" })
    protected void start() {
        //ネザー要塞のチェスト
        add("sssmithing_template_from_nether_bridge", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, SSweaponryItems.SSSMITHING_TEMPLATE.get()));

        //廃要塞 bridge
        add("sssmithing_template_from_bastion_bridge", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build()
        }, SSweaponryItems.SSSMITHING_TEMPLATE.get()));

        //廃要塞 stable
        add("sssmithing_template_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build()
        }, SSweaponryItems.SSSMITHING_TEMPLATE.get()));

        //廃要塞 treasure
        add("sssmithing_template_from_bastion_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build()
        }, SSweaponryItems.SSSMITHING_TEMPLATE.get()));

        //ウィザーのドロップ
        add("ssweapon_star_from_wither", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, SSweaponryItems.SSWEAPON_STAR.get()));

        //鶏のドロップ
        add("ssweapon_toripan_from_chicken", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/chicken")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build()
        }, SSweaponryItems.TORIPAN.get()));
    }
}
