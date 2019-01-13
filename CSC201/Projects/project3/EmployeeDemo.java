package project3;

import java.util.Scanner;

public class EmployeeDemo
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		Company clerk = new Company( );
		Employee employee = new Employee();// one student
		int count;
		System.out.println("Enter number of employees:");
		int numberOfEmployees = scan.nextInt();
		//for (count = 1; count <= numberOfEmployees; count++)
		//{
			count = 1;
			System.out.println("Enter data for employee number " + count);
			employee.readInput();
			employee.calculateData();
			employee.writeOutput( );
			clerk.collectDataForCompanyReport(employee);
	//	}
		clerk.printDataForCompanyReport();
	}//main
}//class
