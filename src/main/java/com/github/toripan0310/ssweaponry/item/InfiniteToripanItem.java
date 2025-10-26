package com.github.toripan0310.ssweaponry.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

import net.minecraft.world.level.Level;

public class InfiniteToripanItem extends Item {
    private static final int COOLDOWN_TICKS = 600;

    public InfiniteToripanItem(Properties pProperties) {
        super(pProperties
                .food(new FoodProperties.Builder()
                        .nutrition(8)
                        .saturationMod(0.8f)
                        .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 20 * 60,0),1)
                        .build())
                .rarity(SSweaponryRarities.MYTHIC)
                .stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand){
        ItemStack stack = player.getItemInHand(hand);
        if (player.getCooldowns().isOnCooldown(this)){
            return InteractionResultHolder.fail(stack);
        }

        if (!player.canEat(false)){
            return InteractionResultHolder.fail(stack);
        }
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(stack);
    }
    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity){

        if (!level.isClientSide && entity instanceof Player player){
            player.getFoodData().eat(8, 0.8f);

            player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);

            player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 20*60, 0));
        }

        return stack;
    }
    @Override
    public UseAnim getUseAnimation(ItemStack stack){
        return UseAnim.EAT;
    }
    @Override
    public int getUseDuration(ItemStack stack){
        return 32;
    }
}
