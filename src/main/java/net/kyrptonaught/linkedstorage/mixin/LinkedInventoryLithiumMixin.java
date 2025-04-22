package net.kyrptonaught.linkedstorage.mixin;

/* not needed

import me.jellysquid.mods.lithium.api.inventory.LithiumInventory;
import net.fabricmc.fabric.mixin.transfer.SimpleInventoryMixin;
import net.kyrptonaught.linkedstorage.inventory.LinkedInventory;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


//@Mixin(SimpleInventory.class)
//abstract class SimpleInventoryMixin{
//  @Shadow
//  public DefaultedList<ItemStack> stacks; // un-finalling this unfinals the original in the parent too (?), what does that do to code efficiency?
//
//  protected SimpleInventoryMixin(DefaultedList<ItemStack> stacks){
//    this.stacks=stacks;
//    throw new RuntimeException("LinkedInventory SimpleInventoryMixin constructor must never be called, it is only here for make compilation work");
//  }
//}

// Mixing into a class from this same mod, in order to be able to use @Shadow.
@Mixin(LinkedInventory.class)
//public abstract class LinkedInventoryLithiumMixin extends SimpleInventoryMixin implements LithiumInventory{
public class LinkedInventoryLithiumMixin extends SimpleInventory implements LithiumInventory{
  //protected LinkedInventoryLithiumMixin(DefaultedList<ItemStack> stacks){
  //  super(stacks);
  //  throw new RuntimeException("LinkedInventory LinkedInventoryLithiumMixin constructor must never be called");
  //}
//public abstract class LinkedInventoryLithiumMixin implements LithiumInventory{

  //@Shadow // cannot get shadow to see stacks field in SimpleInventory
  //public DefaultedList<ItemStack> stacks;

  //public LinkedInventoryLithiumMixin(DefaultedList<ItemStack> stacks){
  //  this.stacks=stacks;
  //}
  // I don't think this points at the original field in SimpleInventory

  //protected LinkedInventoryLithiumMixin(DefaultedList<ItemStack> stacks){
  //  this.stacks=stacks;
  //}
  // compiler cannot find target for shadow?


  @Override
  public DefaultedList<ItemStack> getInventoryLithium() {
    //LinkedInventory li=(LinkedInventory)(Object)this;
    //return li.stacks;
    return this.stacks;
  }


  @Override
  public void setInventoryLithium(DefaultedList<ItemStack> inventory){
    //LinkedInventory li=(LinkedInventory)(Object)this;
    this.stacks=inventory;
    //li.stacks=inventory;
  }


  // nothing is red!, will it work ?
  // would an accesswidener or accessor be better?


}



// Example:
//https://www.reddit.com/r/fabricmc/comments/kfrsq7/mixins_how_to_shadow_a_variablemethod_from_a/?rdt=51848
// This example has two mixin classes in the same file, without ide complaining that 'should be declared in a file named'...
// I have seen other exapmles of this working for other people but not in my projects, what's the trick?
// ... lithoum seems to do this by having all the different accessor @Mixin classes inside a holding class

/ *
@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin{
  @Shadow public abstract boolean hasStatusEffect(StatusEffect effect);
  @Shadow public abstract StatusEffectInstance getStatusEffect(StatusEffect effect);
}

@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityMixin extends LivingEntityMixin{

  @Inject(method = "updateNausea()V", at = @At(value = "TAIL"))
  private void injection(CallbackInfo ci){
    if (this.hasStatusEffect(StatusEffects.NAUSEA) && this.getStatusEffect(StatusEffects.NAUSEA).getDuration() > 60) {
      // do something
    }
  }
}
* /

*/