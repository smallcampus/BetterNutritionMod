package mods.BetterNutrition.Nutrition;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.util.DamageSource;

public class NutritionStats {	
	private PlayerNutrition[] nutritions;
	
	public NutritionStats(){
		nutritions = new PlayerNutrition[Nutrient.NUM_TYPE];
		//TODO
		//nutritions[0] = new FoodPlayerNutrition();
		nutritions[Nutrient.WATER] = new WaterPlayerNutrition();
	}
	
	/**
	 * @param par1 Nutrition Type (Food =0, Water =1) TODO not implemented
	 * @param par2 Nutrition to be added
	 */
	public void addStats(Nutrient par2Nutrition){
		nutritions[par2Nutrition.getType()].addStats(par2Nutrition);
	}
	public PlayerNutrition getStats(Nutrient.Type type){
		return nutritions[Nutrient.getTypeId(type)];
	}
	
    /**
     * Handles the food game logic.
     */
    public void onUpdate(EntityPlayer par1EntityPlayer){
    	nutritions[1].onUpdate(par1EntityPlayer);
    }
}
