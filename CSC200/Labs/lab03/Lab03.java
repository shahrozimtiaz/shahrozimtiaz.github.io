/*
 * Shahroz Imtiaz
 * This program calculates how much money you will have after 4 months of depositing 100 each month plus interest.
 */

package lab03;

public class Lab03 
{

	public static void main(String[] args) 
	{
		double value,value1,value2,value3,value4; //Declaring my variables 
		
		value = 100;         // Original savings money
		value1 = ((value)) + ((.05/12)*(value));    //savings money after one month
		value2 = ((value1))+ ((.05/12)*(value1));  //savings money after two months
		value3 = ((value2)) + ((.05/12)*(value2));  //savings money after three months
		value4 = ((value3)) + ((.05/12)*(value3));  //savings money after four months
		
		System.out.println(value4);   ////print out savings money after four months

	}//main
	

}//class
