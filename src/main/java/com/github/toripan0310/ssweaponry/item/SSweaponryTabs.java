package com.github.toripan0310.ssweaponry.item;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import com.github.toripan0310.ssweaponry.block.SSweaponryBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.SculkSensorBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SSweaponryTabs {
    //レジストリを作成
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SSweaponryMod.MOD_ID);

    //レジストリにタブを登録
    public static final RegistryObject<CreativeModeTab> SSWEAPONRY_TAB = TABS.register("ssweaponry_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetabs.ssweaponry_tab"))
                    .icon(SSweaponryItems.SSWEAPON_STAR.get()::getDefaultInstance)
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(SSweaponryItems.SSWEAPON_STAR.get());
                        pOutput.accept(SSweaponryItems.SSSMITHING_TEMPLATE.get());
                        pOutput.accept(SSweaponryItems.WITHER_LOD.get());
                        pOutput.accept(SSweaponryItems.STEEL_INGOT.get());
                        pOutput.accept(SSweaponryBlocks.STEEL_BLOCK.get());
                    }))
                    .build());

    //タブイベントバスを作成
    public static void register(IEventBus eventBus){
        TABS.register(eventBus);
    }
}
