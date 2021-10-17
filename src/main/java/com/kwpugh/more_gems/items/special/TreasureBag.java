package com.kwpugh.more_gems.items.special;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.init.TagInit;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class TreasureBag extends Item
{
    public TreasureBag(Settings settings)
    {
        super(settings);
    }

    Random random = new Random();

    private static final EnchantmentLevelEntry SILK_TOUCH = new EnchantmentLevelEntry(Enchantments.SILK_TOUCH, 1);
    private static final EnchantmentLevelEntry BLINKING = new EnchantmentLevelEntry(EnchantmentInit.BLINKING, 1);
    private static final EnchantmentLevelEntry CREEPERLESS = new EnchantmentLevelEntry(EnchantmentInit.CREEPERLESS, 1);
    private static final EnchantmentLevelEntry FASTER_OBSIDIAN = new EnchantmentLevelEntry(EnchantmentInit.FASTER_OBSIDIAN, 1);
    private static final EnchantmentLevelEntry FLOATING1 = new EnchantmentLevelEntry(EnchantmentInit.FLOATING, 1);
    private static final EnchantmentLevelEntry FLOATING2 = new EnchantmentLevelEntry(EnchantmentInit.FLOATING, 2);
    private static final EnchantmentLevelEntry LAVA_VIEW = new EnchantmentLevelEntry(EnchantmentInit.LAVA_VIEW, 1);
    private static final EnchantmentLevelEntry LIGHTNING = new EnchantmentLevelEntry(EnchantmentInit.LIGHTNING, 1);
    private static final EnchantmentLevelEntry QUICKENING = new EnchantmentLevelEntry(EnchantmentInit.QUICKENING, 1);
    private static final EnchantmentLevelEntry RAZOR_SHARPNESS = new EnchantmentLevelEntry(EnchantmentInit.RAZOR_SHARPNESS, 1);
    private static final EnchantmentLevelEntry SHULKER_BLADE = new EnchantmentLevelEntry(EnchantmentInit.SHULKER_BLADE, 1);
    private static final EnchantmentLevelEntry STUPIFY = new EnchantmentLevelEntry(EnchantmentInit.STUPIFY, 1);
    private static final EnchantmentLevelEntry UNTOUCHABLE1 = new EnchantmentLevelEntry(EnchantmentInit.UNTOUCHABLE, 1);
    private static final EnchantmentLevelEntry UNTOUCHABLE2 = new EnchantmentLevelEntry(EnchantmentInit.UNTOUCHABLE, 2);
    private static final EnchantmentLevelEntry UNTOUCHABLE3 = new EnchantmentLevelEntry(EnchantmentInit.UNTOUCHABLE, 3);
    private static final EnchantmentLevelEntry VOID_ESCAPE = new EnchantmentLevelEntry(EnchantmentInit.VOID_ESCAPE, 1);
    private static final EnchantmentLevelEntry WISDOM1 = new EnchantmentLevelEntry(EnchantmentInit.WISDOM, 1);
    private static final EnchantmentLevelEntry WISDOM2 = new EnchantmentLevelEntry(EnchantmentInit.WISDOM, 2);
    private static final EnchantmentLevelEntry WISDOM3 = new EnchantmentLevelEntry(EnchantmentInit.WISDOM, 3);

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
    {
        ItemStack stack = player.getStackInHand(hand);
        ItemStack mainHandStack = player.getMainHandStack();

        if (!world.isClient)
        {
            // Random items from treasure_bag.json
            for(int i = 0; i < 2; i++)
            {
                ItemStack treasure = TagInit.TREASURE_BAG.getRandom(random).getDefaultStack();
                world.spawnEntity(new ItemEntity(world, player.getX(), player.getY(), player.getZ(), treasure));
            }

            // Random enchanted book
            if(MoreGems.CONFIG.GENERAL.enableEnchantedBookDrop)
            {
                // Build a list of enchantments
                List<EnchantmentLevelEntry> enchantmentList = new ArrayList<>();
                enchantmentList.add(SILK_TOUCH);
                enchantmentList.add(BLINKING);
                enchantmentList.add(CREEPERLESS);
                enchantmentList.add(FASTER_OBSIDIAN);
                enchantmentList.add(FLOATING1);
                enchantmentList.add(FLOATING2);
                enchantmentList.add(LAVA_VIEW);
                enchantmentList.add(LIGHTNING);
                enchantmentList.add(QUICKENING);
                enchantmentList.add(RAZOR_SHARPNESS);
                enchantmentList.add(SHULKER_BLADE);
                enchantmentList.add(STUPIFY);
                enchantmentList.add(UNTOUCHABLE1);
                enchantmentList.add(UNTOUCHABLE2);
                enchantmentList.add(UNTOUCHABLE3);
                enchantmentList.add(VOID_ESCAPE);
                enchantmentList.add(WISDOM1);
                enchantmentList.add(WISDOM2);
                enchantmentList.add(WISDOM3);

                // Pick a random enchant from list
                int randomIndex = random.nextInt(enchantmentList.size());
                EnchantmentLevelEntry randomElement = enchantmentList.get(randomIndex);

                // Create a new book and give it the picked enchantment
                ItemStack book = new ItemStack(Items.ENCHANTED_BOOK);
                EnchantedBookItem.addEnchantment(book, randomElement);

                // Spawn the enchanted book
                world.spawnEntity(new ItemEntity(world, player.getX(), player.getY(), player.getZ(), book));
            }

            // Remove the treasure bag in hand
            mainHandStack.decrement(1);
        }

        return TypedActionResult.success(stack);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("item.more_gems.treasure_bag.tip1").formatted(Formatting.GREEN));
    }
}