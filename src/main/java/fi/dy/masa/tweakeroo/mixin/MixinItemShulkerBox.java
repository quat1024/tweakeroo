package fi.dy.masa.tweakeroo.mixin;

import org.spongepowered.asm.mixin.Mixin;
import fi.dy.masa.tweakeroo.config.FeatureToggle;
import fi.dy.masa.tweakeroo.tweaks.StackingTweaks;
import fi.dy.masa.tweakeroo.util.IItemStackLimit;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.item.ItemStack;

@Mixin(ItemShulkerBox.class)
public class MixinItemShulkerBox extends ItemBlock implements IItemStackLimit
{
    public MixinItemShulkerBox(Block block)
    {
        super(block);
    }

    @Override
    public int getItemStackLimit(ItemStack stack)
    {
        if (FeatureToggle.TWEAK_SHULKERBOX_STACKING.getBooleanValue() && StackingTweaks.shulkerBoxHasItems(stack) == false)
        {
            return 64;
        }

        // FIXME How to call the stack-sensitive version on the super class?
        return super.getItemStackLimit();
    }
}
