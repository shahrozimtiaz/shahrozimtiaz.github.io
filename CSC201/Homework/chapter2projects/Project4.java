package chapter2projects;

import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) 
	{
		Scanner data = new Scanner(System.in);
				
		System.out.println("ENTER FAVORITE COLOR.");
		System.out.println("ENTER FAVORITE FOOD.");
		System.out.println("ENTER FAVORITE ANIMAL.");
		System.out.println("ENTER THE FIRST NAME OF A FRIEND OR RELATIVE.");
		
		String color = data.nextLine();
		String food = data.nextLine();
		String animal = data.nextLine();
		String name = data.nextLine();
		
		System.out.println("I had a dream that " + name + " ate a " + color + " " + animal);
		System.out.println("and said it tasted like " + food + "!");
		
		data.close();
	}

}
