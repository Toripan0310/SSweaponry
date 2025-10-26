package com.github.toripan0310.ssweaponry.item;

import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.Rarity;

public class SSweaponryRarities {
    public static final Rarity MYTHIC = Rarity.create("mythic", style -> style.withColor(TextColor.parseColor("#ff8000")));
    public static final Rarity LEGENDARY = Rarity.create("legendary", style -> style.withColor(TextColor.parseColor("#fff500")));
}
