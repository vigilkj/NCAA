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
	private String[] regions = returnRegion();
	private String[] seeds = returnSeed();
	private String[] teamNames = returnTeamName();
	private String[] winPercentages = returnWinPercentage();
	private String[] regions = returnRegion();
	private String regionName;

	public Region(String regionName){
		this.regionName=regionName;
		simRoundOf64();
	}

	public void simRoundOf64(){
		for(int j=0; j<64; j++){
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 1){
				roundOf64[0]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 16){
				roundOf64[1]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 8){
				roundOf64[2]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 9){
				roundOf64[3]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 5){
				roundOf64[4]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 12){
				roundOf64[5]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 4){
				roundOf64[6]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 13){
				roundOf64[7]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 6){
				roundOf64[8]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 11){
				roundOf64[9]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 3){
				roundOf64[10]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 14){
				roundOf64[11]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 7){
				roundOf64[12]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 10){
				roundOf64[13]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 2){
				roundOf64[14]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
			if(regions[j].equalsIgnoreCase(this.regionName) && seeds[j] == 15){
				roundOf64[15]=Team(seeds[j], winPercentages[j], teamNames[j]);
			}
		}
	}

	public Team playBracket(){
		simRoundOf32();
		simRoundOf16();
		simRoundOf8();
		Game game = new Game(roundOf8[0],roundOf8[1]);
		return game.playGame();

	}

	public void simRoundOf32(){
		for(int i=0; i<16; i=i+2){
			Game game = new Game(roundOf64[i], roundOf64[i+2]);
			roundOf32[i] = game.playGame();
		}
	}

	public void simRoundOf16(){
		for(int i=0; i<8; i=i+2){
			Game game = new Game(roundOf32[i], roundOf32[i+2]);
			roundOf16[i] = game.playGame();
		}
	}

	public void simRoundOf8(){
		for(int i=0; i<4; i=i+2){
			Game game = new Game(roundOf16[i], roundOf16[i+2]);
			roundOf8[i] = game.playGame();
		}
	}



}