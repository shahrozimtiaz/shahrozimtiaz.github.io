import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
public class PersonWithFiles extends Person
{
	DecimalFormat dollarFormat = new DecimalFormat("$#,###,###.00");
	
	public PersonWithFiles()
	{	
		super();
	}
	public void readInputFile(Scanner read, int numberOfPersons,int tracker )
	{	
		String input;
		int numberWhole;
		double numberDeci;
		
		input = read.nextLine();
		System.out.println("First name is: " + input);
		setFirstName (input);
		
		input = read.nextLine();
		System.out.println("Last name is: " + input);
		setLastName (input);
		
		numberWhole = read.nextInt();
		System.out.println("Dependents: " + numberWhole);
		setDependents (numberWhole);
		
		numberDeci = read.nextDouble();
		System.out.println("HourlyRate: " + numberDeci);
		setHourlyRate (numberDeci);
		
		numberDeci = read.nextDouble();
		System.out.println("HoursWorked: " + numberDeci);
		setHoursWorked (numberDeci);
		
		numberDeci = read.nextDouble();
		System.out.println("LocalTaxWithheld: " + numberDeci);
		setLocalTaxWithheld (numberDeci);
		
		numberDeci = read.nextDouble();
		System.out.println("FederalTaxWithheld: " + numberDeci);
		setFederalTaxWithheld (numberDeci);
		
		numberDeci = read.nextDouble();
		System.out.println("StateTaxWithheld: " + numberDeci);
		setStateTaxWithheld (numberDeci);
		
		if(tracker<numberOfPersons-1)
		{
			read.nextLine();
			tracker++;
		}
		
	}
	public void writeOutputFile( PrintWriter textStream)
	{
		textStream.println("Name: " + getFirstName() + " " + getLastName());
		textStream.println("Hours Worked: " + getHoursWorked());
		textStream.println("Hourly Rate: " + dollarFormat.format(getHourlyRate()));
		textStream.println("	Gross Wages: " + dollarFormat.format(getGrossWages()));
		textStream.println("					 Current     Yr to Date");
		textStream.println("	Federal:         " + dollarFormat.format(getCurrentFederalTax()) + "	 " + dollarFormat.format(getFederalYearToDate()));
		textStream.println("	State:           " + dollarFormat.format(getCurrentStateTax())   + "	 	" + dollarFormat.format(getStateYearToDate()));
		textStream.println("	Local:           " + dollarFormat.format(getCurrentLocalTax())   + "	 	" + dollarFormat.format(getLocalYearToDate()));
		textStream.println("	Total Deductions:         " + dollarFormat.format(getTotalDeductions()));
		textStream.println("	Net Pay:                  " + dollarFormat.format(getCurrentFederalTax()));
		textStream.println();
	}
}//class
