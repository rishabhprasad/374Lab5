/**
 * Class for the organisms the habitat
 * @author Rishabh
 *
 */
public class Organisms {
	
	/**
	 * Symbol to represent the organism in the Habitat
	 */
	char symbol;
	
	/**
	 * Initialize an instance of an organism
	 * @param symbolRep symbol representation of the specific organism
	 */
	public Organisms(char symbolRep)
	{
		symbol = symbolRep;
	}
	
	/**
	 * Returns the symbol representation of the organism
	 * @return symbol the symbol of the organism
	 */
	public char getSymbol()
	{
		return symbol;
	}
}
