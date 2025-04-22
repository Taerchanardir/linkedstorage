package net.kyrptonaught.linkedstorage.access;

import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

public interface ISimpleInventoryMixinInterface{

  //DefaultedList<ItemStack> getStacks();

  void setStacks(DefaultedList<ItemStack> stacks);

}
