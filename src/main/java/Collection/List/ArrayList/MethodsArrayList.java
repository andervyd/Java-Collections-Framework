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
		
		// set(int index, Data Type element) => Data Type
		
		System.out.println("Before: " + addListIndex.get(0));
		
		addListIndex.set(0, "Masha");
		
		System.out.println("After: " + addListIndex.get(0));

// Output: Before: Mary ||	After: Masha
		
		System.out.println("\n" + "-----------------------");

		// remove(Object element) => boolean
		
		addListIndex.add("Kiril");
		addListIndex.add("Max");
		
		for(String string : addListIndex) {
			System.out.print(string + " ");
		}
// Output: Masha Oleg Petr Sveta Kiril Max		
		
		addListIndex.remove("Max");
		System.out.println();
		
		for(String string : addListIndex) {
			System.out.print(string + " ");
		}
// Output: Masha Oleg Petr Sveta Kiril		
		
		// remove(int index) => boolean
		// addListIndex: [ Masha(0), Oleg(1), Petr(2), Sveta(3), Kiril(4) ]
		
		addListIndex.remove(1);		
//		addListIndex.remove(8);	 // Exception: IndexOutOfBoundsException: Index 8 out of bounds for length 4
		
		System.out.println();
		
		for(String string : addListIndex) {
			System.out.print(string + " ");
		}
// Output: Masha Petr Sveta Kiril		
		
		
		
		
		
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		System.out.println("\n" + "-----------------------");
		
		
		
		
		
		
		
		
		
		
		
	}
}
