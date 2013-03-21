public class Bracket {
	
	private Region midWest;
	private Region west;
	private Region south;
	private Region east;
	private Team mwChamp;
	private Team wChamp;
	private Team sChamp;
	private Team eChamp;
	private int rounds = 0;

	/**
	 * 
	 * Constructor
	 * 
	 */
	public Bracket(String midWest, String west, String south, Sring east){
		this.midWest = new Region(midWest);
		this.west = new Region(west);
		this.south = new Region(south);
		this.east = new Region(east);
	}


	/**
	 * simRound
	 *
	 *		starts the simulation of one round
	 */
	public void simRound(){
		if(rounds < 5 ){
			midWest.playRound();
			west.playRound();
			south.playRound();
			east.playRound();
			advanceRound();
		}
	}

	/**
	 * advanceRound
	 *
	 * 		advances the round of play one forward
	 */
	public void advanceRound(){
		this.rounds++;
	}









	/**
	 *
	 * Getters
	 * 
	 */
	public Region getMidWest(){
		return this.midWest;
	}

	public Region getWest(){
		return this.west;
	}

	public Region getSouth(){
		return this.south;
	}

	public Region getEast(){
		return this.east;
	}


}