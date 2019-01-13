 /**
 * This is my description of my TestInventory Class. It has 1 method.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 09/4/2017
 */
package project2;

public class TestInventory {

	public static void main(String[] args) {
		Inventory store = new Inventory(5);

		store.restockItem("a", 5);
		store.restockItem("b", 4);
		store.restockItem("c", 3);
		store.restockItem("d", 2);
		store.restockItem("e", 1);

		store.sellItem("a");
		store.sellItem("b");
		store.sellItem("c");
		store.sellItem("d");
		store.sellItem("e");

		store.sellItem("f");

		Inventory store2 = new Inventory(5);

		store2.restockItem("d", 5);
		store2.restockItem("c", 4);
		store2.restockItem("a", 3);
		store2.restockItem("c", 2);
		store2.restockItem("b", 1);

		store2.sellItem("a");
		store2.sellItem("b");
		store2.sellItem("c");
		store2.sellItem("d");
		store2.sellItem("e");

		store2.sellItem("f");

		Inventory store3 = new Inventory(5);

		store3.sellItem("a");
		store3.sellItem("b");
		store3.sellItem("c");
		store3.sellItem("d");
		store3.sellItem("e");

		store3.sellItem("f");

		Inventory store4 = new Inventory(5);

		store4.restockItem("b", 5);
		store4.restockItem("a", 4);
		store4.restockItem("c", 3);

		store4.sellItem("a");
		store4.sellItem("b");
		store4.sellItem("c");

		store4.sellItem("d");
		store4.sellItem("e");
		store4.sellItem("f");


		System.out.println(store.toString() + "\n");

		System.out.println(store2.toString() + "\n");

		System.out.println(store3.toString() + "\n");

		System.out.println(store4.toString() + "\n");
	}

}
