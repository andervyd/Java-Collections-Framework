//: Create ArrayList:
//         1) ArrayList<Data Type> list = new ArrayList<Data Type>();
//         2) ArrayList<Data Type> listStr = new ArrayList<>();

package Collection.List.ArrayList;

import java.util.ArrayList;

public class CreateArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> listStr = new ArrayList<String>();
		
		listStr.add("Masha");
		listStr.add("Petr");
		listStr.add("Svetlana");
		
		System.out.println(listStr);
		
		System.out.println("\n" + "----------------" + "\n");
		
		ArrayList<Integer> listInt = new ArrayList<>();
		
		listInt.add(23);
		listInt.add(12);
		listInt.add(456);
//		listInt.add("Svetlana");
		
		System.out.println(listInt);
		
		
		
		
		
		
	}
}/* Output:

*///:~