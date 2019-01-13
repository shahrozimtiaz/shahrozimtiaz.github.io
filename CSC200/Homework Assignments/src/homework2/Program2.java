/*
 * Shahroz Imtiaz
 * This program tells the user which flooring option is affordable based on user budget.
 */

package homework2;

import java.util.Scanner; //Importing scanner

public class Program2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);


		//Declaring variables 
		double costPreference, costLinoleumTile, costCarpet, costHardwood, costCeramicTile, floorArea,length,width,shelfWidth,shelfDepth,ceramicTile,hardwood,carpet,linoleumTile, preference, budget ;
		
		ceramicTile = 4;
		hardwood = 3;   //assigning price per Sqft
		carpet = 2;
		linoleumTile = 1; 
		
		//Defining variables
		length = input.nextDouble();
		width = input.nextDouble();
		shelfWidth = input.nextDouble();
		shelfDepth = input.nextDouble();
		preference = input.nextDouble();
		budget = input.nextDouble();
		
		floorArea = (length*width)-(shelfDepth*shelfWidth);
		
		costLinoleumTile =(linoleumTile)*(floorArea);
		costCarpet =(carpet)*(floorArea);                   //cost of flooring
		costHardwood =(hardwood)*(floorArea);
		costCeramicTile =(ceramicTile)*(floorArea);
		
		switch((int)preference)
		{
		case 0:
		case 1: costPreference=costCeramicTile;
				if(budget-costPreference>=0)  //checks for affordability of Cermaic Tile
				{
					System.out.println("Ceramic Tile is affordable");
					break;
				}
		
		case 2: costPreference=costHardwood;
			if(budget-costPreference>=0)   //checks for affordability of Hardwood
			{
				System.out.println("Hardwood is affordable");
				break;
			}

		case 3: costPreference=costCarpet; 
			if(budget-costPreference>=0)   //checks for affordability of Carpet
			{ 
				System.out.println("Carpet is affordable");
				break;
			}	
		case 4: costPreference=costLinoleumTile;
			if(budget-costPreference>=0)   //checks for affordability of Linoleum Tile
			{
				System.out.println("Linoleum Tile is affordable");
				break;
			}
					default: System.out.println("Given the budget no flooring is affordable:(");  //if nothing if affordable 
		}
		
		input.close();

	} //main

} //class

