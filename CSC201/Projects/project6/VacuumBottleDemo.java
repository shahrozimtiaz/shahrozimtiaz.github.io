package project6;

import java.util.Scanner;

//import project2.Temperature;

public class VacuumBottleDemo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x = 5;
		
		VacuumBottle vBottle1 = new VacuumBottle(4, 120.0, 'C');
		VacuumBottle vBottle2 = new VacuumBottle(3, 50, 'C');
		VacuumBottle vBottle3 = new VacuumBottle(27, 50.0, 'C');
		VacuumBottle vBottle4 = new VacuumBottle(12, 232.0, 'K');
		
		System.out.println("vBottle1 is " + vBottle1);
		// a new method toKelvin() needs to be written in VacuumBottle class
		vBottle1 = vBottle2.toKelvin();
		System.out.println("vBottle2 to Kelvin is " + vBottle1);
		
		vBottle1.set(100,100, 'C');
		vBottle3.set(100, 212, 'F');
		System.out.println("Vacuum Bottle vBottle1 has " + vBottle1 );
		System.out.println("Vacuum Bottle vBottle3 has " + vBottle3 );
		
		if (vBottle1.equals(vBottle3))
		{
			System.out.println("These two Vacuum Bottles are equal");
		}
		else
		{
			System.out.println("These two Vacuum Bottles are not equal");
		}
		
		vBottle3 = vBottle1.add(vBottle2);
		System.out.println("vBottle1 is " + vBottle1);
		System.out.println("vBottle2 is " + vBottle2);
		System.out.println("sum of vBottle1 plus vBottle2 is " + vBottle3);
		
		vBottle3 = vBottle1.subtract(vBottle2);
		System.out.println("vBottle1 is " + vBottle1);
		System.out.println("vBottle2 is " + vBottle2);
		System.out.println("vBottle1 minus vBottle2 is " + vBottle3);
		
		vBottle3 = vBottle1.divideBy(x);
		System.out.println("vBottle1 is " + vBottle1);
		System.out.println("vBottle1 divided by " + x + " is " + vBottle3);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		VacuumBottle average;
		System.out.println("The program will now create 3 arrays of random sizes and prompt for values..");
		VacuumBottle[] vacuumBottleArrayOne;
		VacuumBottle[] vacuumBottleArrayTwo;
		VacuumBottle[] vacuumBottleArrayThree;
		
		vacuumBottleArrayOne = new VacuumBottle[getRandomArraySize()];
		System.out.println("This array has "+ vacuumBottleArrayOne.length + " element(s)."); 
		System.out.println("Please enter " + vacuumBottleArrayOne.length + " vacuum jar(s) in this form 10 @ 45 C");
		readvacuumBottleArray(vacuumBottleArrayOne);
		System.out.println("The values of the Vacuum Bottle array one are: ");
		printVacuumBottleArray(vacuumBottleArrayOne);
		average = getAverage(vacuumBottleArrayOne);
		System.out.println("The average of temperature array one is " + average);
		System.out.println();
		
		vacuumBottleArrayTwo = new VacuumBottle[getRandomArraySize()];
		System.out.println("This array has "+ vacuumBottleArrayTwo.length + " element(s)."); 
		System.out.println("Please enter " + vacuumBottleArrayTwo.length + " vacuum jar(s) in this form 10 @ 45 C");
		readvacuumBottleArray(vacuumBottleArrayTwo);
		System.out.println("The values of the Vacuum Bottle array one are: ");
		printVacuumBottleArray(vacuumBottleArrayTwo);
		average = getAverage(vacuumBottleArrayTwo);
		System.out.println("The average of temperature array one is " + average);
		System.out.println();

		vacuumBottleArrayThree = new VacuumBottle[getRandomArraySize()];
		System.out.println("This array has "+ vacuumBottleArrayThree.length + " element(s)."); 
		System.out.println("Please enter " + vacuumBottleArrayThree.length + " vacuum jar(s) in this form 10 @ 45 C");
		readvacuumBottleArray(vacuumBottleArrayThree);
		System.out.println("The values of the Vacuum Bottle array one are: ");
		printVacuumBottleArray(vacuumBottleArrayThree);
		average = getAverage(vacuumBottleArrayThree);
		System.out.println("The average of temperature array one is " + average);
		System.out.println();
		
		
		int sizeOfLargestArray = getSizezOfLargestArray(vacuumBottleArrayOne, vacuumBottleArrayTwo,
				vacuumBottleArrayThree);

		VacuumBottle[] arrayWithLargestValues = createArrayWithLargestValues(sizeOfLargestArray,vacuumBottleArrayOne,vacuumBottleArrayTwo, vacuumBottleArrayThree);

		System.out.println("\nHere are three arrays:");
		printVacuumBottleArray(vacuumBottleArrayOne);
		printVacuumBottleArray(vacuumBottleArrayTwo);
		printVacuumBottleArray(vacuumBottleArrayThree);
		System.out.println("\nAn array with the largest values taken from the\n"+
				"3 arrays has " + arrayWithLargestValues.length + " elements.");
		System.out.println("This solution new the largest size of the three arrays:");
		printVacuumBottleArray(arrayWithLargestValues);
	
	}//main
	private static int getRandomArraySize()
	{

		return (int)(Math.random()*5 + 1); 

	}
	private static void readvacuumBottleArray(VacuumBottle[] array)
	{
		VacuumBottle t1;
		
		for(int x = 0; x < array.length; x++)
		{
			t1 = new VacuumBottle();

			t1.read();
			array[x] = t1;

			
		}

	}
	private static void printVacuumBottleArray(VacuumBottle[] array)
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
	private static VacuumBottle getAverage(VacuumBottle[] array)
	{
		VacuumBottle average = new VacuumBottle(array[0]);
		for(int i = 1; i< array.length; i++)
		{
			average= average.add(array[i]);
		}
		average = average.divideBy(array.length);
		return average;
	}
	private static int getSizezOfLargestArray(VacuumBottle[] array1, VacuumBottle[] array2, VacuumBottle[] array3)
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
	private static VacuumBottle[] createArrayWithLargestValues(int sizeOfLargestArray, VacuumBottle[] array1, VacuumBottle[] array2, VacuumBottle[] array3)
	{

		VacuumBottle[] arrayWithLargestValues = new VacuumBottle[sizeOfLargestArray];
		VacuumBottle largest = null;

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
}//class