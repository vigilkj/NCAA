/**
 * Game
 */
public class Game {
	
	String teamA, teamB;

	public static void main(String[] args) {
		playGame(teamA,teamB);
	}
	public Game(String teamA, String teamB) {
		this.teamB;
		this.teamA;
	}
	/**
	 * Winner
	 * @param  teamA - first team
	 * @param  teamB - second team
	 * @return       the winner based upon the win percent of teamA when playing teamB
	 */
	public String playGame(String teamA, String teamB) {
		double wAB = (teamA.getWinPer*(1-teamB.getWinPer))/(teamA.getWinPer*(1-teamB.getWinPer) + teamB.getWinPer*(1-teamA.getWinPer));
		if(wAB > teamA.getWinPer) {
			return teamA;
		}
		return teamB;
	}

}