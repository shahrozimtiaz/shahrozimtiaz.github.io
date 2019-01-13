package project8;
import java.text.DecimalFormat;
import java.util.*;

import project3.OutPut;
public class RealEstateListing 
{

   //*** instance variables go here.
	private String style;
	private int numBedrooms;
	private double numBathrooms;
	private double lotSize;
	private int age;
	private double price;
	private double distanceWork;
	private String jurisdiction;
	
	DecimalFormat numberFormat = new DecimalFormat("$#,###,###");

	public void readRealEstateListing(Scanner read)
	{

		String input;
		
		input = read.nextLine();
			String style = input + "";
			setStyle(style);
			//System.out.println(this.getStyle());
			
		input = read.nextLine();
			int numBedrooms = Integer.parseInt(input);
			setNumBedrooms(numBedrooms);
			//System.out.println(this.getNumBedrooms());

		input = read.nextLine();
			double numBathrooms = Double.parseDouble(input);
			setNumBathrooms(numBathrooms);
			//System.out.println(this.getNumBathrooms());

		input = read.nextLine();
			double lotSize = Double.parseDouble(input);
			setLotSize(lotSize);
			//System.out.println(this.getLotSize());

		input = read.nextLine();
			int age = Integer.parseInt(input);
			setAge(age);
			//System.out.println(this.getAge());

		input = read.nextLine();
			double price = Double.parseDouble(input);
			setPrice(price);
			//System.out.println(this.getPrice());

		input = read.nextLine();
			double distanceWork = Double.parseDouble(input);
			setDistanceWork(distanceWork);
			//System.out.println(this.getDistanceWork());

		input = read.nextLine();
			String jurisdiction = input + "";
			setJurisdiction(jurisdiction);
			//System.out.println(this.getJurisdiction());

			
		//*** Read a listing.
		//*** Set the instance variables. 		
	}
	//*** I have a complete set of getters and setters created by Eclipse
	
	public String toString()
	{
		int realPrice = (int) this.price * 1000;
		return OutPut.makeStringLeft(21, "Style: " + this.style) + OutPut.makeStringLeft(16, "Bedrooms:" + this.numBedrooms) + OutPut.makeStringLeft(16, " Bathrooms:" + this.numBathrooms )	
				+ OutPut.makeStringLeft(30, "  Lot Size: " + this.lotSize + " Squre acre")  + OutPut.makeStringLeft(11,  "\n\n		Age:" + this.age) 
				+ OutPut.makeStringLeft(20, "  Price:" + numberFormat.format(realPrice)) + OutPut.makeStringLeft(15, " Distance:" + this.distanceWork )
				+ OutPut.makeStringLeft(30, " Jurisdiction: " + this.jurisdiction) + "\n" + "\n\n";

	}
	
	//////////////////////////////////////////GETTERS AND SETTERS
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getNumBedrooms() {
		return numBedrooms;
	}
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	public double getNumBathrooms() {
		return numBathrooms;
	}
	public void setNumBathrooms(double numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	public double getLotSize() {
		return lotSize;
	}
	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDistanceWork() {
		return distanceWork;
	}
	public void setDistanceWork(double distanceWork) {
		this.distanceWork = distanceWork;
	}
	public String getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	
}//class

