/**
 * Class for the Animals from the Organisms
 * @author Rishabh
 *
 */
public class Animals extends Organisms{

	/**
	 * Used to check if an animal is carnivorous or not
	 */
	boolean carnivore;
	
	String foodType;
	
	/**
	 * Initialize an instance of a carnivore
	 * @param symbolRep symbol representation of the specific organism
	 * @param foodPref represents whether an animal is a carnivore or herbivore
	 */
	public Animals(char symbolRep, String foodPref) {
		super(symbolRep);
		
		foodType = foodPref;
		
		if (foodPref == "carnivore")
		{
			carnivore = true;
		}
		else
		{
			carnivore = false;
		}
		
	}
	
	/**
	 * Used to return what type of food the animal eats
	 * @return foodType holds what type of food the animal eats
	 */
	public String getFoodType()
	{
		return foodType;
	}
	
	/**
	 * Check whether the animal is carnivorous or not
	 * @return
	 */
	boolean checkFoodPreference()
	{
		return carnivore;
	}
}

