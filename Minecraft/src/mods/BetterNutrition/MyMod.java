package mods.BetterNutrition;

import net.minecraft.client.Minecraft;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid="betternutrition",name="BetterNutrition",version="v1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class MyMod {
	@Instance("myMod")
	MyMod instance;
	
	public static ItemFood waterBottle;
	protected ServerCommandManager commandManager;
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		waterBottle = (ItemFood) new WaterBottle(5000).setUnlocalizedName("waterBottle").setCreativeTab(CreativeTabs.tabMisc);
		// define blocks

		//adding names
		//items
		LanguageRegistry.addName(waterBottle, "Water bottle");
	}
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
		commandManager = (ServerCommandManager) MinecraftServer.getServer().getCommandManager();
	 	commandManager.registerCommand(new BNCNutrition());
	 	
	}
	
}
