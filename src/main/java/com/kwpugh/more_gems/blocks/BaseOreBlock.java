package com.kwpugh.more_gems.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.Random;

public class BaseOreBlock extends OreBlock
{
    public BaseOreBlock(FabricBlockSettings settings)
    {
        super(settings);
        this.settings.requiresTool();
    }

    Random random = new Random();
    UniformIntProvider experienceDropped = UniformIntProvider.create(0, 2);

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack)
    {
        super.onStacksDropped(state, world, pos, stack);

        if(EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0)
        {
            int i = this.experienceDropped.get(random);
            if (i > 0)
            {
                this.dropExperience(world, pos, i);
            }
        }
    }
}
