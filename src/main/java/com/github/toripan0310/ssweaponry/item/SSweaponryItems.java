package com.github.toripan0310.ssweaponry.item;

import com.github.toripan0310.ssweaponry.SSweaponryMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SSweaponryItems {
    //レジストリを追加
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SSweaponryMod.MOD_ID);

    //レジストリにアイテムを追加
    public static final RegistryObject<Item> SSWEAPON_STAR = ITEMS.register("ssweapon_star", () -> new SSweaponStarItem(new Item.Properties()));
    public static final RegistryObject<Item> SSSMITHING_TEMPLATE = ITEMS.register("sssmithing_template", () -> new Item(new Item.Properties()));


    //アイテムイベントバスを作成
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
