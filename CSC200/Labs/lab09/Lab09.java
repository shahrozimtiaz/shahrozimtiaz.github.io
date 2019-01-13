/*
 * Shahroz Imtiaz
 * This program calculates how much money you will have after given amount of months plus interest, by calling upon other methods.
 */


package lab09;

import java.util.Scanner;

public class Lab09 {

	public static void main(String[] args)
	{


		double initialValue, rate, value, months, ratePerMonth; //Declaring my variables 
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the initial value? What is the annual rate of interest? How many months would you like to calculate for?"); 
		
		initialValue = input.nextDouble();
		rate= input.nextDouble();               //getting data from what user entered in
		months = input.nextDouble();
		
		ratePerMonth = ratePerMonthMethod(rate, months);  //calls upon ratePerMonthMethod in order to determine the rate per month
		value = calcInterest(initialValue,months,ratePerMonth); //calls upon the method calcInterest in order to determine final amount in account
		
		System.out.println("Final amount in account: $" + value);
		
		input.close();
	}//main	
		
	
		public static double ratePerMonthMethod(double rate, double months) //THIS METHOD CALCULATES THE RATE PER MONTH
		{
			double ratePerMonth;
			ratePerMonth= rate/12;
			return ratePerMonth;
		}//ratePerMonth
		

		public static double calcInterest(double value, double months, double ratePerMonth) //THIS METHOD CALCULATES THE FINAL AMOUNT
		{
			for(int i=1; i<=months; i++)
			{
				value += (value*ratePerMonth);
			}
			return value;	
		}// calcInterest 

}//class
