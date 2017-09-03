package net.mtesseract.mechanicraft.Block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOreCopper extends BlockMechaniCraft
{
    public BlockOreCopper()
    {
        super(Material.rock);
        setBlockName("oreCopper");
        setCreativeTab(CreativeTabs.tabMisc);
        setHardness(1.5f);
        setResistance(10f);
        setHarvestLevel("pickaxe", 1);
        setStepSound(soundTypeStone);
    }
}
