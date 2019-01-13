package project3;

import java.text.DecimalFormat;

public class Company
{
	DecimalFormat dollarFormat = new DecimalFormat("$#,###,###.00");
	
	private double currentLocalTax=0;
	private double currentFedTax=0;
	private double currentStateTax=0;
	
	private double federalYearToDate=0;
	private double stateYearToDate=0;
	private double localYearToDate=0;
	private double currentTotalDeductions=0;
	private double yearToDateTotalDeductions=0;
	private double grossWages=0;
	private double netPay=0;
	
	public void collectDataForCompanyReport(Employee e)
	{
		currentFedTax = currentFedTax + e.getCurrentFederalTax(); 
		federalYearToDate = federalYearToDate + e.getFederalYearToDate();
		currentStateTax = currentStateTax + e.getCurrentStateTax();
		stateYearToDate = stateYearToDate + e.getStateYearToDate();
		currentLocalTax = currentLocalTax + e.getCurrentLocalTax();
		localYearToDate = localYearToDate + e.getLocalYearToDate();
		currentTotalDeductions = currentTotalDeductions + e.getTotalDeductions();
		yearToDateTotalDeductions = federalYearToDate + stateYearToDate + localYearToDate; 
		grossWages = grossWages + e.getGrossWages();
		netPay = grossWages - currentTotalDeductions;
	}
	public void printDataForCompanyReport()
	{
		System.out.println();
		System.out.println();
		OutPut.printStringRight(45,"            The Dooflingy Company");
		System.out.println();
		
		OutPut.printStringRight(45, "Weekly Summary");
		System.out.println();
		System.out.println();

		OutPut.printStringRight(56, "Current      Year to date");
		System.out.println();
		
		OutPut.printStringLeft(25, "Federal");
		OutPut.printStringRight(15, dollarFormat.format(currentFedTax));
		OutPut.printStringRight(15, dollarFormat.format(federalYearToDate));
		System.out.println();
		
		OutPut.printStringLeft(25, "State");
		OutPut.printStringRight(15, dollarFormat.format(currentStateTax));
		OutPut.printStringRight(15, dollarFormat.format(stateYearToDate));
		System.out.println();
		
		OutPut.printStringLeft(25, "Local");
		OutPut.printStringRight(15, dollarFormat.format(currentLocalTax));
		OutPut.printStringRight(15, dollarFormat.format(localYearToDate));
		System.out.println();
		System.out.println();
		System.out.println();
		
		OutPut.printStringLeft(25, "Total Deductions");
		OutPut.printStringRight(15, dollarFormat.format(currentTotalDeductions));
		OutPut.printStringRight(15, dollarFormat.format(yearToDateTotalDeductions));
		System.out.println();
		
		OutPut.printStringLeft(25, "Gross Wages");
		OutPut.printStringRight(15, dollarFormat.format(grossWages));
		System.out.println();
		
		OutPut.printStringLeft(25, "Net Pay");
		OutPut.printStringRight(15, dollarFormat.format(netPay));
		System.out.println();
	}

}//class
