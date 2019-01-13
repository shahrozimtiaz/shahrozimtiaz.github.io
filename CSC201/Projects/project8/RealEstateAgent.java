package project8;

import java.util.ArrayList;
import java.util.Scanner;

public class RealEstateAgent //*** this is the largest class
{	
	
	Scanner scan = new Scanner(System.in);
	//*** ArrayLists that I used.
	private ArrayList<Agency> agencyArray;	
	private ArrayList<RealEstateListing> listingsFromOneAgency;
	private ArrayList<RealEstateListing> finalArrayListOfRealEstateListings;
	
	private String answerSoFar;
	private String agencies; 
	private String criteria;
	private Agency century21 = null;
	private Agency reMax = null;
	private Agency mcEnearney = null;
	private Agency longAndFoster = null;

	public RealEstateAgent()
	{	
		century21 = new Agency("Century 21","Century21.txt");
		longAndFoster = new Agency("Long & Foster","Long&Foster.txt");
		mcEnearney = new Agency("McEnearney","McEnearney.txt");
		reMax = new Agency("ReMax","ReMax.txt");
		
	}
	
	public String listingsChosen()
	{

		answerSoFar = "";
		agencies = "";
		criteria = "The criteria is ";
		
		agencyArray = new ArrayList<Agency>();	
		listingsFromOneAgency = new ArrayList<RealEstateListing>();
		finalArrayListOfRealEstateListings = new ArrayList<RealEstateListing>();
		
		getAgenciesForTheExhibition();
		
		int homeCriterion = pickHomeCriterion();
		
		switch (homeCriterion)
		{
		case 1:// Style
			int style = getStyle();
			finalArrayListOfRealEstateListings = style(style, agencyArray);
			
			break;
		case 2:// bed
			int bed = getnumBedrooms();
			finalArrayListOfRealEstateListings = bedroom(bed, agencyArray);
			
			break;
		case 3:// bath
			int bath = getnumBathrooms();
			finalArrayListOfRealEstateListings = bathroom(bath, agencyArray);
			
			break;
		case 4:// lot
			int lot = getLotSize();
			finalArrayListOfRealEstateListings = lotSize(lot, agencyArray);
			
			break;
		case 5:// age
			int age = getAge();
			finalArrayListOfRealEstateListings = age(age, agencyArray);
			
			break;
		case 6:// price
			int price = getPrice();
			finalArrayListOfRealEstateListings = price(price, agencyArray);
			
			break;
		case 7:// distance
			int distance = getDistance();
			finalArrayListOfRealEstateListings = distance(distance, agencyArray);
			
			break;
		case 8:// jurisdiction
			int jurisdiction = getJurisdiction();
			finalArrayListOfRealEstateListings = jurisdiction(jurisdiction, agencyArray);
			
			break;
		

		default:
			System.out.println("bad topic Selection choice " + homeCriterion);
			System.exit(0);
		}// switch
		
		//*** I have a method that creates a string of the agencies used.
		//*** I have a method that takes the final list of homes  
		//*** and puts them in a string that is returned. 
		int i = 1;
		for(RealEstateListing singlehouses : finalArrayListOfRealEstateListings)
		{
			answerSoFar += i + ")	"	+ singlehouses.toString();
			i++;
		}
		
		System.out.println("The Agencies used were:" + agencies);
		System.out.println(criteria);
		return answerSoFar;
	}

