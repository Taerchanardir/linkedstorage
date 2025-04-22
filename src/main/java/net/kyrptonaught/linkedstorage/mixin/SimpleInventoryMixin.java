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
  // THIS is how you write to a final...
  // mixin into the class containing the final field
  // use an interface to call get/set methods in the mixin
  // it was an adventure getting here...

  public SimpleInventoryMixin(DefaultedList<ItemStack> stacks){
    this.stacks=stacks;
    //throw new RuntimeException("Do not call <init>SimpleInventoryMixin(!)");
  }

  //@Override don't need reading is ok
  //public DefaultedList<ItemStack> getStacks(){
  //  return this.stacks;
  //}

  @Override
  public void setStacks(DefaultedList<ItemStack> stacks){
    this.stacks=stacks;
  }

}
