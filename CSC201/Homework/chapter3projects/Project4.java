package chapter3projects;

import java.util.*;

public class Project4 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		String data = input.nextLine();
		/////////////////////////////// month
		
		System.out.println(data);
		
		String month = data.substring(0,2);

		int m = Integer.valueOf(month);
		if(m>12 || m<1)
		{
			System.out.println("Invalid date. Please change month.");
		}
	
		////////////////////////////
		String year = data.substring(6,10);

		int y = Integer.valueOf(year);
		
		if(y<0)
		{
			System.out.println("Invalid date. Please change year.");

		}
		///////////////////////////
		boolean leapYear;

		if(y%4==0 && y%100==0 & y%400==0)
		{
			leapYear = true;
		}
		else if(y%4==0 && y%100>0)
		{
			leapYear = true;
		}
		else
		{
			leapYear = false;
		}
		/////////////////////////////
		String day = data.substring(3,5);

		int d = Integer.valueOf(day);

		switch(m)
		{
		case 1:if(d<1 || d>30)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");
		break;

		case 2:
			if(!leapYear && d<1 || !leapYear && d>28)
			{
				System.out.println("Invalid date. Please change day.");
			}
			else if(leapYear & d<1 || leapYear & d>29)
			{
				System.out.println("Invalid date. Please change day.");	
			}
			else System.out.println("Valid Date");

			break;

		case 3:if(d<1 || d>30)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		case 4:if(d<1 || d>30)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		case 5:if(d<1 || d>31)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		case 6:if(d<1 || d>30)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		case 7:if(d<1 || d>30)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		case 8:if(d<1 || d>30)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		case 9: if(d<1 || d>30)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		case 10:if(d<1 || d>31)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		case 11:if(d<1 || d>30)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		case 12:if(d<1 || d>31)
		{
			System.out.println("Invalid date. Please change day.");
		}
		else System.out.println("Valid Date");

		break;

		}
		input.close();
	}

}
