package mods.BetterNutrition;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityCommandBlock;
import mods.BetterNutrition.Nutrition.Nutrient;;

public class BNCNutrition extends BNCommand {

	@Override
	public String getCommandName() {
		return "nutrition";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "Get your nutrition level.";
	}

	@Override
	public void ProcessPlayer(EntityPlayer player, String[] params) {
		player.addChatMessage("Water:"+player.getNutritionStats().getStats(Nutrient.Type.WATER).getNutritionLevel()+"cc");
	}

	@Override
	public void ProcessCommandBlock(TileEntityCommandBlock commandBlock,
			String[] params) {
		// TODO Auto-generated method stub
	}

	@Override
	public void ProcessServerConsole(ICommandSender console, String[] params) {
		// TODO Auto-generated method stub

	}

}
