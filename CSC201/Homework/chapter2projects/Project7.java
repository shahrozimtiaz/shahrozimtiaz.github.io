package chapter2projects;

import java.util.Scanner;

public class Project7 {

	public static void main(String[] args)
	{
		System.out.println("ENTER RADIUS OF WELL CASING IN INCHES.");
		System.out.println("ENTER DEPTH OF WELL IN FEET.");
		
		Scanner data = new Scanner(System.in);
		
		double radius = (data.nextDouble()/12);
		double depth = data.nextDouble();
		
		double cubicFeetOfWater = ((Math.PI)*(radius*radius)*(depth)); 
		
		double gallonsOfWater = (cubicFeetOfWater)*7.48;
		
		System.out.println("Gallons of Water: " + gallonsOfWater);
		
		data.close();


	}

}
