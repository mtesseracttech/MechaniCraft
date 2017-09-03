package net.mtesseract.mechanicraft.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.mtesseract.mechanicraft.Item.ItemBasicDust;
import net.mtesseract.mechanicraft.Item.ItemMechaniCraft;

public final class MechaniCraftItems
{
    public static final ItemMechaniCraft dustBasic = new ItemBasicDust();

    public static final void RegisterItems()
    {
        GameRegistry.registerItem(dustBasic, dustBasic.getUnlocalizedName());
    }
}
