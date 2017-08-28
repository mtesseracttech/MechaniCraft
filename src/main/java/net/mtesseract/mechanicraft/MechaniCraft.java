package net.mtesseract.mechanicraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="mechanicraft", name = "MechaniCraft", version = "1.0")
public class MechaniCraft
{
    @Instance public static MechaniCraft instance;

    @EventHandler
    public static void PreInitialization(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void Initialization(FMLInitializationEvent event){

    }

    @EventHandler
    public static void PostInitialization(FMLPostInitializationEvent event){

    }

}
