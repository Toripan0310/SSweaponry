package com.github.toripan0310.ssweaponry.datagen.client;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import com.github.toripan0310.ssweaponry.block.SSweaponryBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class SSweaponryBlockStateProvider extends BlockStateProvider {
    public SSweaponryBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SSweaponryMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(SSweaponryBlocks.STEEL_BLOCK);
    }

    private void simpleBlockWithItem(RegistryObject<Block> block){
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}
