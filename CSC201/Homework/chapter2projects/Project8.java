package chapter2projects;

import java.util.Scanner;

public class Project8 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENTER WEIGHT IN LBS.");
		System.out.println("ENTER HEIGHT IN INCHES.");
		System.out.println("ENTER AGE IN YEARS.");
		
		double weight = input.nextDouble();
		double height = input.nextDouble();
		double age = input.nextDouble();
		
		double fBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		double mBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		
		double fAmountOfChocolateBars = fBMR/230;
		double mAmountOfChocolateBars = mBMR/230;
		
		System.out.println("If you are a woman, you need to eat " + fAmountOfChocolateBars + " chocolate bar(s) to maintain your weight.");
		System.out.println("If you are a man, you need to eat " + mAmountOfChocolateBars + " chocolate bar(s) to maintain your weight.");

		input.close();

	}

}
