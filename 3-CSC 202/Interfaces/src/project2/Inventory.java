 /**
 * This is my description of my Inventory Class. It has 3 methods.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 09/4/2017
 */
package project2;

public class Inventory {
	private Item[] items;

	public Inventory(int size) {
		items = new Item[size];
	}
	public void restockItem(String prodName, int count) {
		Item temp = new Item(prodName,count);

		if(items[0] == null) {
			items[0] = temp;
			return;
		}	
		int i=0;
		int j=0;

		while(items[i]!=null)
		{
			if(items[i].equals(temp)) {
				items[i].addStock(count);
				return;
			}
			else if(temp.compareTo(items[i])>=1) {
				j++;
			}
			else if(temp.compareTo(items[i])<=-1) {
				j=0;
				break;
			}
			i++;
		}
		if(j>0) {
			for(int z=items.length-1;z>j;z--) {
				items[z]= items[z-1];		
			}
			items[j]=temp;
		}
		if(j==0) {
			for(int z=items.length-1;z>i;z--) {
				items[z]= items[z-1];		
			}
			items[i]=temp;
		}
	}

	public void sellItem(String name) {
		int i=0;

		while(items[i]!=null)
		{
			if(name.equals(items[i].getName())) {
				items[i].sellUnit();
				if(items[i].getAmount()==0)
				{
					for(int x=i;x<items.length-1;x++) {
						items[x]=items[x+1];
					}
					items[items.length-1] = null;
				}
				break;
			}
			i++;
			if(i>items.length-1) {
				break;
			}
		}
	}

	public String toString() {
		String answer = "";
		for(Item x: items) {
			if(x == null) {
				continue;
			}
			answer += (x.getName() + " (" + x.getBarcode() + ") " + x.getAmount() + ", ") ;

		}
		return answer;
	}
}//class