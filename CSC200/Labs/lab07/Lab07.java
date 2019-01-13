package lab07;

import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) 
	{
		int num1,num2,answer, numberCorrect, wantCorrect;   // declaring variables 
		System.out.println("How many would you like to get correct?");
		Scanner input = new Scanner(System.in);
		wantCorrect = input.nextInt();
		numberCorrect = 0;
		
	    while(numberCorrect<wantCorrect)
	    {	
		
		num1 = (int)(Math.random()*10); //randomly defining first number
		num2 = (int)(Math.random()*10); //randomly defining second number
		
		if(num1>=num2) //checks to make sure the answer will be positive 
		{
			System.out.println("What is " + num1 + " - " + num2 + " =");  //asks question 
			answer = input.nextInt();  //grabs the user's answer
			
			if(answer == (num1-num2))  //checks to see if the user is correct 
			{
				System.out.println("CORRECT!");   //if user is correct
				numberCorrect++;
			}
			else
			{
				System.out.println("Wrong. " + num1 + " - " + num2 + " = " + (num1-num2)); //if user is wrong
			}
		}
		else  //if the answer will result in a negative number, flip num1 and num2
		{
			System.out.println("What is " + num2 + " - " + num1 + " ="); //asks question
			answer = input.nextInt();  //grabs user's answer
			
			if(answer == (num2-num1)) //compare user's answer with real answer
			{
				System.out.println("CORRECT!");  //if user is correct
				numberCorrect++;
			}
			else
			{
				System.out.println("Wrong. " + num2 + " - " + num1 + " = " + (num2-num1)); //if user is wrong
			}
		}
	    }
	    System.out.println("Goodjob!" + " Number Correct: " + numberCorrect + " = " + "Want Correct: " + wantCorrect);
	    input.close();
	}//main

}//class
