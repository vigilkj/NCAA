/**
 * Team
 *
 * 		A class representing one team in the NCAA tournament bracket.
 */
public class Team {


	private int seed;
	private double winPer;
	private String name;
	private int currentWins;

	/**
	 *
	 * Constructors
	 * 
	 */
	public Team(int seed, double winPer, String name){
		setSeed(seed);
		setWinPer(winPer);
		setName(name);
		this.currentWins = 0;
	}




	/**
	 * addWin
	 *
	 * 		adds one win to a teams current wins
	 */
	public void addWin(){
		setCurrWins(this.currentWins + 1);
	}

	/**
	 *
	 * Getters and Setters
	 * 
	 */
	public int getSeed(){
		return this.seed;
	}
	public void setSeed(int seed){
		this.seed = seed;
	}
	public double getWinPer(){
		return this.seed;
	}
	public void setWinPer(double winPer){
		this.winPer = winPer;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getCurrWins(){
		return this.currentWins;
	}
	public void setCurrWins(int currWins){
		this.currentWins = currWins;
	}
}