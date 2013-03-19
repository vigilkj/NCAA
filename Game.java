/**
 * Game
 */
public class Game {
	
	String teamA, teamB;

	public static void main(String[] args) {
		winner(teamA,teamB);
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
	public String winner(String teamA, String teamB) {
		if(wAB > .50) {
			return teamA;
		}
		return teamB;

	}

}