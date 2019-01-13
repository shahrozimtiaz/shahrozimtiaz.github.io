package project2;

import java.util.Scanner;

public class TemperatureDemoWithArrays {

	public static void main(String[] args)
	{
		Temperature average;
		System.out.println("You will be asked to fill 3 randomly sized arrays.");
		Temperature[] temperatureArrayOne;
		Temperature[] temperatureArrayTwo;
		Temperature[] temperatureArrayThree;

		temperatureArrayOne = new Temperature[getRandomArraySize()];
		System.out.println("This array has "+ temperatureArrayOne.length + " temperature(s)."); 
		System.out.println("Please enter a temperature in this form 45 C");
		readTemperatureArray(temperatureArrayOne);
		System.out.println("The values of temperature array one are ");
		printTemperatureArray(temperatureArrayOne);
		average = getAverage(temperatureArrayOne);
		System.out.println("The average of temperature array one is " + average);
		System.out.println();

		temperatureArrayTwo = new Temperature[getRandomArraySize()];
		System.out.println("This array has "+ temperatureArrayTwo.length + " temperature(s)."); 
		System.out.println("Please enter a temperature in this form 45 C");
		readTemperatureArray(temperatureArrayTwo);
		System.out.println("The values of temperature array two are ");
		printTemperatureArray(temperatureArrayTwo);
		average = getAverage(temperatureArrayTwo);
		System.out.println("The average of temperature array two is " + average);
		System.out.println();

		temperatureArrayThree = new Temperature[getRandomArraySize()];
		System.out.println("This array has "+ temperatureArrayThree.length + " temperature(s)."); 
		System.out.println("Please enter a temperature in this form 45 C");
		readTemperatureArray(temperatureArrayThree);
		System.out.println("The values of temperature array three are ");
		printTemperatureArray(temperatureArrayThree);
		average = getAverage(temperatureArrayThree);
		System.out.println("The average of temperature array three is " + average);
		System.out.println();

		int sizeOfLargestArray = getSizezOfLargestArray(temperatureArrayOne, temperatureArrayTwo,
				temperatureArrayThree);

		Temperature[] arrayWithLargestValues = createArrayWithLargestValues(sizeOfLargestArray, 
				temperatureArrayOne,temperatureArrayTwo, temperatureArrayThree);

		System.out.println("\nHere are the temperatures in the three arrays:");
		printTemperatureArray(temperatureArrayOne);
		printTemperatureArray(temperatureArrayTwo);
		printTemperatureArray(temperatureArrayThree);
		System.out.println("\nAn array with the largest values taken from the\n"+
				"3 arrays has " + arrayWithLargestValues.length + " elements.");
		System.out.println("This solution new the largest size of the three arrays:");
		printTemperatureArray(arrayWithLargestValues);

	}//Main 

	private static int getRandomArraySize()
	{

		return (int)(Math.random()*5 + 1); 

	}
	private static void readTemperatureArray(Temperature[] array)
	{
		Temperature t1;
		for(int x = 0; x < array.length; x++)
		{
			t1 = new Temperature();
			t1.read();
			array[x] = t1;
		}
	}
	private static void printTemperatureArray(Temperature[] array)
	{

		for(int x =0; x<array.length;x++)
		{
			System.out.print(array[x]);
			if(x<array.length-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	private static Temperature getAverage(Temperature[] array)
	{

		Temperature average = new Temperature(array[0]);
		for(int i = 1; i< array.length; i++)
		{
			average= average.add(array[i]);
		}
		average = average.divide(array.length);
		return average;
	}
	private static int getSizezOfLargestArray(Temperature[] array1, Temperature[] array2, Temperature[] array3)
	{
		if(array1.length>=array2.length && array1.length>=array2.length)
		{
			return array1.length;
		}
		else if(array2.length>=array1.length && array2.length>=array3.length)
		{
			return array2.length;
		}
		else return array3.length;
	}
	private static Temperature[] createArrayWithLargestValues(int sizeOfLargestArray, Temperature[] array1, Temperature[] array2, Temperature[] array3)
	{

		Temperature[] arrayWithLargestValues = new Temperature[sizeOfLargestArray];
		Temperature largest = null;

		for(int index=0; index<sizeOfLargestArray; index++)
		{
			boolean hasLargestValue = false;
			if(index < array1.length)
			{
				largest = array1[index];
				hasLargestValue = true;
			}
			if(index < array2.length)
			{
				if(hasLargestValue)
				{
					if(array2[index].greaterThan(largest))
					{
						largest = array2[index];
					}
				}
				else
				{
					largest = array2[index];
				}
				hasLargestValue = true;
			}
			if(index < array3.length)
			{
				if(hasLargestValue)
				{
					if(array3[index].greaterThan(largest))
					{
						largest = array3[index];
					}
				}
				else
				{
					largest = array3[index];
				}
			}
			arrayWithLargestValues[index] = largest; 
		}
		return arrayWithLargestValues;
	}
}//Class
