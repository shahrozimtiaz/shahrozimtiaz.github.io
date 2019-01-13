package project3;

import java.util.*;
import java.text.DecimalFormat;

public class Employee 
{
	Scanner scan = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private int dependents;
	private double hourlyRate;
	private double hoursWorked;
	private double localTaxWithheld;
	private double federalTaxWithheld;
	private double stateTaxWithheld;
	private double currentLocalTax;
	private double currentFederalTax;
	private double currentStateTax;
	private double grossWages;
	private double federalYearToDate;
	private double stateYearToDate;
	private double localYearToDate;
	private double totalDeductions;
	private double netPay;
	
	DecimalFormat dollarFormat = new DecimalFormat("$#,###,###.00");

	
	public void readInput()
	{
		String enter = "";
		System.out.println("Enter the first name of employee: ");
		firstName = scan.nextLine();
		System.out.println("Enter the last name of employee: ");
		lastName = scan.nextLine();
		System.out.println("Enter the number of dependents: ");
		dependents = scan.nextInt();
		System.out.println("Enter the number of hours worked: ");
		hoursWorked = scan.nextDouble();
		System.out.println("Enter the hourly rate: ");
		hourlyRate = scan.nextDouble();
		System.out.println("Enter the federal tax withheld: ");
		federalTaxWithheld = scan.nextDouble();
		System.out.println("Enter the state tax withheld: ");
		stateTaxWithheld = scan.nextDouble();
		System.out.println("Enter the local tax withheld: ");
		localTaxWithheld = scan.nextDouble();
		enter = scan.nextLine();
		
	}
	public void calculateData()
	{
		grossWages = calculategrossWages();
		currentFederalTax = calculateCurrentFederalTax();
		currentStateTax = calculateCurrentStateTax();
		currentLocalTax = calculateCurrentLocalTax();
		
		federalYearToDate = currentFederalTax + federalTaxWithheld;
		stateYearToDate = currentStateTax + stateTaxWithheld; 
		localYearToDate = currentLocalTax + localTaxWithheld;
		totalDeductions = currentFederalTax + currentStateTax + currentLocalTax;
		
		netPay = grossWages - totalDeductions;
		
	}
	private double calculategrossWages()
	{
		double localGrossWages = 0;
		if(hoursWorked > 40)
		{
			localGrossWages = ((hoursWorked - 40) * hourlyRate * 1.5 + hourlyRate * 40) +.005;
		}
		else
		{
			localGrossWages = (hourlyRate * hoursWorked) +.005;
		}
		return localGrossWages;
	}
	private double calculateCurrentFederalTax()
	{
		double localGrossWages = grossWages - (dependents * 15);
		double cft;
		double ygw = localGrossWages * 52;
		if(ygw < 20000)
		{
			cft = localGrossWages *.1;
		}
		else if(ygw >= 20000 && ygw <= 40000)
		{
			cft = localGrossWages * .2;
		}
		else
		{
			cft = localGrossWages * .3;
		}
		return cft;
	}
	private double calculateCurrentStateTax()
	{
		double ygw = grossWages * 52;
		double cst;
		if(ygw <= 30000)
		{
			cst = grossWages * .05;
		}
		else
		{
			cst = grossWages * .1;
		}
		return cst;
	}
	private double calculateCurrentLocalTax()
	{
		double localTax = grossWages * .0115;
		
		if( localTax + localTaxWithheld > 517.5)
		{
			localTax = 517.5 - localTaxWithheld;
		}
		return localTax;
	}
	
	public void writeOutput()
	{
		String a = "";
		String fullName = firstName + " " + lastName;
		OutPut.printStringLeft(15, "Employee");
		OutPut.printStringLeft(40, fullName);
		System.out.println();
		
		OutPut.printStringLeft(15, "Hours Worked");
		a = a + hoursWorked;
		OutPut.printStringLeft(40, a);
		System.out.println();
		
		OutPut.printStringLeft(15, "Hourly Rate:" );
		OutPut.printStringLeft(40, dollarFormat.format(hourlyRate));
		System.out.println();
		
		OutPut.printStringLeft(15, "Gross Wages");
		OutPut.printStringRight(40, dollarFormat.format(grossWages));
		System.out.println();
		
		OutPut.printStringRight(50, "Current      Year to date");
		System.out.println();
		
		OutPut.printStringLeft(25, "Federal");
		OutPut.printStringRight(5, dollarFormat.format(currentFederalTax));
		OutPut.printStringRight(15, dollarFormat.format(federalYearToDate));
		System.out.println();
		
		OutPut.printStringLeft(25, "State");
		OutPut.printStringRight(5, dollarFormat.format(currentStateTax));
		OutPut.printStringRight(15, dollarFormat.format(stateYearToDate));
		System.out.println();
		
		OutPut.printStringLeft(25, "Local");
		OutPut.printStringRight(5, dollarFormat.format(currentLocalTax));
		OutPut.printStringRight(15, dollarFormat.format(localYearToDate));
		System.out.println();
		
		OutPut.printStringLeft(15, "Total Deductions");
		OutPut.printStringRight(40, dollarFormat.format(totalDeductions));
		System.out.println();
		
		OutPut.printStringLeft(15, "Net Pay");
		OutPut.printStringRight(40, dollarFormat.format(netPay));
		System.out.println();
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDependents() {
		return dependents;
	}
	public void setDependents(int dependents) {
		this.dependents = dependents;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getLocalTaxWithheld() {
		return localTaxWithheld;
	}
	public void setLocalTaxWithheld(double localTaxWithheld) {
		this.localTaxWithheld = localTaxWithheld;
	}
	public double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}
	public void setFederalTaxWithheld(double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}
	public double getStateTaxWithheld() {
		return stateTaxWithheld;
	}
	public void setStateTaxWithheld(double stateTaxWithheld) {
		this.stateTaxWithheld = stateTaxWithheld;
	}
	public double getCurrentLocalTax() {
		return currentLocalTax;
	}
	public void setCurrentLocalTax(double currentLocalTax) {
		this.currentLocalTax = currentLocalTax;
	}
	public double getCurrentFederalTax() {
		return currentFederalTax;
	}
	public void setCurrentFederalTax(double currentFederalTax) {
		this.currentFederalTax = currentFederalTax;
	}
	public double getCurrentStateTax() {
		return currentStateTax;
	}
	public void setCurrentStateTax(double currentStateTax) {
		this.currentStateTax = currentStateTax;
	}
	public double getGrossWages() {
		return grossWages;
	}
	public void setGrossWages(double grossWages) {
		this.grossWages = grossWages;
	}
	public double getFederalYearToDate() {
		return federalYearToDate;
	}
	public void setFederalYearToDate(double federalYearToDate) {
		this.federalYearToDate = federalYearToDate;
	}
	public double getStateYearToDate() {
		return stateYearToDate;
	}
	public void setStateYearToDate(double stateYearToDate) {
		this.stateYearToDate = stateYearToDate;
	}
	public double getLocalYearToDate() {
		return localYearToDate;
	}
	public void setLocalYearToDate(double localYearToDate) {
		this.localYearToDate = localYearToDate;
	}
	public double getTotalDeductions() {
		return totalDeductions;
	}
	public void setTotalDeductions(double totalDeductions) {
		this.totalDeductions = totalDeductions;
	}
	public double getNetPay() {
		return netPay;
	}
	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}
	public DecimalFormat getDollarFormat() {
		return dollarFormat;
	}
	public void setDollarFormat(DecimalFormat dollarFormat) {
		this.dollarFormat = dollarFormat;
	}

}//class
