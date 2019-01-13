/*
 * Shahroz Imtiaz
 * This program calculates the wall area and floor area, of a room that is 12ftx10ft and
 * has walls 8ft tall.
 */
package lab02;

public class Lab02 {

	public static void main(String[] args) 
	{
	int length = 12; //Declaring and defining the length of the floor 
	int width = 10;  //Declaring and defining the width of the floor
	int height = 8;  //Declaring and defining the height of the wall
	int wallArea, floorArea; //Declaring variables
	{
		floorArea = (length * width); //defining how to calculate floor area
		wallArea = (((height * width)*2) + ((height * length)*2));  //defining how to calculate wall area
	}
	
	//printing out answer for wall area and floor area of the room
	
	System.out.println("Floor area = "+ floorArea + " sq.ft.");
	System.out.println("Wall area = "+ wallArea + " sq.ft.");
	}//main

}//class
