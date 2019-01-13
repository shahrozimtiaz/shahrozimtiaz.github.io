package project6;

import java.util.Scanner;

public class Bottle 
{
	Scanner scan = new Scanner(System.in);
	private int marbles;
	private final int MIN = 0;
	private final int MAX = 1000000;

	public void read()
	{
		this.marbles = scan.nextInt();
		if (marbles<MIN || marbles>MAX)
		{
			System.out.println("VALUE IS OUT OF RANGE");
			System.exit(0);
		}
	
	}
	public int getMarbles()
	{
		return this.marbles; 
		
	}
	public String toString()
	{
		return "" + marbles;
	}
	public void setMarbles(int x)
	{
		if (x<MIN || x>MAX)
		{
			System.out.println("VALUE IS OUT OF RANGE");
			System.exit(0);
		}
		else this.marbles = x;
	}
	public void setMarbles(Bottle other)
	{
		this.marbles = other.marbles;
	}
	public Bottle add(Bottle other)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles + other.marbles;
		if (answer.marbles>MAX)
		{
			 System.out.println("VALUE IS OUT OF RANGE");
			 System.exit(0);
		}
		return answer; 
	}
	public Bottle divide(int x)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles / x;
		if (answer.marbles>MAX)
		{
			 System.out.println("VALUE IS OUT OF RANGE");
			 System.exit(0);
		}
		return answer; 
	}
	public Bottle subtract(Bottle other)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles - other.marbles;
		if (answer.marbles<MIN)
		{
			 System.out.println("VALUE IS OUT OF RANGE");
			 System.exit(0);
		}
		return answer; 
	}
	public Bottle subtract(int x)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles - x;
		if (answer.marbles<MIN || answer.marbles>MAX)
		{
			 System.out.println("VALUE IS OUT OF RANGE");
			 System.exit(0);
		}
		return answer; 
	}
	public Bottle divide(Bottle other)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles / other.marbles;
		if (answer.marbles>MAX)
		{
			 System.out.println("VALUE IS OUT OF RANGE");
			 System.exit(0);
		}
		return answer; 
	}
	public boolean equals(Bottle other)
	{
		if(this.marbles == other.marbles)
		{
			return true;
		}
		else return false;
	}
	public Bottle multiply(Bottle other)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles * other.marbles;
		if (answer.marbles>MAX)
		{
			 System.out.println("VALUE IS OUT OF RANGE");
			 System.exit(0);
		}
		return answer; 
	}	
	public Bottle multiply(int x)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles * x;
		if (answer.marbles>MAX || answer.marbles<MIN)
		{
			 System.out.println("VALUE IS OUT OF RANGE");
			 System.exit(0);
		}
		return answer; 
	}	
	public Bottle add(int x)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles + x;
		if (answer.marbles>MAX || answer.marbles<MIN )
		{
			 System.out.println("VALUE IS OUT OF RANGE");
			 System.exit(0);
		}
		return answer; 
	}
	

}//class