	public int getStyle()
	{
		System.out.println("Please choose the Style() and enter its number."
				+ "\n1) Colonial"
				+ "\n2) Condominium"
				+"\n3) Georgian"
				+"\n4) Townhouse"
				+"\n5) Rambler"
				+"\n6) Split Level"
				+"\n7) Cape Cod");
		return scan.nextInt();
	}
	public int getnumBedrooms()
	{
		System.out.println("How many Bedrooms would you like?");
		return scan.nextInt();
	}
	public int getnumBathrooms()
	{
		System.out.println("How many Bathrooms would you like?");
		return scan.nextInt();
	}
	public int getLotSize()
	{
		System.out.println("Please choose the Lot Size and enter its number."
				+ "\n1) over .25"
				+ "\n2) over .50"
				+"\n3) over 1"
				+"\n4) over 2");
		return scan.nextInt();
	}
	public int getAge()
	{
		System.out.println("Please choose the Age and enter its number."
				+ "\n1) under 2 years"
				+ "\n2) under 4 years"
				+"\n3) under 6 years"
				+"\n4) under 10 years");
		return scan.nextInt();
	}
	public int getPrice()//////////////////////////////// Needs to be edited 
	{
		System.out.println("Please choose the Price and enter its number."
				+ "\n1) under $100,000"
				+ "\n2) under $150,000"
				+"\n3) under $250,000"
				+"\n4) under $400,000");
		return scan.nextInt();
	}
	public int getDistance()
	{
		System.out.println("Please choose the Distance from work and enter its number."
				+ "\n1) under 5 miles"
				+ "\n2) under 10 miles"
				+"\n3) under 15 miles");
		return scan.nextInt();
	}
	public int getJurisdiction()
	{
		System.out.println("Please choose the Jurisdiction and enter its number."
				+ "\n1) Alexandria"
				+ "\n2) Arlington"
				+"\n3) Fairfax"
				+"\n4) Falls Church"
				+"\n5) District of Columbia");
		return scan.nextInt();
	}
	
