import java.util.Scanner;
import java.io.*;
public class PersonWithFiles extends Person
{
	public PersonWithFiles()
	{	
		super();  
	}
	public void readInputFile(Scanner read )
	{	
		String input;
		input = read.nextLine();
		System.out.println(“first name is: “ + input);
		setFName (input);
	}
	public void writeOutputFile( PrintWriter textStream)
	{
		textStream.println("Name " + getFName());}
}
