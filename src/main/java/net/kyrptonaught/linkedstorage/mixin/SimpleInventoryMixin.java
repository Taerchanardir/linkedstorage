package net.kyrptonaught.linkedstorage.mixin;

import net.kyrptonaught.linkedstorage.access.ISimpleInventoryMixinInterface;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SimpleInventory.class)
public class SimpleInventoryMixin implements ISimpleInventoryMixinInterface{
  @Shadow
  @Mutable
  @Final
  public DefaultedList<ItemStack> stacks;

  public SimpleInventoryMixin(DefaultedList<ItemStack> stacks){
    this.stacks=stacks;
  }

  @Override
  public void setStacks(DefaultedList<ItemStack> stacks){
    this.stacks=stacks;
  }

}
