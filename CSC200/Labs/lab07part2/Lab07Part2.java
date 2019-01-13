/*
 * Shahroz Imtiaz
 * This program calculates how much money you will have after given amount of months plus interest.
 */


package lab07part2;

import java.util.Scanner;

public class Lab07Part2 {

	public static void main(String[] args) 
	{
		
		double deposit, rate, months, value, ratePerMonth; //Declaring my variables 
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the initial deposit? What is the annual rate of interest? How many months would you like to calculate for?"); 
		
		deposit = input.nextDouble();
		rate= input.nextDouble();
		months = input.nextDouble();
		
		ratePerMonth = rate/12;
		
		value = deposit;         // Original savings money
		
		for(int i=1; i<=months; i++)
		{
			value += (value*ratePerMonth);
		}
	
		System.out.println("Deposit: " + deposit); 
		System.out.println("Rate per month: " + ratePerMonth + "%"); 
		System.out.println("Months: " + months); 
		System.out.println("Final amount in account: $" + value); 
	
		input.close();
	}

}
