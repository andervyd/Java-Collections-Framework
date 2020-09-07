//: Methods ArrayList


package Collection.List.ArrayList;

import java.util.ArrayList;

public class MethodsArrayList {
	public static void main(String[] args) {
		
		System.out.println("-----------------------");
		
		// add(Data Type element) => boolean
		
		ArrayList<String> addList = new ArrayList<>();
		addList.add("Mary");
		addList.add("Petr");
		addList.add("Sveta");
		
		for(String string : addList) {
			System.out.print(string + " ");
		}
// Output: Mary Petr Sveta 
		
		System.out.println("\n" + "-----------------------");
		
		// add(int index, Data Type element) => boolean
		
		ArrayList<String> addListIndex = new ArrayList<>();
		addListIndex.add("Mary");
		addListIndex.add("Petr");
		addListIndex.add("Sveta");
		addListIndex.add(1, "Oleg");
//		addListIndex.add(7, "Oleg"); // Exception: IndexOutOfBoundsException: Index: 7, Size: 4
		
		for(String string : addListIndex) {
			System.out.print(string + " ");
		}
// Output: Mary Oleg Petr Sveta
		
		System.out.println("\n" + "-----------------------");

		// get(int index) => Data Type
		
		System.out.println(addListIndex.get(1));
		
// Output: Oleg
			
		for(int i = 0; i < addListIndex.size(); i++) {
			System.out.print(addListIndex.get(i) + " ");
		}
// Output: Mary Oleg Petr Sveta
		
		System.out.println("\n" + "-----------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		
		
		
		
		
		
		
		
		
		
		
	}
}
