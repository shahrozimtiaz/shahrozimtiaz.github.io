/*
 * Shahroz Imtiaz
 * This program displays me using nested if's to figure out the fine due
*/

package homework2;

import java.util.Scanner;

public class Program1type1 {

	public static void main(String[] args)
	{
		double cardNumber, age, overdue, type, fine;   //declaring variables 
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("What is the cardnumber: ");
		System.out.println("What is your age: ");
		System.out.println("What is the day(s) overdue: ");   //asking questions
		System.out.println("What is the type: ");
		
		cardNumber = data.nextDouble();
		age = data.nextDouble();
		overdue= data.nextDouble();    //getting information
		type = data.nextDouble();
		
		if(cardNumber%1>0)
		{
			System.out.println("Please enter valid integer for cardnumber");
		}
		else if(age%1.>0)
		{
			System.out.println("Please enter valid integer for age");   //This is all for user data error detection 
		}
		else if(overdue%1.>0)
		{
			System.out.println("Please enter valid integer for days overdue");
		}
		else if(type%1.>0)
		{
			System.out.println("Please enter valid integer between 1 and 3 for type of return");
		}
		else if(type<1 || type>3)
		{
			System.out.println("Please enter valid integer between 1 and 3 for type of return");
		}

		
		else
		{
		if(type == 1)     //if the type is 1 then do this
		{
			if(age > 70)//if senior citizen 
			{
				fine = 0;
				
				System.out.println("Cardnumber: " + cardNumber);
				System.out.println("Age: " + age);
				System.out.println("Item Type: " + "Book");
				System.out.println("Number of Days Overdue: " + overdue);
				System.out.println("Overdue Fine: " + "$" + fine);
				System.out.println("Fine adjustment reason: " + "Senior Citizen");
				
			}
			else if (age>6 && age<17 && (.5*overdue>1))// if juvenile and the fine is above $1
			{
				fine = 1;
				
				System.out.println("Cardnumber: " + cardNumber);
				System.out.println("Age: " + age);
				System.out.println("Item Type: " + "Book");
				System.out.println("Number of Days Overdue: " + overdue);
				System.out.println("Overdue Fine: " + "$" + fine);
				System.out.println("Fine adjustment reason: " + "Juvenile");
			}	
			else if((.5*overdue) > 5)    //if fine exceeds S5
			{
				fine = 5;
				
				System.out.println("Cardnumber: " + cardNumber);
				System.out.println("Age: " + age);
				System.out.println("Item Type: " + "Book");
				System.out.println("Number of Days Overdue: " + overdue);
				System.out.println("Overdue Fine: " + "$" + fine);
				System.out.println("Fine adjustment reason: " + "exceed max");
			}
			else
			{
				fine = .50 * overdue;
				
				System.out.println("Cardnumber: " + cardNumber);
				System.out.println("Age: " + age);
				System.out.println("Item Type: " + "Book");
				System.out.println("Number of Days Overdue: " + overdue);
				System.out.println("Overdue Fine: " + "$" + fine);
			}
		
		}
			
			if(type == 2)  //if the type is 2 then do this
			{
				if(age > 70)
				{
					fine = 0;
					
					System.out.println("Cardnumber: " + cardNumber);
					System.out.println("Age: " + age);
					System.out.println("Item Type: " + "Magazine");
					System.out.println("Number of Days Overdue: " + overdue);
					System.out.println("Overdue Fine: " + "$" + fine);
					System.out.println("Fine adjustment reason: " + "Senior Citizen");
				}
				else if (age>6 && age<17 && (.25*overdue>1))
				{
					fine = 1;
					
					System.out.println("Cardnumber: " + cardNumber);
					System.out.println("Age: " + age);
					System.out.println("Item Type: " + "Magazine");
					System.out.println("Number of Days Overdue: " + overdue);
					System.out.println("Overdue Fine: " + "$" + fine);
					System.out.println("Fine adjustment reason: " + "Juvenile");
				}	
				else if((.25*overdue) > 5)
				{
					fine = 5;
					
					System.out.println("Cardnumber: " + cardNumber);
					System.out.println("Age: " + age);
					System.out.println("Item Type: " + "Magazine");
					System.out.println("Number of Days Overdue: " + overdue);
					System.out.println("Overdue Fine: " + "$" + fine);
					System.out.println("Fine adjustment reason: " + "exceed max");
				}
				else
				{
					fine = .25 * overdue;
					
					System.out.println("Cardnumber: " + cardNumber);
					System.out.println("Age: " + age);
					System.out.println("Item Type: " + "Magazine");
					System.out.println("Number of Days Overdue: " + overdue);
					System.out.println("Overdue Fine: " + "$" + fine);
				}
			}	
				
				if(type == 3)  //if the type is 3 then do this
				{
					if(age > 70)
					{
						fine = 0;
						
						System.out.println("Cardnumber: " + cardNumber);
						System.out.println("Age: " + age);
						System.out.println("Item Type: " + "DVD");
						System.out.println("Number of Days Overdue: " + overdue);
						System.out.println("Overdue Fine: " + "$" + fine);
						System.out.println("Fine adjustment reason: " + "Senior Citizen");
					}
					else if (age>6 && age<17 && (1.5*overdue>1))
					{
						fine = 1;
						
						System.out.println("Cardnumber: " + cardNumber);
						System.out.println("Age: " + age);
						System.out.println("Item Type: " + "DVD");
						System.out.println("Number of Days Overdue: " + overdue);
						System.out.println("Overdue Fine: " + "$" + fine);
						System.out.println("Fine adjustment reason: " + "Juvenile");
					}	
					else if((1.5*overdue) > 5)
					{
						fine = 5;
						
						System.out.println("Cardnumber: " + cardNumber);
						System.out.println("Age: " + age);
						System.out.println("Item Type: " + "DVD");
						System.out.println("Number of Days Overdue: " + overdue);
						System.out.println("Overdue Fine: " + "$" + fine);
						System.out.println("Fine adjustment reason: " + "exceed max");
					}
					else
					{
						fine = 1.50 * overdue;
						
						System.out.println("Cardnumber: " + cardNumber);
						System.out.println("Age: " + age);
						System.out.println("Item Type: " + "DVD");
						System.out.println("Number of Days Overdue: " + overdue);
						System.out.println("Overdue Fine: " + "$" + fine);
					}
					
				}
				 data.close();
		}
				
	}//main

}//class
