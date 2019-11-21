/**
 * A class to simuate a habitat
 * @author Rishabh
 *
 */
public class Simulation {
	
	/**
	 * Main Function
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Habitat newHabitat = new Habitat(20,20);	//Change parameters to change the size of the habitat
		
		newHabitat.generateHabitat();	//Randomly create a habitat based on the size
		
		newHabitat.printHabitat();		//print the habitat
	}

}
