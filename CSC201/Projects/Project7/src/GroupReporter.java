import java.text.DecimalFormat;

public class GroupReporter
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
	
	public void collectDataForCompanyReport(Person e)
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
		System.out.println("            The Dooflingy Company");
		System.out.println();
		
		System.out.println( "Weekly Summary");
		System.out.println();
		System.out.println();

		System.out.println("Current      Year to date");
		System.out.println();
		
		System.out.println("Federal");
		System.out.println(dollarFormat.format(currentFedTax));
		System.out.println( dollarFormat.format(federalYearToDate));
		System.out.println();
		
		System.out.println( "State");
		System.out.println( dollarFormat.format(currentStateTax));
		System.out.println(dollarFormat.format(stateYearToDate));
		System.out.println();
		
		System.out.println("Local");
		System.out.println(dollarFormat.format(currentLocalTax));
		System.out.println( dollarFormat.format(localYearToDate));
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Total Deductions");
		System.out.println(dollarFormat.format(currentTotalDeductions));
		System.out.println( dollarFormat.format(yearToDateTotalDeductions));
		System.out.println();
		
		System.out.println( "Gross Wages");
		System.out.println(dollarFormat.format(grossWages));
		System.out.println();
		
		System.out.println( "Net Pay");
		System.out.println(dollarFormat.format(netPay));
		System.out.println();
	}
	public DecimalFormat getDollarFormat() {
		return dollarFormat;
	}
	public void setDollarFormat(DecimalFormat dollarFormat) {
		this.dollarFormat = dollarFormat;
	}
	public double getCurrentLocalTax() {
		return currentLocalTax;
	}
	public void setCurrentLocalTax(double currentLocalTax) {
		this.currentLocalTax = currentLocalTax;
	}
	public double getCurrentFedTax() {
		return currentFedTax;
	}
	public void setCurrentFedTax(double currentFedTax) {
		this.currentFedTax = currentFedTax;
	}
	public double getCurrentStateTax() {
		return currentStateTax;
	}
	public void setCurrentStateTax(double currentStateTax) {
		this.currentStateTax = currentStateTax;
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
	public double getCurrentTotalDeductions() {
		return currentTotalDeductions;
	}
	public void setCurrentTotalDeductions(double currentTotalDeductions) {
		this.currentTotalDeductions = currentTotalDeductions;
	}
	public double getYearToDateTotalDeductions() {
		return yearToDateTotalDeductions;
	}
	public void setYearToDateTotalDeductions(double yearToDateTotalDeductions) {
		this.yearToDateTotalDeductions = yearToDateTotalDeductions;
	}
	public double getGrossWages() {
		return grossWages;
	}
	public void setGrossWages(double grossWages) {
		this.grossWages = grossWages;
	}
	public double getNetPay() {
		return netPay;
	}
	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}
	
}//class