	public  ArrayList<RealEstateListing> style(int styleType, ArrayList<Agency> agencyArray)
	{
		
		String style = "";

		switch(styleType)
		{
		case 1: style = "Colonial";
		break;
		case 2: style = "Condominium";
		break;
		case 3: style = "Georgian";		
		break;
		case 4: style = "Townhouse";
		break;
		case 5: style = "Rambler";
		break;
		case 6: style = "Split Level";
		break;
		case 7: style = "Cape Cod";
		break;
		}
		criteria += style;
		

		for(int i=0;i<=agencyArray.size()-1;i++)//agency 
		{
			Agency temp;
			temp = agencyArray.get(i);
			this.listingsFromOneAgency = temp.style(style);
			for(RealEstateListing singlehouse : listingsFromOneAgency)
			{
				finalArrayListOfRealEstateListings.add(singlehouse);
			}
			//insert a for each loop to assign individual houses to a new array list of homelistings
			//answerSoFar += listingsFromOneAgency.toString();
			
		}
		return finalArrayListOfRealEstateListings;


		//*** ask each agency to give a list that satisfies the requested style.
	}//END METHOD
	public  ArrayList<RealEstateListing> bedroom(int bedroom, ArrayList<Agency> agencyArray)
	{
		criteria += bedroom;

		

		for(int i=0;i<=agencyArray.size()-1;i++)//agency 
		{
			Agency temp;
			temp = agencyArray.get(i);
			this.listingsFromOneAgency = temp.bedroom(bedroom);
			for(RealEstateListing singlehouse : listingsFromOneAgency)
			{
				finalArrayListOfRealEstateListings.add(singlehouse);
			}
			//insert a for each loop to assign individual houses to a new array list of homelistings
			//answerSoFar += listingsFromOneAgency.toString();
			
		}
		return finalArrayListOfRealEstateListings;


		//*** ask each agency to give a list that satisfies the requested style.
	}//END METHOD
	public  ArrayList<RealEstateListing> bathroom(int bathroom, ArrayList<Agency> agencyArray)
	{	
		criteria += bathroom;

		for(int i=0;i<=agencyArray.size()-1;i++)//agency 
		{
			Agency temp;
			temp = agencyArray.get(i);
			this.listingsFromOneAgency = temp.bathroom(bathroom);
			for(RealEstateListing singlehouse : listingsFromOneAgency)
			{
				finalArrayListOfRealEstateListings.add(singlehouse);
			}
			//insert a for each loop to assign individual houses to a new array list of homelistings
			//answerSoFar += listingsFromOneAgency.toString();
			
		}
		return finalArrayListOfRealEstateListings;


		//*** ask each agency to give a list that satisfies the requested style.
	}//END METHOD
	public  ArrayList<RealEstateListing> lotSize(int lotSize, ArrayList<Agency> agencyArray)
	{
		double size = 0;

		switch(lotSize)
		{
			case 1: size = .25;
			break;
			case 2: size = .50;
			break;
			case 3: size = 1.0;
			break;
			case 4: size = 2.0;
			break;
		}
		criteria += "Lot size is greater than " + size;

		
		for(int i=0;i<=agencyArray.size()-1;i++)//agency 
		{
			Agency temp;
			temp = agencyArray.get(i);
			this.listingsFromOneAgency = temp.lotSize(size);
			for(RealEstateListing singlehouse : listingsFromOneAgency)
			{
				finalArrayListOfRealEstateListings.add(singlehouse);
			}
			//insert a for each loop to assign individual houses to a new array list of homelistings
			//answerSoFar += listingsFromOneAgency.toString();
			
		}
		return finalArrayListOfRealEstateListings;


		//*** ask each agency to give a list that satisfies the requested style.
	}//END METHOD
	public  ArrayList<RealEstateListing> age(int age, ArrayList<Agency> agencyArray)
	{
		

		switch(age)
		{
		case 1: age = 2;
		break;
		case 2: age = 4;
		break;
		case 3: age = 6;		
		break;
		case 4: age = 10;
		break;
		}
		criteria += "age is under " + age;


		for(int i=0;i<=agencyArray.size()-1;i++)//agency 
		{
			Agency temp;
			temp = agencyArray.get(i);
			this.listingsFromOneAgency = temp.age(age);
			for(RealEstateListing singlehouse : listingsFromOneAgency)
			{
				finalArrayListOfRealEstateListings.add(singlehouse);
			}
			//insert a for each loop to assign individual houses to a new array list of homelistings
			//answerSoFar += listingsFromOneAgency.toString();
			
		}
		return finalArrayListOfRealEstateListings;


		//*** ask each agency to give a list that satisfies the requested style.
	}//END METHOD
	public  ArrayList<RealEstateListing> price(int priceNum, ArrayList<Agency> agencyArray)
	{
		double price = 0;
		
		switch(priceNum)
		{
		case 1: price = 100;
		break;
		case 2: price = 150;
		break;
		case 3: price = 250;		
		break;
		case 4: price = 400;
		break;
		}
		
		criteria += "price is under $" + (int)price + ",000" ;

		for(int i=0;i<=agencyArray.size()-1;i++)//agency 
		{
			Agency temp;
			temp = agencyArray.get(i);
			this.listingsFromOneAgency = temp.price(price);
			for(RealEstateListing singlehouse : listingsFromOneAgency)
			{
				finalArrayListOfRealEstateListings.add(singlehouse);
			}
			//insert a for each loop to assign individual houses to a new array list of homelistings
			//answerSoFar += listingsFromOneAgency.toString();
			
		}
		return finalArrayListOfRealEstateListings;


		//*** ask each agency to give a list that satisfies the requested style.
	}//END METHOD
	public  ArrayList<RealEstateListing> distance(int distanceNum, ArrayList<Agency> agencyArray)
	{
		double distance = 0;

		switch(distanceNum)
		{
		case 1: distance = 5;
		break;
		case 2: distance = 10;
		break;
		case 3: distance = 15;		
		break;
		
		}
		criteria += "distance from work is under " + distance + " miles";


		for(int i=0;i<=agencyArray.size()-1;i++)//agency 
		{
			Agency temp;
			temp = agencyArray.get(i);
			this.listingsFromOneAgency = temp.distance(distance);
			for(RealEstateListing singlehouse : listingsFromOneAgency)
			{
				finalArrayListOfRealEstateListings.add(singlehouse);
			}
			//insert a for each loop to assign individual houses to a new array list of homelistings
			//answerSoFar += listingsFromOneAgency.toString();
			
		}
		return finalArrayListOfRealEstateListings;


		//*** ask each agency to give a list that satisfies the requested style.
	}//END METHOD
	public  ArrayList<RealEstateListing> jurisdiction(int styleType, ArrayList<Agency> agencyArray)
	{	
		String j = "";

		switch(styleType)
		{
		case 1: j = "Alexandria";
		break;
		case 2: j = "Arlington";
		break;
		case 3: j = "Fairfax";		
		break;
		case 4: j = "Falls Church";
		break;
		case 5: j = "District of Columbia";
		break;
		
		}
		criteria += j;


		for(int i=0;i<=agencyArray.size()-1;i++)//agency 
		{
			Agency temp;
			temp = agencyArray.get(i);
			this.listingsFromOneAgency = temp.jurisdiction(j);
			for(RealEstateListing singlehouse : listingsFromOneAgency)
			{
				finalArrayListOfRealEstateListings.add(singlehouse);
			}
			//insert a for each loop to assign individual houses to a new array list of homelistings
			//answerSoFar += listingsFromOneAgency.toString();
			
		}
		return finalArrayListOfRealEstateListings;


		//*** ask each agency to give a list that satisfies the requested style.
	}//END METHOD
	


