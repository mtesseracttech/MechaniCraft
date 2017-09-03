package net.mtesseract.mechanicraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.mtesseract.mechanicraft.Proxy.CommonProxy;
import net.mtesseract.mechanicraft.Reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class MechaniCraft
{
    @Instance
    public static MechaniCraft instance = new MechaniCraft();

    @SidedProxy(clientSide="net.mtesseract.mechanicraft.Proxy.ClientProxy", serverSide="net.mtesseract.mechanicraft.Proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public static void preInitialization(FMLPreInitializationEvent e)
    {
        proxy.preInitialization(e);
    }

    @EventHandler
    public static void initialization(FMLInitializationEvent e)
    {
        proxy.initialization(e);
    }

    @EventHandler
    public static void postInitialization(FMLPostInitializationEvent e)
    {
        proxy.postInitialization(e);
    }

}
