
public class Population {
	
	
	public static void main (String [] args) {
		
		int currPopulation = 312032486; 
		final int secInYear = 24 * 60 * 60  * 365;
		int newBirths = secInYear / 7;
		int deaths = secInYear / 13;
		
		for (int i = 0; i < 5; i++) {
		
			currPopulation = ((currPopulation + newBirths) - deaths);
			System.out.println("Population increase in year " + (i+1) + " is: " + currPopulation);
		}
		
	}

}
