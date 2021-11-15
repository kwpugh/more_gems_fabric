package com.kwpugh.more_gems.items.special;

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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TreasureBag extends Item
{
    public TreasureBag(Settings settings)
    {
        super(settings);
    }

    Random random = new Random();

    private static final EnchantmentLevelEntry SILK_TOUCH = new EnchantmentLevelEntry(Enchantments.SILK_TOUCH, 1);
    private static final EnchantmentLevelEntry EFFICIENCY5 = new EnchantmentLevelEntry(Enchantments.EFFICIENCY, 5);
    private static final EnchantmentLevelEntry SHARPNESS5 = new EnchantmentLevelEntry(Enchantments.SHARPNESS, 5);
    private static final EnchantmentLevelEntry FORTUNE3 = new EnchantmentLevelEntry(Enchantments.FORTUNE, 3);
    private static final EnchantmentLevelEntry LOOTING3 = new EnchantmentLevelEntry(Enchantments.LOOTING, 3);
    private static final EnchantmentLevelEntry INFINITY1 = new EnchantmentLevelEntry(Enchantments.INFINITY, 1);
    private static final EnchantmentLevelEntry UNBREAKING3 = new EnchantmentLevelEntry(Enchantments.UNBREAKING, 3);
    private static final EnchantmentLevelEntry BLINKING1 = new EnchantmentLevelEntry(EnchantmentInit.BLINKING, 1);
    private static final EnchantmentLevelEntry CREEPERLESS1 = new EnchantmentLevelEntry(EnchantmentInit.CREEPERLESS, 1);
    private static final EnchantmentLevelEntry FASTER_OBSIDIAN1 = new EnchantmentLevelEntry(EnchantmentInit.FASTER_OBSIDIAN, 1);
    private static final EnchantmentLevelEntry FLOATING1 = new EnchantmentLevelEntry(EnchantmentInit.FLOATING, 1);
    private static final EnchantmentLevelEntry FLOATING2 = new EnchantmentLevelEntry(EnchantmentInit.FLOATING, 2);
    private static final EnchantmentLevelEntry LAVA_VIEW1 = new EnchantmentLevelEntry(EnchantmentInit.LAVA_VIEW, 1);
    private static final EnchantmentLevelEntry LIGHTNING1 = new EnchantmentLevelEntry(EnchantmentInit.LIGHTNING, 1);
    private static final EnchantmentLevelEntry LIGHTNING2 = new EnchantmentLevelEntry(EnchantmentInit.LIGHTNING, 2);
    private static final EnchantmentLevelEntry LIGHTNING3 = new EnchantmentLevelEntry(EnchantmentInit.LIGHTNING, 3);
    private static final EnchantmentLevelEntry LIGHTNING4 = new EnchantmentLevelEntry(EnchantmentInit.LIGHTNING, 4);
    private static final EnchantmentLevelEntry LIGHTNING5 = new EnchantmentLevelEntry(EnchantmentInit.LIGHTNING, 5);
    private static final EnchantmentLevelEntry QUICKENING1 = new EnchantmentLevelEntry(EnchantmentInit.QUICKENING, 1);
    private static final EnchantmentLevelEntry QUICKENING2 = new EnchantmentLevelEntry(EnchantmentInit.QUICKENING, 2);
    private static final EnchantmentLevelEntry QUICKENING3 = new EnchantmentLevelEntry(EnchantmentInit.QUICKENING, 3);
    private static final EnchantmentLevelEntry QUICKENING4 = new EnchantmentLevelEntry(EnchantmentInit.QUICKENING, 4);
    private static final EnchantmentLevelEntry QUICKENING5 = new EnchantmentLevelEntry(EnchantmentInit.QUICKENING, 5);
    private static final EnchantmentLevelEntry RAZOR_SHARPNESS1 = new EnchantmentLevelEntry(EnchantmentInit.RAZOR_SHARPNESS, 1);
    private static final EnchantmentLevelEntry SHULKER_BLADE1 = new EnchantmentLevelEntry(EnchantmentInit.SHULKER_BLADE, 1);
    private static final EnchantmentLevelEntry STUPIFY1 = new EnchantmentLevelEntry(EnchantmentInit.STUPIFY, 1);
    private static final EnchantmentLevelEntry UNTOUCHABLE1 = new EnchantmentLevelEntry(EnchantmentInit.UNTOUCHABLE, 1);
    private static final EnchantmentLevelEntry UNTOUCHABLE2 = new EnchantmentLevelEntry(EnchantmentInit.UNTOUCHABLE, 2);
    private static final EnchantmentLevelEntry UNTOUCHABLE3 = new EnchantmentLevelEntry(EnchantmentInit.UNTOUCHABLE, 3);
    private static final EnchantmentLevelEntry VOID_ESCAPE1 = new EnchantmentLevelEntry(EnchantmentInit.VOID_ESCAPE, 1);
    private static final EnchantmentLevelEntry WISDOM1 = new EnchantmentLevelEntry(EnchantmentInit.WISDOM, 1);
    private static final EnchantmentLevelEntry WISDOM2 = new EnchantmentLevelEntry(EnchantmentInit.WISDOM, 2);
    private static final EnchantmentLevelEntry WISDOM3 = new EnchantmentLevelEntry(EnchantmentInit.WISDOM, 3);
    private static final EnchantmentLevelEntry BENEVOLENCE1 = new EnchantmentLevelEntry(EnchantmentInit.BENEVOLENCE, 1);
    private static final EnchantmentLevelEntry MINING_HELPER1 = new EnchantmentLevelEntry(EnchantmentInit.MINING_HELPER, 1);

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
                enchantmentList.add(EFFICIENCY5);
                enchantmentList.add(SHARPNESS5);
                enchantmentList.add(FORTUNE3);
                enchantmentList.add(LOOTING3);
                enchantmentList.add(INFINITY1);
                enchantmentList.add(UNBREAKING3);
                enchantmentList.add(BLINKING1);
                enchantmentList.add(CREEPERLESS1);
                enchantmentList.add(FASTER_OBSIDIAN1);
                enchantmentList.add(FLOATING1);
                enchantmentList.add(FLOATING2);
                enchantmentList.add(LAVA_VIEW1);
                enchantmentList.add(LIGHTNING1);
                enchantmentList.add(LIGHTNING2);
                enchantmentList.add(LIGHTNING3);
                enchantmentList.add(LIGHTNING4);
                enchantmentList.add(LIGHTNING5);
                enchantmentList.add(QUICKENING1);
                enchantmentList.add(QUICKENING2);
                enchantmentList.add(QUICKENING3);
                enchantmentList.add(QUICKENING4);
                enchantmentList.add(QUICKENING5);
                enchantmentList.add(RAZOR_SHARPNESS1);
                enchantmentList.add(SHULKER_BLADE1);
                enchantmentList.add(STUPIFY1);
                enchantmentList.add(UNTOUCHABLE1);
                enchantmentList.add(UNTOUCHABLE2);
                enchantmentList.add(UNTOUCHABLE3);
                enchantmentList.add(VOID_ESCAPE1);
                enchantmentList.add(WISDOM1);
                enchantmentList.add(WISDOM2);
                enchantmentList.add(WISDOM3);
                enchantmentList.add(BENEVOLENCE1);
                enchantmentList.add(MINING_HELPER1);

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