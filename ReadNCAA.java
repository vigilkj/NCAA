/**
 * ReadNCAA
 *
 * 		Kyle Vigil
 * Reads the file of seeds
 */
import java.util.Scanner;
import java.io.*;

public class ReadNCAA {

	private String[] seed = new String[64];
	private String[] teamName = new String[64];
	private String[] winPercentage = new String[64];
	private String[] regions = new String[64];



	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new File("ncaa_data_2013.csv"));

		while (reader.hasNextLine()){
			String next = reader.nextLine();
			String[] values = next.split(",");

			for(String s : values) {
				System.out.print(s + " ");
			}

			System.out.println();
		}
	}

	public String[] returnValues(){
		Scanner reader = new Scanner(new File("ncaa_data_2013.csv"));

		while (reader.hasNextLine()){
			String next = reader.nextLine();
			String[] values = next.split(",");
		}
		return values;
	}

	public String[] returnSeed(){
		String[] values = returnValues();
		for(int i=1; i<values.length()-5; i=i+5){
			seed.add(values[i]);
		}
		return seed;
	}

	public String[] returnTeamName(){
		String[] values = returnValues();
		for(int i=2; i<values.length()-5; i=i+5){
			teamName.add(values[i]);
		}
		return teamName;
	}

	public String[] returnWinPercentage(){
		String[] values = returnValues();
		for(int i=3; i<values.length()-5; i=i+5){
			winPercentage.add(values[i]);
		}
		return winPercentage;
	}

	public String[] returnRegion(){
		String[] values = returnValues();
		for(int i=4; i<values.length()-5; i=i+5){
			regions.add(values[i]);
		}
		return regions;
	}


}