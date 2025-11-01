package com.github.toripan0310.ssweaponry.datagen;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import com.github.toripan0310.ssweaponry.datagen.client.ENUSLanguageProvider;
import com.github.toripan0310.ssweaponry.datagen.client.JAJPLanguageProvider;
import com.github.toripan0310.ssweaponry.datagen.client.SSweaponryBlockStateProvider;
import com.github.toripan0310.ssweaponry.datagen.client.SSweaponryItemModelProvider;
import com.github.toripan0310.ssweaponry.datagen.server.SSweaponryBlockTagsProvider;
import com.github.toripan0310.ssweaponry.datagen.server.SSweaponryRecipeProvider;
import com.github.toripan0310.ssweaponry.datagen.server.loot.SSweaponryGlobalLootModifierProvider;
import com.github.toripan0310.ssweaponry.datagen.server.loot.SSweaponryLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SSweaponryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SSweaponryDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookUpProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new SSweaponryItemModelProvider(packOutput,
                existingFileHelper));
        generator.addProvider(event.includeClient(), new SSweaponryBlockStateProvider(packOutput,
                existingFileHelper));
        generator.addProvider(event.includeClient(), new ENUSLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new JAJPLanguageProvider(packOutput));

        generator.addProvider(event.includeServer(), SSweaponryLootTables.create(packOutput));
        generator.addProvider(event.includeServer(), new SSweaponryBlockTagsProvider(packOutput, lookUpProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new SSweaponryGlobalLootModifierProvider(packOutput));
        generator.addProvider(event.includeServer(), new SSweaponryRecipeProvider(packOutput));
    }
}
