package project4;

import java.util.*;

public class Polynomial
{

	public static void main(String[] args) 
	{
		double[] poly;
		
		poly = read();
		bisection(poly);
		
	}//main
	private static double[] read()
	{
		Scanner scan = new Scanner(System.in);
		
		double[] poly = new double[6];
		
		System.out.println("Please Enter The 5th Coefficient:");
		poly[0] = scan.nextDouble();
		System.out.println("Please Enter The 4th Coefficient:");
		poly[1] = scan.nextDouble();
		System.out.println("Please Enter The 3rd Coefficient:");
		poly[2] = scan.nextDouble();
		System.out.println("Please Enter The 2nd Coefficient:");
		poly[3] = scan.nextDouble();
		System.out.println("Please Enter The 1st Coefficient:");
		poly[4] = scan.nextDouble();
		System.out.println("Please Enter The 0 Coefficient:");
		poly[5] = scan.nextDouble();
		
		return poly;
	}
	private static void bisection(double[] poly)
	{
		double ub = 0;
		double lb = 0;
		
		for(double a=-10; a<10; a = a + .1)
		{
			double b = a + .1;
			
			double ya = evaluate(poly,a);
			double yb = evaluate(poly,b);
			
			if(ya>0 && yb<0)
			{
				ub = a;
				lb = b;
				
				double c = (ub + lb)/2;;
				while(evaluate(poly,c) > (0 + .0000001) || evaluate(poly,c) < (0 - .0000001))
				{
					if(evaluate(poly,c) > 0)
					{
						ub = c;
						c = (ub + lb)/2;
					}
					else if(evaluate(poly,c) < 0)
					{
						lb = c;
						c = (lb + ub)/2;
					}
					
				}
				System.out.println("zero at: " + c );
			}
			else if(ya<0 && yb>0)
			{
				ub = b;
				lb = a;
				
				double c = (ub + lb)/2;;
				while(evaluate(poly,c) > (0 + .0000001) || evaluate(poly,c) < (0 - .0000001))
				{
					if(evaluate(poly,c) > 0)
					{
						ub = c;
						c = (c + lb)/2;
					}
					else if(evaluate(poly,c) < 0)
					{
						lb = c;
						c = (c + ub)/2;
					}	
				}
				System.out.println("zero at: " + c );
			}
		}//outerLoop

	}
	private static double evaluate(double[] poly, double x)
	{
		double y = (poly[0] * Math.pow(x,5)) + (poly[1] * Math.pow(x,4)) + (poly[2] * Math.pow(x,3)) + (poly[3] * Math.pow(x,2)) + (poly[4] * Math.pow(x,1)) + (poly[5]);

		return y;
	}

}//class
