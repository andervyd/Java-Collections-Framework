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
      //addListIndex.add(7, "Oleg"); // Exception: IndexOutOfBoundsException: Index: 7, Size: 4
		
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
	  //addListIndex.remove(8);	 // Exception: IndexOutOfBoundsException: Index 8 out of bounds for length 4
		
		System.out.println();
		
		for(String string : addListIndex) {
			System.out.print(string + " ");
		}
			// Output: Masha Petr Sveta Kiril

		System.out.println("\n" + "-----------------------");

// addAll(ArrayList arrayList) => boolean

		ArrayList<Integer> listInt1 = new ArrayList<>();

		listInt1.add(1);
		listInt1.add(2);
		listInt1.add(3);

		ArrayList<Integer> listInt2 = new ArrayList<>();

		listInt2.add(4);
		listInt2.add(5);
		listInt2.add(6);

		listInt1.addAll(listInt2);

		for (Integer i : listInt1) {
			System.out.print(i + " ");
		}
			// Output: 1 2 3 4 5 6

		System.out.println("\n" + "-----------------------");

// addAll(int index, ArrayList arrayList) => boolean

		ArrayList<Integer> listInt3 = new ArrayList<>();

		listInt3.add(10);
		listInt3.add(11);
		listInt3.add(12);

		listInt1.addAll(0, listInt3);

		System.out.println(listInt1);

			// Output: [10, 11, 12, 1, 2, 3, 4, 5, 6]

		System.out.println("\n" + "-----------------------");

// clear() => void

		System.out.println("Before clear: " + listInt3);

		listInt3.clear();

		System.out.println("After clear: " + listInt3);

			// Output: Before clear: [10, 11, 12]
		    //         After clear: []

		System.out.println("\n" + "-----------------------");

// indexOf(Object element) => int (return index element if not -1)

		// listInt2: 4(0), 5(1), 6(2)

		System.out.println(listInt2.indexOf(4));
			// Output: 0






		System.out.println("\n" + "-----------------------");
//		System.out.println("\n" + "-----------------------");
//		System.out.println("\n" + "-----------------------");
//		System.out.println("\n" + "-----------------------");
//		System.out.println("\n" + "-----------------------");
//		System.out.println("\n" + "-----------------------");
//		System.out.println("\n" + "-----------------------");

	}
}