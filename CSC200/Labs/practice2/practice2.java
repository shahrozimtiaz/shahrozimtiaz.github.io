package practice2;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) 
	{
		long value;
		value = 0;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in hexadeciaml that you would like to convert");
		
		
		String originalData = input.nextLine();
		
		String data = originalData.toUpperCase();
		
		
		int z = data.length()-1;
		
		for(int i=0;i<=data.length()-1;i++)
		{
	
			{
				switch(data.charAt(i))
				{
				case '0': value += 0;
				case '1': value += 1 * Math.pow(16,z);
				break;
				case '2': value += 2 * Math.pow(16,z);
				break;
				case '3': value += 3 * Math.pow(16,z);
				break;
				case '4': value += 4 * Math.pow(16,z);
				break;
				case '5': value += 5 * Math.pow(16,z);
				break;
				case '6': value += 6 * Math.pow(16,z);
				break;
				case '7': value += 7 * Math.pow(16,z);
				break;
				case '8': value += 8 * Math.pow(16,z);
				break;
				case '9': value += 9 * Math.pow(16,z);
				break;
				case 'A': value += 10 * Math.pow(16,z);
				break;
				case 'B': value += 11 * Math.pow(16,z);
				break;
				case 'C': value += 12 * Math.pow(16,z);
				break;
				case 'D': value += 13 * Math.pow(16,z);
				break;
				case 'E': value += 14 * Math.pow(16,z);
				break;
				case 'F': value += 15 * Math.pow(16,z);
				break;
				}
				
				z--;
			}
			
			
		}
	
		input.close();
		
		System.out.println("Orignal Hexadecimal: " + originalData);
		System.out.println("Decimal Value: " + (int)value);
		

	}

}
