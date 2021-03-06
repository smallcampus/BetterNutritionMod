package mods.BetterNutrition.Nutrition;


/**
 * 
 * @author smallcampus
 * @see PlayerNutrition
 */
public class Nutrient{
	public static enum Type{FOOD, WATER};
	public static final int FOOD = 0;
	public static final int WATER =1;
	public static int getTypeId(Type type){
		switch(type){
		case FOOD:
			return Nutrient.FOOD;
		default:
			return Nutrient.WATER;
		}
	}
	/**
	 * Number of nutrition type
	 */
	public static final int NUM_TYPE = 2;
	private int type;
	private int level;
	private int buffer;
	
	/**
	 * 
	 * @param par1 Nutrition type
	 * @param par2 Nutrition level
	 * @param par3 Nutrition buffer
	 */
	public Nutrient(int par1, int par2, int par3){
		this.type = par1; 
		this.level = par2;
		this.buffer = par3;
	}
	
	public int getType(){return this.type;}
	public int getNutritionLevel(){return this.level;}
	public int getNutritionBuffer(){return this.buffer;}
}