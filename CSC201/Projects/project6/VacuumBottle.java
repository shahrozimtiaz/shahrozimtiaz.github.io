package project6;

import java.util.*;

public class VacuumBottle extends Bottle 
{
	private Temperature temp;

	
	public VacuumBottle()
	{
		temp = new Temperature();
		
	}
	public VacuumBottle(VacuumBottle other)
	{
		this.temp = other.temp;
		this.setMarbles(other);
		
	}
	public VacuumBottle (int n, double d, char s)
	{
		setMarbles(n);
		temp = new Temperature(d,s);
	}
////////////////////////////constructors
	public void read()
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String a = new String();
		a = scan.next();
		
		double d = scan.nextDouble();
		
		String input = new String();
		input = scan.next();
		char s = input.charAt(0);
		
		set(n,d,s);
		
	}
	public void set (int n, double d, char s)
	{
		this.setMarbles(n);
		temp = new Temperature(d,s);
	}
	public VacuumBottle toKelvin()
	{	
		VacuumBottle answer = new VacuumBottle();
		answer.setMarbles(this.getMarbles());
		answer.temp = this.temp.toKelvin();
		return answer;
	}
	public VacuumBottle toCelsius()
	{	
		VacuumBottle answer = new VacuumBottle();
		answer.setMarbles(this.getMarbles());
		answer.temp = this.temp.toCelsius();
		return answer;
	}
	public VacuumBottle toFahrenheit()
	{	
		VacuumBottle answer = new VacuumBottle();
		answer.setMarbles(this.getMarbles());
		answer.temp = this.temp.toFahrenheit();
		return answer;
	}
	public String toString()
	{
		return super.toString() + " @ " + temp.toString();
	}
	public boolean equals(VacuumBottle vb)
	{
		return super.equals(vb) && temp.equals(vb.temp);
	}
	public VacuumBottle add(VacuumBottle other)
	{
		VacuumBottle answer = new VacuumBottle();
		answer.setMarbles(super.add(other));
		answer.temp = temp.add(other.temp);
		return answer;
	}
	public VacuumBottle subtract(VacuumBottle other)
	{
		VacuumBottle answer = new VacuumBottle();
		answer.setMarbles(super.subtract(other));
		answer.temp = temp.subtract(other.temp);
		return answer;
	}
	public VacuumBottle divideBy(int x)
	{
		VacuumBottle answer = new VacuumBottle();
		answer.setMarbles(getMarbles()/x);
		answer.temp = temp.divide(x);
		return answer;
	}
	public boolean greaterThan(VacuumBottle other)
	{
		return this.getMarbles()> other.getMarbles();
	}

}//class
