 /**
 * This is my description of my Item class. It has 8 methods.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 09/4/2017
 */
package project2;

public class Item implements Scannable, Comparable<Item> {
	
	private String name;
	private String barcode;
	private int amount;
	
	public Item(String name) {
		this.name = name;
		this.amount = 1;
		this.barcode = Scannable.generateBarcode(name);
	}
	public Item(String name, int amount) {
		this.name = name;
		this.amount = amount;
		this.barcode = Scannable.generateBarcode(name);
		
	}
	public String getName() {
		return name;
	}
	public String getBarcode() {
		return barcode;
	}
	public int getAmount() {
		return amount;
	}
	public void addStock(int amt) {
		amount += amt;
	}
	public void sellUnit() {
		amount -= 1;
	}
	public boolean equals(Object obj) {
		Item other = (Item)obj;
		if(Long.parseLong(this.getBarcode()) == Long.parseLong(other.getBarcode())) {
			return true;
		}
		else return false;
	}
	public int compareTo(Item itm) {
		return this.barcode.compareTo(itm.barcode);
	}
	public String toString() {
		return (name + " (" + barcode + ") " + amount);
	}

}//class
