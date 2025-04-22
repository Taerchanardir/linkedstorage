package net.kyrptonaught.linkedstorage.inventory;

import net.kyrptonaught.linkedstorage.access.ISimpleInventoryMixinInterface;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Direction;

import me.jellysquid.mods.lithium.api.inventory.LithiumInventory;


public class LinkedInventory extends SimpleInventory implements SidedInventory, LithiumInventory{

    public LinkedInventory() {
        super(27);
    }

    @Override
    public int[] getAvailableSlots(Direction var1) {
        int[] result = new int[size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;

    }

    @Override
    public boolean canInsert(int var1, ItemStack var2, Direction var3) {
        return true;
    }

    @Override
    public boolean canExtract(int var1, ItemStack var2, Direction var3) {
        return true;
    }

    public LinkedInventory copy() {
        LinkedInventory copy = new LinkedInventory();

        for (int i = 0; i < this.size(); i++)
            copy.setStack(i, this.getStack(i).copy());

        return copy;
    }


    // lithium integrations. These functions are called by lithium
    @Override
    public DefaultedList<ItemStack> getInventoryLithium(){
      return this.stacks;
    }

    @Override
    public void setInventoryLithium(DefaultedList<ItemStack> inventory){
      ((ISimpleInventoryMixinInterface)this).setStacks(inventory);
    }
}