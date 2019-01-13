package chapter4;

import java.util.Scanner;

public class Project9 {

	public static void main(String[] args)
	{
		
		Scanner data = new Scanner(System.in);
		
		int dollars = data.nextInt();
		int coupons = dollars;
	     
		if(dollars < 6)
		{
			System.out.println("Not enough cash");
			System.exit(0);
		}
		int extraBars = (int) (coupons/6);
		coupons = (coupons%6) + extraBars;

		
		

		int bars = (int) dollars/1;
		
		if(coupons>=6)
		{
			extraBars++;
			coupons++;
			coupons = coupons-6;
		}
		int finalAmount = bars + extraBars;
		
		System.out.println("Chocolate bars: " + finalAmount + " You have this many coupons left:" + coupons);
		
		data.close();
	}

}
