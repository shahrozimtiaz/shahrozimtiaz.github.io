
import java.util.Scanner;
import java.text.DecimalFormat; // Formats numbers
public class Person
{
	private String firstName;// this data corresponds to data in 
	// project 3
	public void readInput( )
	{	
		Scanner scan = new  Scanner(System.in);
		System.out.print("Enter name  ");
		firstName = scan.nextLine();    	
	}
	public void compute( )
	{
		firstName = "Hi " + firstName;
	}
	public void writeOutput( )
	{	
		System.out.println("hi from screen " + firstName);
	}
	public String getFName( )
	{	
		return firstName;	
	}
	public void setFName( String S)
	{    
		firstName = S;	
	}
}




//contents of input file
//fred
//sue
//tom

