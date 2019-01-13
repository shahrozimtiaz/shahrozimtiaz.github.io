/*
 * SHAHROZ IMTIAZ
 * THIS PROGRAM GRABS ANY LENGTH HEXADECIMAL AND CONVERTS IT TO A DECIMAL
 */


package lab08;

import java.util.Scanner;

public class Lab08 {

	public static void main(String[] args) 
	{
		long value = 0; //DECLARING AND DEFINING VARIABLE 
	
		Scanner input = new Scanner(System.in);   //DEFINING SCANNER
		
		System.out.println("Enter in hexadecimal that you would like to convert");  //PRINT COMMAND 
		
		String originalData = input.nextLine();   //GRAB THE HEXADECIMAL 
		
		String data = originalData.toUpperCase();  //ENSURES THE CODE WORKS NO MATTER IF THE USER ENTERS IN LOWERCASE OR UPPERCASE LETTERS
		
		int z = data.length()-1;       //SO I KNOW WHICH POWER TO RAISE IT TO
		
		for(int i=0;i<=data.length()-1;i++)  //LOOP THAT SCANS THROUGH HEXADECIMAL 
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
				break;                                                      //LOOKS TO MATCH UP CHAR AND CONVERT IT TO A DECIMAL 
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
				}//SWITCH BRACKET
				
				z--;    //GO DOWN ONE POWER EACH TIME

		}//LOOP BRACKET 
	
		input.close();
		
		System.out.println("Original Hexadecimal: " + originalData.toUpperCase());
		System.out.println("Decimal Value: " + value);
		
	}//main

}//class
