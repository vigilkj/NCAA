/**
 * Region
 *
 * 		Contains the teams in each region
 */
public class Region {
	
	private Team[] roundOf64 = new Team[16];
	private Team[] roundOf32 = new Team[8];
	private Team[] roundOf16 = new Team[4];
	private Team[] roundOf8 = new Team[2];
	private Team bracketWinner = new Team;

	public Region(String regionName){
		String[] regions = returnRegion();
		Stri
		for(int i=0; i<regions.length(); i++){
			if(regions[i].equalsIgnoreCase(regionName) && 
		}
	}


}