package net.mtesseract.mechanicraft.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.mtesseract.mechanicraft.Block.BlockMechaniCraft;
import net.mtesseract.mechanicraft.Block.BlockOreCopper;

public final class MechaniCraftBlocks
{
    public static BlockMechaniCraft oreBlock;

    public static final void RegisterBlocks()
    {
        oreBlock = new BlockOreCopper();
        GameRegistry.registerBlock(oreBlock, oreBlock.getUnlocalizedName());
    }
}
