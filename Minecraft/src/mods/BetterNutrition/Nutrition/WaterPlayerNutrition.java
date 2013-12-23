package mods.BetterNutrition.Nutrition;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;

public final class WaterPlayerNutrition extends PlayerNutrition {

	static final int maxL = 1000;
	static final int maxB = 100;
	/**
	 * 
	 * @param par1 level
	 * @param par2 buffer
	 */
	public  WaterPlayerNutrition(int par1, int par2) {
		super(par1, maxL, par2, maxB);
	}
	
	public WaterPlayerNutrition(){this(maxL, maxB);}

	private int timer;
	
	@Override
	public void onUpdate(EntityPlayer par1EntityPlayer) {
		//int i = par1EntityPlayer.worldObj.difficultySetting;
        
		timer++;
		if(timer>100){
			if(this.buffer>0){
				this.buffer--;
			}else if(this.level>0){
				this.level--;
			}else{
				//TODO negative effect
			}
			timer=0;
		}

	}

}
