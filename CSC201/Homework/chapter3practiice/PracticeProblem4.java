package chapter3practiice;

import java.util.*;

public class PracticeProblem4 {

	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	
	String data = input.nextLine();
	
	char end = data.charAt(data.length()-1);
	
	int count = 0;
	
	for(int i = 0; i<data.length()-1; i++)
	{
		if(data.charAt(i) == ' ')
		{
		
		}
		else count++;
	}
	
	if(end=='?')
	{
		if(count%2 == 0)
		{
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
	else if(end == '!')
	{
		System.out.println("Wow");
	}
	else 
	{
		System.out.println("You always say " + "\"" + data + "\"");
	}
	
	input.close();
	
	}

}
