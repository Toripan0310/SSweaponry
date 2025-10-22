package com.github.toripan0310.ssweaponry.loot;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SSweaponryLootModifires {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SWRIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS,
                    SSweaponryMod.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
            LOOT_MODIFIER_SWRIALIZERS.register("add_item", AddItemModifier.CODEC);

    //ルートテーブルイベントバスを作成
    public static void register(IEventBus eventBus){
        LOOT_MODIFIER_SWRIALIZERS.register(eventBus);
    }
}
