/**
 * Class to generate a simulation of the Sask Wildlife Habitat
 * @author Rishabh
 *
 */
public class Habitat {

	/**
	 * Holds the size of the rows of the 2D Array
	 */
	int row;
	
	/**
	 * Hold the size of the columns of the 2d Array
	 */
	int col;
	
	/**
	 * Holds the maximum number of organisms that can be
	 * present in the habitat
	 */
	int maxOrganisms;
	
	/**
	 * Holds the number of organisms in the habitat
	 */
	int numOfOrganisms;
	
	
	/**
	 * 2D array to hold the habitat
	 */
	Organisms habitat[][];
	
	/**
	 * Initializes the 2D array for the habitat
	 * @param rowSize Hold the size of the rows of the 2d Array
	 * @param colSize Hold the size of the columns of the 2d Array
	 */
	public Habitat(int rowSize, int colSize) {
		
		numOfOrganisms = 0;
		row = rowSize;
		col = colSize;
		
		maxOrganisms = row * col;
		
		habitat = new Organisms[row][col];
		
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				habitat[i][j] = null;
			}
		}
		
	}

	/**
	 * Used to add a new organism into the habitat
	 * in a random location of the 2D array
	 * @param newOrg an instance of the new organism
	 */
	public void addOrganism(Organisms newOrg)
	{
		
		int posX;
		int posY;

		do{
			
			posX = (int)(Math.random() * row);
			posY = (int)(Math.random() * col);
		
		}while(habitat[posX][posY] != null);
			
		
		habitat[posX][posY] = newOrg;
			
		
	}
	
	/**
	 * Function to generate a habitat with a random variety
	 * of organisms up to its maximum capacity
	 */
	public void generateHabitat()
	{
		
		int randomNum;
		
		Organisms newOrg = null;
		
		while (numOfOrganisms < maxOrganisms)
		{
			randomNum = (int)(Math.random() * 12);
			
			switch(randomNum)
			{
				case 1:
					newOrg = new Bluejay();	
					break;
				case 2:
					newOrg = new Caterpillar();	
					break;
				case 3:
					newOrg = new Deer();	
					break;
				case 4:
					newOrg = new Fox();
					break;
				case 5:
					newOrg = new Grass();	
					break;
				case 6:
					newOrg = new Grasshopper();	
					break;					
				case 7:
					newOrg = new Hawk();
					break;
				case 8:
					newOrg = new Mouse();	
					break;
				case 9:
					newOrg = new Rabbit();	
					break;
				case 10:
					newOrg = new Squirrel();	
					break;
				case 11:
					newOrg = new Tree();	
					break;
				case 12:
					newOrg = new Wolf();	
					break;
			}
			
			addOrganism(newOrg);
			
			numOfOrganisms++;
		}
		
	}
	
	/**
	 * Function to output the current habitat
	 */
	public void printHabitat()
	{
		for (int i = 0; i < row; i++)
		{
			
			for (int j = 0; j < col; j++)
			{
				
				if(habitat[i][j] != null)
				{
				
					System.out.print(habitat[i][j].getSymbol() + " ");	
				
				}
				else
				{
				
					System.out.print("- ");
				
				}
				
			}
			
			System.out.println("");
		}
	}

}
