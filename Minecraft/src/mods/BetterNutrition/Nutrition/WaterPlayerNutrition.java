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
		if(timer>240){
			if(this.buffer>0){
				this.buffer-=10;
			}else if(this.buffer==0){
				par1EntityPlayer.addChatMessage("You feel a little dry.");
			}else if(this.level>0){
				this.level-=10;
			}else{
				//TODO negative effect
			}
			timer=0;
		}

	}

}
