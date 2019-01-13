package project1;

import java.util.Scanner;

public class Bottle 
{
	Scanner scan = new Scanner(System.in);
	private int marbles;
	private final int MIN = 0;
	private final int MAX = 100;

	public void read()
	{
		boolean goodAge = false;
		while(!goodAge)
		{
			try
			{
				System.out.println("Please enter marbles.");
				marbles = scan.nextInt();
				if(marbles < MIN || marbles > MAX )
				{
					throw new BottleOutOfBoundsException
					("in read method: marbles value < MIN or > MAX");
				}
				goodAge = true;
			}
			catch(BottleOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		this.marbles = marbles;


	}
	public int get()
	{
		return this.marbles; 

	}
	public String toString()
	{
		return "" + marbles;
	}
	public void set(int x)
	{
		if (x<MIN || x>MAX)
		{
			throw new BottleOutOfBoundsException("set: marbles value < MIN_VALUE or > MAX_VALUE");

		}
		else this.marbles = x;
	}
	public void set(Bottle other)
	{
		this.marbles = other.marbles;
	}
	public Bottle add(Bottle other)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles + other.marbles;
		if (answer.marbles>MAX)
		{
			throw new BottleOutOfBoundsException("add: marbles > MAX_VALUE");

		}
		return answer; 
	}
	public Bottle divide(int x)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles / x;
		if (answer.marbles>MAX)
		{
			throw new BottleOutOfBoundsException("divide: marbles > MAX_VALUE");

		}
		return answer; 
	}
	public Bottle subtract(Bottle other)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles - other.marbles;
		if (answer.marbles<MIN)
		{
			throw new BottleOutOfBoundsException("subtract: marbles < MIN_VALUE");

		}
		return answer; 
	}
	public Bottle subtract(int x)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles - x;
		if (answer.marbles<MIN || answer.marbles>MAX)
		{
			throw new BottleOutOfBoundsException("subtact: marbles value < MIN_VALUE or > MAX_VALUE");

		}
		return answer; 
	}
	public Bottle divide(Bottle other)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles / other.marbles;
		if (answer.marbles>MAX)
		{
			throw new BottleOutOfBoundsException("divide: marbles > MAX_VALUE");

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
			throw new BottleOutOfBoundsException("multiply: marbles > MAX_VALUE");

		}
		return answer; 
	}	
	public Bottle multiply(int x)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles * x;
		if (answer.marbles>MAX || answer.marbles<MIN)
		{
			throw new BottleOutOfBoundsException("multiply: marbles value < MIN_VALUE or > MAX_VALUE");

		}
		return answer; 
	}	
	public Bottle add(int x)
	{
		Bottle answer = new Bottle();
		answer.marbles = this.marbles + x;
		if (answer.marbles>MAX || answer.marbles<MIN )
		{
			throw new BottleOutOfBoundsException("add: marbles value < MIN_VALUE or > MAX_VALUE");

		}
		return answer; 
	}
	

}//class
