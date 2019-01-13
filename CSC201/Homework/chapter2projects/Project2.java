package chapter2projects;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a line of text.");
		
		String data = input.nextLine();
		
		data = data.replaceFirst("hate", "love");
		
		System.out.println("I have rephrased that line to read:");
		
		System.out.println(data);
		
		input.close();
		
	}

}
