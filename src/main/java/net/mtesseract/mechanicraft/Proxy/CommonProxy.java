package net.mtesseract.mechanicraft.Proxy;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.mtesseract.mechanicraft.Registry.MechaniCraftItems;

public class CommonProxy
{
    public void preInitialization(FMLPreInitializationEvent e)
    {
        MechaniCraftItems.RegisterItems();
    }

    public void initialization(FMLInitializationEvent e)
    {

    }

    public void postInitialization(FMLPostInitializationEvent e)
    {

    }
}
