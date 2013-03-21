/**
 * Game
 */
public class Game {
	
	private Team teamA, teamB;

	public Game(Team teamA, Team teamB) {
		this.teamA = teamA;
		this.teamB = teamB;
	}
	/**
	 * Winner
	 * @param  teamA - first team
	 * @param  teamB - second team
	 * @return       the winner based upon the win percent of teamA when playing teamB
	 */
	public Team playGame() {
		double wAB = (this.teamA.getWinPer*(1-this.teamB.getWinPer))/(this.teamA.getWinPer*(1-this.teamB.getWinPer) + this.teamB.getWinPer*(1-this.teamA.getWinPer));
		if(wAB >= 0.0 + (double)(Math.random()*1.0)) {
			return this.teamA;
		}
		return this.teamB;
	}

}