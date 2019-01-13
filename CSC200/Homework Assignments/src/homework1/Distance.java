/*
 * Shahroz Imtiaz
 * This program calculates the distance between two points
 */

package homework1;

import java.util.Scanner; //importing scanner

public class Distance
{

	public static void main(String[] args) 
	{
		double x1,y1,z1,x2,y2,z2, answer;         //declaring variables
		
		Scanner xx1 = new Scanner(System.in);
		Scanner yy1 = new Scanner(System.in);
		Scanner zz1 = new Scanner(System.in);  //creating a scanner per variable
		Scanner xx2 = new Scanner(System.in);
		Scanner yy2 = new Scanner(System.in);
		Scanner zz2 = new Scanner(System.in);
		
		x1 = xx1.nextDouble();
		y1 = yy1.nextDouble();
		z1 = zz1.nextDouble();       //assigning values to variables based on data entered by user
		x2 = xx2.nextDouble();
		y2 = yy2.nextDouble();
		z2 = zz2.nextDouble();
		
		
		answer = (Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2))+(Math.pow((z1-z2),2)))); //calculating distance
		
		System.out.println("Value of x1 is: " + x1);
		System.out.println("Value of y1 is: " + y1);
		System.out.println("Value of z1 is: " + z1);
		System.out.println("Value of x2 is: " + x2);
		System.out.println("Value of y2 is: " + y2);
		System.out.println("Value of z2 is: " + z2);
		System.out.println("Distance is: " + answer);
		
		xx1.close(); 
		yy1.close(); 
		zz1.close(); 
		xx2.close();
		yy2.close(); 
		zz2.close();
	}

}
