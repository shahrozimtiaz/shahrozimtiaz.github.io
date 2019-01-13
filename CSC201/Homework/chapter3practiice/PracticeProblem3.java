package chapter3practiice;

import java.util.Scanner;

public class PracticeProblem3 {

	public static void main(String[] args) 
	{

		Scanner data = new Scanner(System.in);

		String one = data.nextLine();
		String two = data.nextLine();
		String three = data.nextLine();

		if(one.compareTo(two)>0 && one.compareTo(three)<0)
		{
			System.out.print(one);
		}
		else if(one.compareTo(two)<0 && one.compareTo(three)>0)
		{
			System.out.println(one);
		}
		else if(two.compareTo(one)>0 &&  two.compareTo(three)<0)
		{
			System.out.println(two);
		}
		else if(two.compareTo(one)<0 && two.compareTo(three)>0)
		{
			System.out.println(two);
		}
		else if(three.compareTo(one)>0 && three.compareTo(two)<0)
		{
			System.out.println(three);
		}
		else if(three.compareTo(one)<0 && three.compareTo(two)>0)
		{
			System.out.println(three);
		}
		else
		{
			System.out.println("Error");
		}
		data.close();

	}

}
