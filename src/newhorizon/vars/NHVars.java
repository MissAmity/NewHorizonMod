package newhorizon.vars;

import arc.math.Rand;
import mindustry.world.Tile;

public class NHVars{
	public static NHWorldVars world = new NHWorldVars();
	public static NHCtrlVars ctrl = new NHCtrlVars();
	
	public static Rand rand = new Rand();
	public static Tile tmpTile;
	
	public static void reset(){
		ctrl = new NHCtrlVars();
		world.clear();
//		for(Teams.TeamData data : Vars.state.teams.present){
//			allTeamSeq.add(data.team);
//		}
//
//		Log.info(Vars.state.teams.present.size);
//		Log.info(allTeamSeq.size);
	}
	
	public static void resetCtrl(){
		ctrl = new NHCtrlVars();
	}
}
