/*
 * Shahroz Imtiaz
 * This program tells the user the wall area, floor area, the cost to paint the walls, and it tells the user which flooring option is affordable based on user budgetFloor.
 */


package homework3;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		//Declaring variables 
		double numDoors,height,costPreferenceFloor, costPreferenceWall, costLinoleumTile, costCarpet, costHardwood, costCeramicTile,wallArea, floorArea,length,width;
		double ceramicTile,hardwood,carpet,linoleumTile, preferenceWall,preferenceFloor, budgetWall, budgetFloor,doorWidth,doorHeight,doorArea;
		double tile,costTile, costPaneling, paneling,costWallpaper,costPaint, wallpaper, paint, numWindows,windowWidth,windowHeight, windowArea,numBookSelves,bookShelfLength,bookShelfWidth,bookShelfHeight,bookShelfFloorArea,bookShelfWallArea;
		
		ceramicTile = 4;
		hardwood = 3;   //assigning price per Sqft
		carpet = 2;
		linoleumTile = 1; 
		
		tile = 4;
		paneling = 3;
		wallpaper = 2;
		paint = 1;
		
		
		//Defining variables
		
		length = input.nextDouble();   //****INPUT****
		width = input.nextDouble();//****INPUT****
		height = input.nextDouble();//****INPUT****
        numDoors = input.nextDouble();//****INPUT****
		
		doorArea=0;
		for(int i=1; i<=numDoors;i++) //assigns values for door width and height
		{
			doorWidth = input.nextDouble();//****INPUT****
			doorHeight = input.nextDouble();//****INPUT****
			
			doorArea += doorAreaMethod(doorWidth,doorHeight); 	
		}


		
		numWindows = input.nextDouble();//****INPUT****
		
		windowArea=0;
		for(int i=1; i<=numWindows;i++) //assigns values for window width and height
		{
			windowWidth = input.nextDouble();//****INPUT****
			windowHeight = input.nextDouble();//****INPUT****
			
			windowArea += windowAreaMethod(windowWidth,windowHeight); 	
		}
		
	    numBookSelves = input.nextDouble();//****INPUT****
		
		bookShelfFloorArea=0;
		bookShelfWallArea=0;
		for(int i=1; i<=numBookSelves;i++) //assigns values for Bookshelf length, width, and height
		{
			bookShelfLength = input.nextDouble();//****INPUT****
			bookShelfHeight = input.nextDouble();//****INPUT****
			bookShelfWidth = input.nextDouble();//****INPUT****
			
			bookShelfFloorArea += bookshelfFloorAreaMethod(bookShelfLength,bookShelfWidth); 	
			bookShelfWallArea += bookshelfWallAreaMethod(bookShelfLength, bookShelfHeight); 
		}

		wallArea = (((2*(length*height))+(2*(width*height)))-windowArea-doorArea-bookShelfWallArea); //calculating wall area
		floorArea = (length*width)-bookShelfFloorArea;  //calculating floor area
		
		System.out.println("Total Floor Area: " + floorArea);
		
		costLinoleumTile =(linoleumTile)*(floorArea);
		costCarpet =(carpet)*(floorArea);                   //cost of flooring
		costHardwood =(hardwood)*(floorArea);
		costCeramicTile =(ceramicTile)*(floorArea);

		
		preferenceFloor= input.nextDouble();//****INPUT****
		budgetFloor = input.nextDouble();//****INPUT****
		
		switch((int)preferenceFloor)
		{
		case 0:
		case 1: costPreferenceFloor=costCeramicTile;
				if(budgetFloor-costPreferenceFloor>=0)  //checks for affordability of Cermaic Tile
				{
					System.out.println("Ceramic Tile is affordable");
					System.out.println("The floor will cost: $" + costPreferenceFloor);
					break;
				}
		
		case 2: costPreferenceFloor=costHardwood;
			if(budgetFloor-costPreferenceFloor>=0)   //checks for affordability of Hardwood
			{
				System.out.println("Hardwood is affordable");
				System.out.println("The floor will cost: $" + costPreferenceFloor);
				break;
			}

		case 3: costPreferenceFloor=costCarpet; 
			if(budgetFloor-costPreferenceFloor>=0)   //checks for affordability of Carpet
			{ 
				System.out.println("Carpet is affordable");
				System.out.println("The floor will cost: $" + costPreferenceFloor);
				break;
			}	
		case 4: costPreferenceFloor=costLinoleumTile;
			if(budgetFloor-costPreferenceFloor>=0)   //checks for affordability of Linoleum Tile
			{
				System.out.println("Linoleum Tile is affordable");
				System.out.println("The floor will cost: $" + costPreferenceFloor);
				break;
			}
					default: System.out.println("Given the budgetFloor no flooring is affordable:(");  //if nothing if affordable 
		}
		
////////////// Repeats everything but for the walls ////////////////////////
		System.out.println("Total Wall Area: " + wallArea);
		
		costTile =(tile)*(wallArea);
		costPaneling =(paneling)*(wallArea);                   //cost of wall options
		costWallpaper =(wallpaper)*(wallArea);
		costPaint =(paint)*(wallArea);
		
		
		preferenceWall= input.nextDouble();//****INPUT****
		budgetWall = input.nextDouble();//****INPUT****
		
		switch((int)preferenceWall)
		{
		case 0:
		case 1: costPreferenceWall=costTile;
				if(budgetWall-costPreferenceWall>=0)  //checks for affordability of Tile
				{
					System.out.println("Tile is affordable");
					System.out.println("The wall will cost: $" + costPreferenceWall);
					break;
				}
		
		case 2: costPreferenceWall=costPaneling;
			if(budgetWall-costPreferenceWall>=0)   //checks for affordability of paneling
			{
				System.out.println("Paneling is affordable");
				System.out.println("The wall will cost: $" + costPreferenceWall);
				break;
			}

		case 3: costPreferenceWall=costWallpaper; 
			if(budgetWall-costPreferenceWall>=0)   //checks for affordability of wallpaper
			{ 
				System.out.println("Wallpaper is affordable");
				System.out.println("The wall will cost: $" + costPreferenceWall);
				break;
			}	
		case 4: costPreferenceWall=costPaint;
			if(budgetWall-costPreferenceWall>=0)   //checks for affordability of Paint
			{
				System.out.println("Paint is affordable");
				System.out.println("The Wall will cost: $" + costPreferenceWall);
				break;
			}
					default: System.out.println("Given the budgetWall no Wall option is affordable:(");  //if nothing if affordable 
		}


		input.close();

	} //main

		public static double windowAreaMethod(double windowWidth, double windowHeight)// method for window area
		{
			
			double windowArea = (windowWidth*windowHeight);
			return windowArea;
		}
		
		public static double doorAreaMethod(double doorWidth, double doorHeight)//method for door area
		{
			
			double doorArea = (doorWidth*doorHeight);
			return doorArea;
		}
		
		public static double bookshelfFloorAreaMethod(double bookshelfLength, double bookshelfWidth)//method for bookshelf floor areaa
		{
			
			double bookshelfFloorArea = (bookshelfLength*bookshelfWidth);
			return bookshelfFloorArea;
		}
		
		public static double bookshelfWallAreaMethod(double bookshelfLength, double bookshelfHeight)//method for bookshelf wall area
		{
			
			double bookshelfWallArea = (bookshelfLength*bookshelfHeight);
			return bookshelfWallArea;
		}

} //class



