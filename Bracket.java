public class Bracket {
	
	private Region midWest;
	private Region west;
	private Region south;
	private Region east;
	private int rounds = 0;

	/**
	 * 
	 * Constructor
	 * 
	 */
	public Bracket(Region mw, Region w, Region s, Region e){
		setMidWest(mw);
		setWest(w);
		setSouth(s);
		setEast(e);
	}


	/**
	 * simRound
	 *
	 *		starts the simulation of one round
	 */
	public void simRound(){
		midWest.playRound();
		west.playRound();
		south.playRound();
		east.playRound();
	}









	/**
	 *
	 * Getters and Setters
	 * 
	 */
	public Region getMidWest(){
		return this.midWest;
	}
	public void setMidWest(Region mw){
		this.midWest = mw;
	}
	public Region getWest(){
		return this.west;
	}
	public void setWest(Region w){
		this.west = w;
	}
	public Region getSouth(){
		return this.south;
	}
	public void setSouth(Region s){
		this.south = s;
	}
	public Region getEast(){
		return this.east;
	}
	public void setEast(Region e){
		this.east = e;
	}

}