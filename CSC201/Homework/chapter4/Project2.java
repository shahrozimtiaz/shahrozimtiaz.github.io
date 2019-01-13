package chapter4;

import java.util.*;

public class Project2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		String data = input.nextLine();

		data.toLowerCase();

		while(!data.equals("quit"))
		{
			char beginning = data.charAt(0);

			String backwards = String.valueOf(beginning);

			for (int i = data.length()-1;i>0;i--)
			{
				backwards += String.valueOf(data.charAt(i));
			}

			System.out.println(backwards);

			if(data.equals(backwards))
			{
				System.out.println("This word contains the property.");
			}
			else
			{
				System.out.println("This word does not contain the property.");

			}

			data = input.nextLine();

		}
		input.close();
	}

}
