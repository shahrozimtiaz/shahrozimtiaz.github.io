package chapter3projects;

import java.util.Scanner;

public class Project5 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	
		System.out.println("ENTER Gender. M or F");
		System.out.println("ENTER WEIGHT IN LBS.");
		System.out.println("ENTER HEIGHT IN INCHES.");
		System.out.println("ENTER AGE IN YEARS.");
		
		String gender = input.nextLine();
		double weight = input.nextDouble();
		double height = input.nextDouble();
		double age = input.nextDouble();
		
		if(gender.contentEquals("M"))
		{
			double mBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
			double mAmountOfChocolateBars = mBMR/230;
			System.out.println("As a man, you need to eat " + mAmountOfChocolateBars + " chocolate bar(s) to maintain your weight.");
		}
		else
		{
			double fBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
			double fAmountOfChocolateBars = fBMR/230;

			System.out.println("As a woman, you need to eat " + fAmountOfChocolateBars + " chocolate bar(s) to maintain your weight.");
		}
		input.close();

	}

}
