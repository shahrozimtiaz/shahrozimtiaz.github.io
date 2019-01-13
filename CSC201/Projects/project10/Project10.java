package project10;

import java.util.Scanner;
import java.io.*;
import javax.swing.JApplet;

import project8.TextFileIO;

import java.awt.*;

public class Project10 extends JApplet
{
	int count = 10;
	int forColor = 1;
	
	public void paint (Graphics page)
	{
		
		page.setColor(Color.black);                 //title
		String out = "Sunset and Sunrise Graph";
		Font saveFont = page.getFont();
		page.setFont(new Font("Times New Roman", Font.BOLD, 25));
		page.drawString(out, 630, 200);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		// puts on months labels
		timesLabel(page);// puts on times labels
		
		graph(page); //graph sunset && sunrise
		
		
	}
	
	public void graph(Graphics page)
	{
		int xForVerticalLines = 250;
		
		page.drawLine (250, 300, 250, 850);  // Y-line
		page.drawLine (250, 850, 1345, 850);  // X-line
		
		Scanner file = TextFileIO.createTextRead("sunData.txt");
		
		int monthCounter = 0;
		int space1,space2,space3,space4,setTime,lastRiseTime;
		int riseTime = 700;
		int xTracker = 250;
		
		int dayTracker = 0;
		int count = 0;
		for(int day=1;day<=365;day++)
		{
			lastRiseTime = riseTime;
			int dayCounter = file.nextInt();
				
				
				
			dayTracker = dayCounter;
			String timeString = file.nextLine();
			
			 space1= timeString.indexOf(' ', 0);
			 space2= timeString.indexOf(' ', space1+1);
			 space3= timeString.indexOf(' ', space2+1);
			 space4= timeString.indexOf(' ', space3+1);

			String riseHourString = timeString.substring(space1+1, space2); //sunrise time
			String riseMinString = timeString.substring(space2+1,space3);
				if(riseMinString.length()<2)
				{
					riseMinString = "0" + riseMinString;
				}
			
			String setHourString = timeString.substring(space3+1, space4); //sunset time
			String setMinString = timeString.substring(space4+1);
				if(setMinString.length()<2)
				{
					setMinString = "0" + setMinString;
				}
				
				int riseTimeMin = Integer.parseInt(riseMinString);
				int riseTimeHour = Integer.parseInt(riseHourString);
				
				riseTime = riseTimeHour * 60 + riseTimeMin;
				
				int setTimeMin = Integer.parseInt(setMinString);
				int setTimeHour = Integer.parseInt(setHourString);
				
				setTime = (setTimeHour-12) * 60 + setTimeMin;
				
				
				
				page.drawOval(xTracker,riseTime+67,2,3);
				page.drawOval(xTracker,setTime+360,2,2);

				
				if(dayCounter == 1)
				{
					if(count>=1)
					{
						
						page.drawLine (xTracker, 300, xTracker, 850);
						monthCounter++;
						monthsLabel(page, xTracker, monthCounter);
				
					}
					count ++;
					 
				}
				if(count == 12 && dayCounter == 31)
				{
						page.drawLine (xTracker, 300, xTracker, 850);
						monthCounter=12;
						monthsLabel(page, xTracker, monthCounter);						
					count ++;					
				}
				xTracker = xTracker+3;
		}
		file.close();
	}
	private void monthsLabel(Graphics page, int x, int month)//months labels
	{
		String out;
		
		switch(month)
		{
		case 1:
			
		page.setColor(Color.black);			//12 months label
		out = "Jan";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 2:

		page.setColor(Color.black);
		out = "Feb";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 3:

		page.setColor(Color.black);
		out = "Mar";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 4:

		page.setColor(Color.black);
		out = "Apr";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 5:

		page.setColor(Color.black);
		out = "May";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 6:

		page.setColor(Color.black);
		out = "Jun";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 7:

		page.setColor(Color.black);
		out = "Jul";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 8:

		page.setColor(Color.black);
		out = "Aug";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 9:

		page.setColor(Color.black);
		out = "Sep";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 10:

		page.setColor(Color.black);
		out = "Oct";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 11:

		page.setColor(Color.black);
		out = "Nov";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		
		case 12:

		page.setColor(Color.black);
		out = "Dec";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, x-80, 870);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		break;
		}
	}
	private void timesLabel(Graphics page)//Times labels
	{
		String out;
		
		page.setColor(Color.black);			//10 time label
		out = "8:00 PM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 850);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		page.setColor(Color.black);			
		out = "7:00 PM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 790);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		page.setColor(Color.black);			
		out = "6:00 PM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 730);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		page.setColor(Color.black);			
		out = "5:00 PM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 670);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		page.setColor(Color.black);			
		out = "4:00 PM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 610);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		page.setColor(Color.black);			
		out = "8:00 AM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 550);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		page.setColor(Color.black);			
		out = "7:00 AM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 490);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		page.setColor(Color.black);			
		out = "6:00 AM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 430);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		page.setColor(Color.black);			
		out = "5:00 AM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 370);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
		page.setColor(Color.black);			
		out = "4:00 AM";
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 185, 310);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		
	}
	
}//class

