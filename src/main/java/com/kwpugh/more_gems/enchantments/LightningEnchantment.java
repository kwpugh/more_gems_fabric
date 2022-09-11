package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class LightningEnchantment extends Enchantment
{
    static float lightningChance = MoreGems.CONFIG.GENERAL.lightningChance;

    public LightningEnchantment(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
    {
        super(rarity, enchantmentTarget, equipmentSlots);
    }

    @Override
    public int getMinPower(int level)
    {
        return 10 * (level - 1);
    }

    @Override
    public int getMaxPower(int level)
    {
        return super.getMinPower(level) + 50;
    }

    @Override
    public int getMaxLevel()
    {
        return 5;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level)
    {
        if(user.getRandom().nextFloat() <= (lightningChance * level))
        {
            BlockPos blockPos = target.getBlockPos();
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(user.getEntityWorld());
            lightningEntity.refreshPositionAfterTeleport(Vec3d.ofBottomCenter(blockPos));
            user.getEntityWorld().spawnEntity(lightningEntity);
        }
    }

    @Override
    public boolean isTreasure()
    {
        return MoreGems.CONFIG.GENERAL.enableLightning;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer()
    {
        return MoreGems.CONFIG.GENERAL.enableLightning;
    }

    @Override
    public boolean isAvailableForRandomSelection()
    {
        return MoreGems.CONFIG.GENERAL.enableLightning;
    }
}