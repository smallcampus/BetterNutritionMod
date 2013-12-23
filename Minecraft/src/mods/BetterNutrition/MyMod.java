package mods.BetterNutrition;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid="betternutrition",name="BetterNutrition",version="v1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class MyMod {
	@Instance("myMod")
	MyMod instance;
	
	public static ItemFood waterBottle;
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		waterBottle = (ItemFood) new WaterBottle().setUnlocalizedName("water bottle").setCreativeTab(CreativeTabs.tabMisc);
		// define blocks

		//adding names
		//items
		LanguageRegistry.addName(waterBottle, "Water bottle");
	}
	
}
