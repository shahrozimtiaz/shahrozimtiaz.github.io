//Demo
import java.io.*;
import java.util.Scanner;
// This demo must be used in Project 7
public class GroupReporterDemo
{
	public static void main(String[] args)
	{
		Scanner scan = new  Scanner(System.in);
		Scanner scanFile = TextFileIO.createTextRead("in.txt");
		PrintWriter outStream = TextFileIO.createTextWrite("out.txt");
		int numberOfPersons, i, count;
		GroupReporterWithFiles clerk = new GroupReporterWithFiles( );
		PersonWithFiles person = new PersonWithFiles();// one person
		System.out.println("Enter number of persons:");
		numberOfPersons = scan.nextInt();
		int tracker = 0;
		for(i = 0; i < numberOfPersons; i++)
		{
			person.readInputFile(scanFile, numberOfPersons, tracker);// from personWithFiles
			person.calculateData();// from person
			person.writeOutputFile(outStream );// from personWithFiles
			person.writeOutput();// to the screen from person
			clerk.collectDataForCompanyReport(person);// from GroupReporter
			tracker++;
		}
		System.out.println();
		clerk.printDataForCompanyReport();// to the screen from GroupReporter
		clerk.printDataForReportFile(outStream);// to file from GroupReporterWithFiles
		outStream.close( );
		scanFile.close();
	}
}

