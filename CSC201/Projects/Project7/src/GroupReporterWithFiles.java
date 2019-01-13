
import java.io.*;
public class GroupReporterWithFiles extends GroupReporter
{
	public   void printDataForReportFile(PrintWriter textStream)
	{	
		textStream.println("            The Dooflingy Company");	
		textStream.println("				Weekly Summary");	
		textStream.println("			Current      Year to date");	
		textStream.println("Federal:	 "+ dollarFormat.format(getCurrentFedTax()) + " 	" + dollarFormat.format(getFederalYearToDate()));	
		textStream.println("State:	 	" + dollarFormat.format(getCurrentStateTax()) + "	 " + dollarFormat.format(getStateYearToDate()));	
		textStream.println("Local:	 	" + dollarFormat.format(getCurrentLocalTax()) + " 		" + dollarFormat.format(getLocalYearToDate()));	
		textStream.println("Total Deductions: " + dollarFormat.format(getCurrentTotalDeductions()) + "	" + dollarFormat.format(getYearToDateTotalDeductions()));
		textStream.println();
		textStream.println("Gross Wages: " + dollarFormat.format(getGrossWages()));	
		textStream.println("Net Pay: " + dollarFormat.format(getNetPay()));			
	}
}
