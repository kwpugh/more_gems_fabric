package com.kwpugh.more_gems.items.gembag;

import com.google.common.collect.Sets;
import com.kwpugh.more_gems.init.ContainerInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

import java.util.Set;

public class GembagScreenHandler extends GenericContainerScreenHandler
{
    private final ScreenHandlerType<?> type;
    public static final Set<Item> SHULKER_BOXES;

    private final Inventory inventory;
    private final PlayerInventory playerInventory;
    public final int inventoryWidth = 9;
    public final int inventoryHeight = 6;

    static
    {
        SHULKER_BOXES = Sets.newHashSet(Items.SHULKER_BOX, Items.BLACK_SHULKER_BOX, Items.BLUE_SHULKER_BOX,
                Items.BROWN_SHULKER_BOX, Items.CYAN_SHULKER_BOX, Items.GRAY_SHULKER_BOX, Items.GREEN_SHULKER_BOX,
                Items.LIGHT_BLUE_SHULKER_BOX, Items.LIGHT_GRAY_SHULKER_BOX, Items.LIME_SHULKER_BOX,
                Items.MAGENTA_SHULKER_BOX, Items.ORANGE_SHULKER_BOX, Items.PINK_SHULKER_BOX, Items.RED_SHULKER_BOX,
                Items.WHITE_SHULKER_BOX, Items.YELLOW_SHULKER_BOX, Items.PURPLE_SHULKER_BOX);
    }

    public GembagScreenHandler(int syncId, PlayerInventory playerInventory)
    {
        this(syncId, playerInventory, new SimpleInventory(54));
    }

    public GembagScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory)
    {
        this(ContainerInit.GEMBAG_SCREEN_HANDLER, syncId, playerInventory, inventory);
    }

    protected GembagScreenHandler(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, Inventory inventory)
    {
        super(ScreenHandlerType.GENERIC_9X6, syncId, playerInventory, inventory, 6);
        this.type = type;
        this.inventory = inventory;
        this.playerInventory = playerInventory;

        checkSize(inventory, inventoryHeight * inventoryWidth);
        inventory.onOpen(playerInventory.player);
        setupSlots(false);
    }

    public void setupSlots(final boolean includeChestInventory)
    {
        int i = (this.inventoryHeight - 4) * 18;

        int n;
        int m;
        for(n = 0; n < this.inventoryHeight; ++n)
        {
            for(m = 0; m < 9; ++m)
            {
                this.addSlot(new BackpackLockedSlot(inventory, m + n * 9, 8 + m * 18, 18 + n * 18));
            }
        }

        for(n = 0; n < 3; ++n)
        {
            for(m = 0; m < 9; ++m)
            {
                this.addSlot(new BackpackLockedSlot(playerInventory, m + n * 9 + 9, 8 + m * 18, 103 + n * 18 + i));
            }
        }

        for(n = 0; n < 9; ++n)
        {
            this.addSlot(new BackpackLockedSlot(playerInventory, n, 8 + n * 18, 161 + i));
        }
    }

    public static class BackpackLockedSlot extends Slot
    {
        public BackpackLockedSlot(Inventory inventory, int index, int x, int y)
        {
            super(inventory, index, x, y);
        }

        @Override
        public boolean canTakeItems(PlayerEntity playerEntity)
        {
            return stackMovementIsAllowed(getStack());
        }

        @Override
        public boolean canInsert(ItemStack stack)
        {
            return stackMovementIsAllowed(stack);
        }

        // Prevents items that override canBeNested() from being inserted into backpack
        public boolean stackMovementIsAllowed(ItemStack stack)
        {
            return stack.getItem().canBeNested();
        }
    }

    @Override
    public ScreenHandlerType<?> getType() {
        return type;
    }

    // Shift-click disabled for now
    @Override
    public ItemStack transferSlot(PlayerEntity player, int index)
    {
        return ItemStack.EMPTY;
    }

    @Override
    public void onSlotClick(int slotId, int clickData, SlotActionType actionType, PlayerEntity playerEntity)
    {
        // Prevents single or shift-click while pack is open
        if (slotId >= 0)  // slotId < 0 are used for networking internals
        {
            ItemStack stack = getSlot(slotId).getStack();

            if(stack.getItem() instanceof GembagItem ||
                SHULKER_BOXES.contains(stack.getItem()))
            {
                // Return to caller with no action
                return;
            }
        }

        super.onSlotClick(slotId, clickData, actionType, playerEntity);
    }
}