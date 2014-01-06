package mods.BetterNutrition.Nutrition;

import net.minecraft.entity.player.EntityPlayer;

/**
 * 
 * @author smallcampus
 * @see net.minecraft.util.FoodStats
 * @see mods.BetterNutrition.Nutrition.Nutrient
 */
public abstract class PlayerNutrition {
	protected int level;
	private int maxLevel;
	protected int buffer;
	private int maxBuffer;
	
	/**
	 * 
	 * @param par1 level
	 * @param par2 maxLevel
	 * @param par3 buffer
	 * @param par4 maxBuffer
	 */
	protected PlayerNutrition(int par1,int par2,int par3,int par4){
		//TODO no error checking
		this.level = par1;
		this.maxLevel = par2;
		this.buffer = par3;
		this.maxBuffer = par4;
	}
	
	/**
	 * @param par1 Nutrition Level
	 * @param par2 Nutrition buffer
	 */
	public void addStats(int par1, int par2){
		this.level = Math.min(par1+this.level, maxLevel);
		this.buffer = Math.min(par2+this.buffer, maxBuffer);
	}
	
	public void addStats(Nutrient par1Nutrition){
		this.addStats(par1Nutrition.getNutritionLevel(),par1Nutrition.getNutritionBuffer());
	}
	
	public int getNutritionLevel(){return this.level;}
	public int getNutritionBuffer(){return this.buffer;}
	
    /**
     * If NutritionLevel is not max.
     */
    public boolean needNutrition(){
        return this.level < this.maxLevel;
    }
    
    public boolean isOverBuffer(){
    	return this.buffer>=maxBuffer;
    }
	
    /**
     * Handles the food game logic.
     */
    public abstract void onUpdate(EntityPlayer par1EntityPlayer);
}
