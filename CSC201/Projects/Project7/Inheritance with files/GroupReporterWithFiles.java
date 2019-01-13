
import java.io.*;
public class GroupReporterWithFiles extends GroupReporter
{
	public   void printDataForReportFile(PrintWriter textStream)
	{	
		textStream.println("to the file number of people is "
				+ getNumberCount());	
	}
}
