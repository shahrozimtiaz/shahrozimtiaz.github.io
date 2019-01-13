package project2;

import java.util.*;

public class Temperature 
{
	Scanner scan = new Scanner(System.in);
	
	private char scale;
	private double degree;
	
	
	public Temperature()
	{	
	set(0, 'C');
	}
	public Temperature(Temperature other)
	{
		set(other.degree,other.scale);
		
	}
	public Temperature(double degree, char scale)
	{
		set(degree,scale);
		
	}
	
	////////////////////////////////////////////////////////CONSTRUCTORS
	public void read()
	{
		this.degree = scan.nextDouble();
		String input = new String();
		input = scan.next();
		this.scale = input.charAt(0);
		set(this.degree, this.scale);
		
	}
	private void set(double degree, char scale)
	{
		
		switch(scale)
		{
		case 'F':
			if(degree < -459.67)
			{
				System.out.println("Degree violated absolute value");
				System.exit(0);
			}
			break;
		case 'C':
			if(degree < -273.15)
			{
				System.out.println("Degree violated absolute value");
				System.exit(0);
			}
			break;
		case 'K':
			if(degree < 0)
			{
				System.out.println("Degree violated absolute value");
				System.exit(0);
			}
			break;
			default: 
				{
					System.out.println("Invalid Scale");
					System.exit(0);
				}
		
		}
		
		this.degree = degree;
		this.scale = scale;
	
	}

	public String toString()
	{
		return "" + degree + scale;
	}
	public Temperature toCelsius()
	{		
		double convertedTemp; 
		
		switch(this.scale)
		{
		
		case 'K': 
			convertedTemp = this.degree-273.15;
			Temperature temp = new Temperature(convertedTemp, 'C');
			return temp;
		
		case 'F':
			convertedTemp = (this.degree-32) * (5./9);
			temp = new Temperature(convertedTemp, 'C');
			return temp;
		
		}
		 Temperature sameTemp = new Temperature(this.degree, this.scale);
		 return sameTemp;
	}
	public Temperature toKelvin()
	{	
		double convertedTemp; 
		
		switch(this.scale)
		{
		
		case 'C': 
			convertedTemp = this.degree + 273.15;
			Temperature temp = new Temperature(convertedTemp, 'K');
			return temp;
		
		case 'F':
			convertedTemp = (this.degree + 459.67) * (5./9);
			temp = new Temperature(convertedTemp, 'K');
			return temp;
		
			
		}
		 Temperature sameTemp = new Temperature(this.degree, this.scale);
		 return sameTemp;
	}
	public Temperature toFahrenheit()
	{	
		double convertedTemp; 
		
		switch(this.scale)
		{
		
		case 'C': 
			convertedTemp = this.degree * (9./5) + 32;
			Temperature temp = new Temperature(convertedTemp, 'F');
			return temp;
		
		case 'K':
			convertedTemp = this.degree * (9./5) - 459.67;
			temp = new Temperature(convertedTemp, 'F');
			return temp;
		}
		 Temperature sameTemp = new Temperature(this.degree, this.scale);
		 return sameTemp;
	}
	public Temperature add(Temperature other)
	{
		Temperature convertedScale = new Temperature();
		Temperature answer = new Temperature();
		
		switch(this.scale)
		{
		case 'F':
			convertedScale = other.toFahrenheit();
			answer.degree = this.degree + convertedScale.degree;
			break;

		case 'C':
			convertedScale = other.toCelsius();
			answer.degree = this.degree + convertedScale.degree;
			break;
		case 'K':
			convertedScale = other.toKelvin();
			answer.degree = this.degree + convertedScale.degree;
			break;
		}
		
		answer.set(answer.degree, this.scale);
		return answer;
	}
	public Temperature subtract(Temperature other)
	{
		Temperature convertedScale = new Temperature();
		Temperature answer = new Temperature();
		
		switch(this.scale)
		{
		case 'F':
			convertedScale = other.toFahrenheit();
			answer.degree = this.degree - convertedScale.degree;
			break;

		case 'C':
			convertedScale = other.toCelsius();
			answer.degree = this.degree - convertedScale.degree;
			break;
		case 'K':
			convertedScale = other.toKelvin();
			answer.degree = this.degree - convertedScale.degree;
			break;
		}
		answer.set(answer.degree, this.scale);
		return answer;
	}
	public Temperature multiply(Temperature other)
	{
		Temperature convertedScale = new Temperature();
		Temperature answer = new Temperature();
		
		switch(this.scale)
		{
		case 'F':
			convertedScale = other.toFahrenheit();
			answer.degree = this.degree * convertedScale.degree;
			break;

		case 'C':
			convertedScale = other.toCelsius();
			answer.degree = this.degree * convertedScale.degree;
			break;
		case 'K':
			convertedScale = other.toKelvin();
			answer.degree = this.degree * convertedScale.degree;
			break;
		}
		answer.set(answer.degree, this.scale);
		return answer;
	}
	public Temperature divide(double x)
	{
		Temperature answer = new Temperature();
		answer.degree = this.degree /x;
		
		answer.set(answer.degree, this.scale);
		return answer;
	}
	public Boolean equals(Temperature other)
	{
		Temperature temp1 = new Temperature();
		Temperature temp2 = new Temperature();
		temp1 = this.toCelsius();
		temp2 = other.toCelsius();
		
		if(temp1.degree == temp2.degree)
		{
			return true;
		}
		else return false;
		
	}
	public Boolean greaterThan(Temperature other)
	{
		Temperature temp1 = new Temperature();
		Temperature temp2 = new Temperature();
		temp1 = this.toCelsius();
		temp2 = other.toCelsius();
		
		if(temp1.degree > temp2.degree)
		{
			return true;
		}
		else return false;
		
	}





}//class