	//*** For each criteria there are similar pairs of methods.	
	//*** Work on each pair one pair at a time and make them 
	//*** work before you do the next pair.
	 public void getAgenciesForTheExhibition()
	 {
		 Scanner localScan = new Scanner (System.in);
		 
		 System.out.println("For this list of homes which real-estate agencies\n" 
		 		+ "would you like the home listings drawn from?\n" 
		 		+ "Please enter their numbers on one line ");
		 System.out.println( "1) Century 21\n"   
		 		+ "2) ReMax\n" 
				 + "3) McEnearney\n"
		 		+ "4) Long & Foster");
		 String inputAgencies = localScan.nextLine();
		 if(inputAgencies.length()>=1)
		 {
			 switch(inputAgencies.charAt(0))//1st number
			 {
			 case '1':
				 agencyArray.add(century21);
				 agencies += " Century 21 ";
				 break;
			 case '2':
				 agencyArray.add(reMax);
				 agencies += " remax ";
				 break;
			 case '3':
				 agencyArray.add(mcEnearney);
				 agencies += " mcEnearney ";
				 break;
			 case '4':
				 agencyArray.add(longAndFoster);
				 agencies += " longAndFoster ";
				 break;
			 }
		 }
		 
		 if(inputAgencies.length()>=3)
		 {
			 switch(inputAgencies.charAt(2))//2nd number
			 {
			 case '1':
				 agencyArray.add(century21);
				 agencies += " Century 21 ";
				 break;
			 case '2':
				 agencyArray.add(reMax);
				 agencies += " remax ";
				 break;
			 case '3':
				 agencyArray.add(mcEnearney);
				 agencies += " mcEnearney ";
				 break;
			 case '4':
				 agencyArray.add(longAndFoster);
				 agencies += " longAndFoster ";
				 break;
			 }
		 }
		 if(inputAgencies.length()>=5)
		 {
			 switch(inputAgencies.charAt(4))//2nd number
			 {
			 case '1':
				 agencyArray.add(century21);
				 agencies += " Century 21 ";
				 break;
			 case '2':
				 agencyArray.add(reMax);
				 agencies += " remax ";
				 break;
			 case '3':
				 agencyArray.add(mcEnearney);
				 agencies += " mcEnearney ";
				 break;
			 case '4':
				 agencyArray.add(longAndFoster);
				 agencies += " longAndFoster ";
				 break;
			 }
		 }
		 if(inputAgencies.length()>=7)
		 {
			 switch(inputAgencies.charAt(6))//2nd number
			 {
			 case '1':
				 agencyArray.add(century21);
				 agencies += " Century 21 ";
				 break;
			 case '2':
				 agencyArray.add(reMax);
				 agencies += " remax ";
				 break;
			 case '3':
				 agencyArray.add(mcEnearney);
				 agencies += " mcEnearney ";
				 break;
			 case '4':
				 agencyArray.add(longAndFoster);
				 agencies += " longAndFoster ";
				 break;
			 }
		 }

	 }
	 public int pickHomeCriterion()
	 {
		 Scanner localScan2 = new Scanner(System.in);
		 System.out.println("Please choose a home criteria\n and enter its number.\n1) Style\n2) Number Of Bedrooms\n3) "
		 		+ "Number Of Bathrooms\n"
		 		+ "4) Lot Size\n5) Age\n6) Price\n7) Distance From Work\n8) Jurisdiction");
		 	int x = localScan2.nextInt();
		 	
		 	switch(x)
		 	{
		 	case 1:
		 		criteria += "Style: ";
		 		break;
		 	case 2:
		 		criteria += "Bedrooms: ";
		 		break;
		 	case 3: 
		 		criteria +="Bathrooms: ";
		 		break;
		 	case 4: 
		 		criteria += "Lot Size: ";
		 		break;
		 	case 5:
		 		criteria += "Age: ";
		 		break;
		 	case 6:
		 		criteria += "Price: ";
		 		break;
		 	case 7:
		 		criteria += "Distance from work: ";
		 		break;
		 	case 8:
		 		criteria += "Jurisdiction: ";
		 		break;
		 	}
		 	
		 	return x;
		 	
	 }
	 

}//class

