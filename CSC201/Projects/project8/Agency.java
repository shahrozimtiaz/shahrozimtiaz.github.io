//package project8;

import java.util.ArrayList;
import java.util.Scanner;
public class Agency extends RealEstateListing
{
	private String agency;
	
	private ArrayList<RealEstateListing> realEstateListingArray = new ArrayList<RealEstateListing>();
	
	public Agency(String agency, String agencyFile)
	{
		this.agency = agency; 
		Scanner scanAgencyFile = TextFileIO.createTextRead(agencyFile);
		readFile(scanAgencyFile);
		scanAgencyFile.close();
       }
	public void readFile(Scanner read)
	{	


		int totalListings = read.nextInt();
		read.nextInt(); //listing tracker
		String enterKey = read.nextLine(); //enter key
		
		int tracker = 0;
		
		for(int x = 0; x<totalListings;x++)
		{
		
			RealEstateListing singleListing = new RealEstateListing();
			singleListing.readRealEstateListing(read);
			
			if(tracker<totalListings-1)
			{
				read.nextLine();
				tracker++;
			}
			realEstateListingArray.add(singleListing);
		}
	}
		
	public ArrayList<RealEstateListing> style(String desiredStyle)
	{
		ArrayList<RealEstateListing> listForOne = new ArrayList<RealEstateListing>();
		
		for(RealEstateListing singleHome : realEstateListingArray)
		{
			if(singleHome.getStyle().equals(desiredStyle))
			{
				listForOne.add(singleHome);
			}
		}
		return listForOne;
		//*** Creates an ArrayList of for this criteria. 	
		//*** Each criteria creates a list.	
	}	
	public ArrayList<RealEstateListing> bedroom(int bedroom)
	{
		ArrayList<RealEstateListing> listForOne = new ArrayList<RealEstateListing>();
		
		for(RealEstateListing singleHome : realEstateListingArray)
		{
			if(singleHome.getNumBedrooms() == bedroom)
			{
				listForOne.add(singleHome);
			}
		}
		return listForOne;
		//*** Creates an ArrayList of for this criteria. 	
		//*** Each criteria creates a list.	
	}	
	public ArrayList<RealEstateListing> bathroom(int bathroom)
	{
		ArrayList<RealEstateListing> listForOne = new ArrayList<RealEstateListing>();
		
		for(RealEstateListing singleHome : realEstateListingArray)
		{
			if(singleHome.getNumBathrooms() == bathroom)
			{
				listForOne.add(singleHome);
			}
		}
		return listForOne;
		//*** Creates an ArrayList of for this criteria. 	
		//*** Each criteria creates a list.	
	}
	public ArrayList<RealEstateListing> lotSize(double lotSize)
	{
		ArrayList<RealEstateListing> listForOne = new ArrayList<RealEstateListing>();
		
		for(RealEstateListing singleHome : realEstateListingArray)
		{
			if(singleHome.getLotSize() >= lotSize)
			{
				listForOne.add(singleHome);
			}
		}
		return listForOne;
		//*** Creates an ArrayList of for this criteria. 	
		//*** Each criteria creates a list.	
	}
	public ArrayList<RealEstateListing> age(int age)
	{
		ArrayList<RealEstateListing> listForOne = new ArrayList<RealEstateListing>();
		
		for(RealEstateListing singleHome : realEstateListingArray)
		{
			if(singleHome.getAge() <= age)
			{
				listForOne.add(singleHome);
			}
		}
		return listForOne;
		//*** Creates an ArrayList of for this criteria. 	
		//*** Each criteria creates a list.	
	}
	public ArrayList<RealEstateListing> price(double price)
	{
		ArrayList<RealEstateListing> listForOne = new ArrayList<RealEstateListing>();
		
		for(RealEstateListing singleHome : realEstateListingArray)
		{
			if(singleHome.getPrice() <= price)
			{
				listForOne.add(singleHome);
			}
		}
		return listForOne;
		//*** Creates an ArrayList of for this criteria. 	
		//*** Each criteria creates a list.	
	}
	public ArrayList<RealEstateListing> distance(double distance)
	{
		ArrayList<RealEstateListing> listForOne = new ArrayList<RealEstateListing>();
		
		for(RealEstateListing singleHome : realEstateListingArray)
		{
			if(singleHome.getDistanceWork() <= distance)
			{
				listForOne.add(singleHome);
			}
		}
		return listForOne;
		//*** Creates an ArrayList of for this criteria. 	
		//*** Each criteria creates a list.	
	}
	public ArrayList<RealEstateListing> jurisdiction(String j)
	{
		ArrayList<RealEstateListing> listForOne = new ArrayList<RealEstateListing>();
		
		for(RealEstateListing singleHome : realEstateListingArray)
		{
			if(singleHome.getJurisdiction().equals(j))
			{
				listForOne.add(singleHome);
			}
		}
		return listForOne;
		//*** Creates an ArrayList of for this criteria. 	
		//*** Each criteria creates a list.	
	}
}//class
