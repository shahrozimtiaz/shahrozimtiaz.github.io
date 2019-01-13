/*
 * Shahroz Imtiaz
 * This program tells the user the wall area, floor area, the cost to paint the walls, the cost to put in carpet in a room.
 */

package homework1;

import java.util.Scanner; //Importing scanner

public class Renovation {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);


		//Declaring variables 
		double wallArea, floorArea,costPaint,costCarpet,length,width,height,doorHeight,doorWidth,window1Height,window2Height,window1Width,window2Width,shelfHeight,shelfWidth,shelfDepth;
		
		//Defining variables
		length = input.nextDouble();
		width = input.nextDouble();
		height = input.nextDouble();
		doorWidth = input.nextDouble();
		doorHeight = input.nextDouble();
		window1Width = input.nextDouble();  
		window1Height = input.nextDouble();
		window2Width = input.nextDouble();
		window2Height = input.nextDouble();
		shelfWidth = input.nextDouble();
		shelfHeight = input.nextDouble();
		shelfDepth = input.nextDouble();
		costPaint = input.nextDouble();
		costCarpet = input.nextDouble();
		
		floorArea = (length*width)-(shelfDepth*shelfWidth); //calculates final floor area
		wallArea = (((height * width)*2) + ((height * length)*2)) - ((window1Height*window1Width)+(window2Height*window2Width)+(doorHeight*doorWidth)+(shelfHeight*shelfWidth)); //calculates final wall area


		System.out.println("Total Floor Area = " + floorArea + " sq.ft." ); //prints out final floor area
		System.out.println("Total Wall Area = " + wallArea + " sq.ft.");  //prints out final wall area
		System.out.println("Cost of painting the walls = " + "$" + (costPaint*wallArea)); //prints out the cost of painting the wall
		System.out.println("Cost of putting carpet in = " + "$" + (costCarpet*floorArea)); //prints out the cost of putting carpet in

		
		input.close();

	} //main

} //class
