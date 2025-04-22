package net.kyrptonaught.linkedstorage.access;

import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

public interface ISimpleInventoryMixinInterface{

  void setStacks(DefaultedList<ItemStack> stacks);

}
