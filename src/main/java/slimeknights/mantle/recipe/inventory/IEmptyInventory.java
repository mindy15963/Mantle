package slimeknights.mantle.recipe.inventory;

import net.minecraft.item.ItemStack;

/**
 * Base inventory for inventories that do not use items
 */
public interface IEmptyInventory extends IReadOnlyInventory {
  /** @deprecated unused method */
  @Deprecated
  @Override
  default ItemStack getStackInSlot(int index) {
    return ItemStack.EMPTY;
  }

  /** @deprecated unused method */
  @Deprecated
  @Override
  default boolean isEmpty() {
    return true;
  }

  /** @deprecated always 0, not useful */
  @Deprecated
  @Override
  default int getSizeInventory() {
    return 0;
  }
}
