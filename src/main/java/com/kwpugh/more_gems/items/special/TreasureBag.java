package com.kwpugh.more_gems.items.special;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.init.TagInit;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.Registries;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class TreasureBag extends Item
{
    public TreasureBag(Settings settings)
    {
        super(settings);
    }

    private final Random random = Random.create();
    private static final List<EnchantmentLevelEntry> enchantmentList = new ArrayList<>();

    public static void initTreasure()
    {
        createEntry(Enchantments.SILK_TOUCH, 1);
        createEntry(Enchantments.EFFICIENCY, 4);
        createEntry(Enchantments.EFFICIENCY, 5);
        createEntry(Enchantments.SHARPNESS, 4);
        createEntry(Enchantments.SHARPNESS, 5);
        createEntry(Enchantments.FORTUNE, 3);
        createEntry(Enchantments.LOOTING, 3);
        createEntry(Enchantments.INFINITY, 1);
        createEntry(Enchantments.UNBREAKING, 2);
        createEntry(Enchantments.SWIFT_SNEAK, 3);

        if(MoreGems.CONFIG.GENERAL.enableAttracting)
        {
            createEntry(EnchantmentInit.ATTRACTING, 1);
            createEntry(EnchantmentInit.ATTRACTING, 2);
            createEntry(EnchantmentInit.ATTRACTING, 3);
        }
        if(MoreGems.CONFIG.GENERAL.enableBenevolence) createEntry(EnchantmentInit.BENEVOLENCE, 1);
        if(MoreGems.CONFIG.GENERAL.enableBlinking) createEntry(EnchantmentInit.BLINKING, 1);
        if(MoreGems.CONFIG.GENERAL.enableBound) createEntry(EnchantmentInit.BOUND, 1);
        if(MoreGems.CONFIG.GENERAL.enableClimbing) createEntry(EnchantmentInit.CLIMBING, 1);
        if(MoreGems.CONFIG.GENERAL.enableCreeperless) createEntry(EnchantmentInit.CREEPERLESS, 1);
        if(MoreGems.CONFIG.GENERAL.enableFloating)
        {
            createEntry(EnchantmentInit.FLOATING, 1);
            createEntry(EnchantmentInit.FLOATING, 2);
        }
        if(MoreGems.CONFIG.GENERAL.enableFreezeProtection) createEntry(EnchantmentInit.FREEZE_PROTECTION, 1);
        if(MoreGems.CONFIG.GENERAL.enableGliding) createEntry(EnchantmentInit.GLIDING, 1);
        if(MoreGems.CONFIG.GENERAL.enableGuiding) createEntry(EnchantmentInit.GUIDING, 1);
        if(MoreGems.CONFIG.GENERAL.enableLavaView) createEntry(EnchantmentInit.LAVA_VIEW, 1);
        if(MoreGems.CONFIG.GENERAL.enableLightning)
        {
            createEntry(EnchantmentInit.LIGHTNING, 1);
            createEntry(EnchantmentInit.LIGHTNING, 2);
            createEntry(EnchantmentInit.LIGHTNING, 3);
            createEntry(EnchantmentInit.LIGHTNING, 4);
            createEntry(EnchantmentInit.LIGHTNING, 5);
        }
        if(MoreGems.CONFIG.GENERAL.enableMercyKill) createEntry(EnchantmentInit.MERCY_KILL, 1);
        if(MoreGems.CONFIG.GENERAL.enableMight)
        {
            createEntry(EnchantmentInit.MIGHT, 1);
            createEntry(EnchantmentInit.MIGHT, 2);
            createEntry(EnchantmentInit.MIGHT, 3);
        }
        if(MoreGems.CONFIG.GENERAL.enableMiningHelper) createEntry(EnchantmentInit.MINING_HELPER, 1);
        if(MoreGems.CONFIG.GENERAL.enableObsidinator) createEntry(EnchantmentInit.OBSIDIANATOR, 1);
        if(MoreGems.CONFIG.GENERAL.enableQuickening)
        {
            createEntry(EnchantmentInit.QUICKENING, 1);
            createEntry(EnchantmentInit.QUICKENING, 2);
            createEntry(EnchantmentInit.QUICKENING, 3);
            createEntry(EnchantmentInit.QUICKENING, 4);
            createEntry(EnchantmentInit.QUICKENING, 5);
        }
        if(MoreGems.CONFIG.GENERAL.enableRazorSharpness) createEntry(EnchantmentInit.RAZOR_SHARPNESS, 1);
        if(MoreGems.CONFIG.GENERAL.enableShulkerBlade) createEntry(EnchantmentInit.SHULKER_BLADE, 1);
        if(MoreGems.CONFIG.GENERAL.enableStout)
        {
            createEntry(EnchantmentInit.STOUT, 1);
            createEntry(EnchantmentInit.STOUT, 2);
            createEntry(EnchantmentInit.STOUT, 3);
        }
        if(MoreGems.CONFIG.GENERAL.enableStupefy)
        {
            createEntry(EnchantmentInit.STUPEFY, 1);
            createEntry(EnchantmentInit.STUPEFY, 2);
            createEntry(EnchantmentInit.STUPEFY, 3);
        }
        if(MoreGems.CONFIG.GENERAL.enableUntouchable)
        {
            createEntry(EnchantmentInit.UNTOUCHABLE, 1);
            createEntry(EnchantmentInit.UNTOUCHABLE, 2);
            createEntry(EnchantmentInit.UNTOUCHABLE, 3);
            createEntry(EnchantmentInit.UNTOUCHABLE, 4);
        }
        if(MoreGems.CONFIG.GENERAL.enableVoidEscape) createEntry(EnchantmentInit.VOID_ESCAPE, 1);
        if(MoreGems.CONFIG.GENERAL.enableWisdom)
        {
            createEntry(EnchantmentInit.WISDOM, 1);
            createEntry(EnchantmentInit.WISDOM, 2);
            createEntry(EnchantmentInit.WISDOM, 3);
        }
    }

    public static void createEntry(Enchantment enchantment, int level)
    {
        EnchantmentLevelEntry entry = new EnchantmentLevelEntry(enchantment, level);
        enchantmentList.add(entry);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
    {
        ItemStack stack = player.getStackInHand(hand);
        ItemStack mainHandStack = player.getMainHandStack();
        ItemStack treasure;

        // Get the default item string from config and cast to ItemStack
        Identifier id = Identifier.tryParse(MoreGems.CONFIG.GENERAL.defaultDrop);
        ItemStack defaultStack = Registries.ITEM.get(id).getDefaultStack();

        if (!world.isClient)
        {
            // Select and drop random items from bag
            for(int i = 0; i < 2; i++)
            {
                // Grab a random item from json
                treasure = Registries.ITEM.getEntryList(TagInit.TREASURE_BAG).flatMap((items) ->
                        items.getRandom(random)).map((itemEntry) ->   // what is an AbstractRandom?
                        (itemEntry.value()).getDefaultStack()).orElse(defaultStack);

                // Spawn the item
                world.spawnEntity(new ItemEntity(world, player.getX(), player.getY(), player.getZ(), treasure));
            }

            // Random enchanted book
            if(MoreGems.CONFIG.GENERAL.enableEnchantedBookDrop)
            {
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
        tooltip.add(Text.translatable("item.more_gems.treasure_bag.tip1").formatted(Formatting.GREEN));
    }
}