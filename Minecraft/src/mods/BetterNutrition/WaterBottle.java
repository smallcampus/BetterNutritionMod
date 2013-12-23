package mods.BetterNutrition;

import java.util.Vector;

import mods.BetterNutrition.Nutrition.Nutrition;
import mods.BetterNutrition.Nutrition.NutritionStats;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WaterBottle extends ItemFood {

	final static int maxContent = 6;
	int curContent = 0;
	private Nutrition nutrition = new Nutrition(Nutrition.WATER,1000,100);
	
	public WaterBottle(){
		super(5000,0,0,false);
	}
	
	@Override
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        //--par1ItemStack.stackSize;
        //par3EntityPlayer.getFoodStats().addStats(this);
		NutritionStats n = par3EntityPlayer.getNutritionStats();
		System.out.println("WaterBottle: before water drank, level:"+n.getStats(Nutrition.WATER).getNutritionLevel()+"|buffer:"+n.getStats(Nutrition.WATER).getNutritionBuffer());
		n.addStats(nutrition);
		System.out.println("WaterBottle: after water drank, level:"+n.getStats(Nutrition.WATER).getNutritionLevel()+"|buffer:"+n.getStats(Nutrition.WATER).getNutritionBuffer());
        par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        return par1ItemStack;
    }
    
    public void registerIcons(IconRegister reg) { // Make sure to import IconRegister!
    	//if (itemID == Item.glassBottle.itemID) {
    		this.itemIcon = reg.registerIcon("betternutrition:waterBottle"); // You can also replace blockID and blockIcon with itemID and itemIcon
    	//}
    }
}
 