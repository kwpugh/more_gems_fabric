package com.kwpugh.more_gems.items.areatools;

import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.util.MiningHelper;
import com.kwpugh.more_gems.util.ObsidianBreaking;
import com.kwpugh.pugh_tools.Tools.Hammer;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ModHammer extends Hammer
{
    public ModHammer(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
    {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state)
    {
        Material material = state.getMaterial();

        if(ObsidianBreaking.fastAtObsidian(state, stack))
        {
            return ObsidianBreaking.fastObsidianSpeed();
        }

        return material != Material.METAL && material != Material.REPAIR_STATION && material != Material.STONE ? super.getMiningSpeedMultiplier(stack, state) : this.miningSpeed;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner)
    {
        if (!world.isClient && state.getHardness(world, pos) != 0.0F)
        {
            stack.damage(1, miner, (e) -> {
                e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
            });
        }

        if(!world.isClient && EnchantmentHelper.getLevel(EnchantmentInit.MINING_HELPER, miner.getEquippedStack(EquipmentSlot.MAINHAND)) > 0)
        {
            MiningHelper.breakOtherOres(world, state, pos);
        }

        return true;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("item.more_gems.hammer.tip1").formatted(Formatting.GREEN));
    }
}