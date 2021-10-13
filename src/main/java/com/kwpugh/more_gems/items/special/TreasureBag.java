package com.kwpugh.more_gems.items.special;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    private static final EnchantmentLevelEntry INFINITY = new EnchantmentLevelEntry(Enchantments.INFINITY, 1);
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
            // Build a list of enchantments
            List<EnchantmentLevelEntry> entryList = new ArrayList<>();
            entryList.add(SILK_TOUCH);
            entryList.add(INFINITY);
            entryList.add(BLINKING);
            entryList.add(CREEPERLESS);
            entryList.add(FASTER_OBSIDIAN);
            entryList.add(FLOATING1);
            entryList.add(FLOATING2);
            entryList.add(LAVA_VIEW);
            entryList.add(LIGHTNING);
            entryList.add(QUICKENING);
            entryList.add(RAZOR_SHARPNESS);
            entryList.add(SHULKER_BLADE);
            entryList.add(STUPIFY);
            entryList.add(UNTOUCHABLE1);
            entryList.add(UNTOUCHABLE2);
            entryList.add(UNTOUCHABLE3);
            entryList.add(VOID_ESCAPE);
            entryList.add(WISDOM1);
            entryList.add(WISDOM2);
            entryList.add(WISDOM3);

            // Pick a random enchant from list
            int randomIndex = random.nextInt(entryList.size());
            EnchantmentLevelEntry randomElement = entryList.get(randomIndex);

            // Create a new book and give it the picked enchantment
            ItemStack book = new ItemStack(Items.ENCHANTED_BOOK);
            EnchantedBookItem.addEnchantment(book, randomElement);

            // Pick a random item from the treasure_bag.json, using a json allows for additions via datapacks
            ItemStack treasure = TagInit.TREASURE_BAG.getRandom(random).getDefaultStack();

            // Spawn the enchant book and the random treasure item
            world.spawnEntity(new ItemEntity(world, player.getX(), player.getY(), player.getZ(), book));
            world.spawnEntity(new ItemEntity(world, player.getX(), player.getY(), player.getZ(), treasure));

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