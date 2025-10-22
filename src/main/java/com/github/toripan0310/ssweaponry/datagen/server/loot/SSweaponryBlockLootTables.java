package com.github.toripan0310.ssweaponry.datagen.server.loot;

import com.github.toripan0310.ssweaponry.block.SSweaponryBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class SSweaponryBlockLootTables extends BlockLootSubProvider {
    protected SSweaponryBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(SSweaponryBlocks.STEEL_BLOCK.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SSweaponryBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
