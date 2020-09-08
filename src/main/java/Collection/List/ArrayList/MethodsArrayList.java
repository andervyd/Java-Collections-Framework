//: Methods ArrayList

package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

		listInt2.add(7);
		listInt2.add(5);
		listInt2.add(1);
		
		System.out.println(listInt2);
		
		// listInt2: 4(0), 5(1), 6(2), 7(3), 5(4), 1(5)

		// In the presence of override equals (!)
		System.out.println("Index element '5' - " + listInt2.indexOf(5));
			// Output: Index element '5' - 1

		System.out.println("\n" + "-----------------------");

// indexOf(Object element) => int (return index element if not -1)

		// In the presence of override equals (!)
		System.out.println("Index element '5' - " + listInt2.lastIndexOf(5));
		// Output: Index element '5' - 4

		System.out.println("\n" + "-----------------------");

// size() => int
		
		System.out.println("Size ArrayList 'listInt2' - " + listInt2.size());
			// Size ArrayList 'listInt2' - 6
		
		System.out.println("\n" + "-----------------------");

// isEmpty() => boolean
		
		List<Double> listDub = new ArrayList<>();
		
		listDub.add(2.34);
		listDub.add(16.2);
		listDub.add(54.0);
		
		// In the presence of override equals (!)
		System.out.println(listDub.isEmpty());
			// Output: false
		
		listDub.clear();
		
		// In the presence of override equals (!)
		System.out.println(listDub.isEmpty());
			// Output: true
	
		System.out.println("\n" + "-----------------------");

// contains(Object element) => boolean
		
		List<Double> listDub2 = new ArrayList<>();
		
		listDub2.add(2.34);
		listDub2.add(16.2);
		listDub2.add(54.0);
		
		// listDub: [2.34, 16.2, 54.0] 
		
		// In the presence of override equals (!)
		System.out.println(listDub2.contains(2.34));
			// Output: true
		
		System.out.println("\n" + "-----------------------");

// toString() => String
		
		System.out.println(listDub2);
		
		System.out.println(listDub2.toString());
		
		System.out.println("\n" + "-----------------------");

// Array.asList(Data Type []) => List<Data Type>
		
		StringBuilder sb1 = new StringBuilder("A");
		StringBuilder sb2 = new StringBuilder("B");
		StringBuilder sb3 = new StringBuilder("C");
		StringBuilder sb4 = new StringBuilder("D");
		
		StringBuilder[] arraySB = new StringBuilder[] {sb1, sb2, sb3, sb4};
		
		for(StringBuilder sb : arraySB) {
			System.out.print(sb + " ");
		}
			// Output: A B C D 
		
		List<StringBuilder> listSB = Arrays.asList(arraySB);
		
      //listSB.add("E"); // NOT WORK
		
		System.out.println("\n" + listSB);
			// Output: [A, B, C, D]
		
		System.out.println("\n" + "-----------------------");
		
// removeAll(Collection <?> collection) => boolean
		
		ArrayList<String> listStrL1 = new ArrayList<>();
		
		listStrL1.add("A");
		listStrL1.add("B");
		listStrL1.add("C");
		listStrL1.add("D");
		
		ArrayList<String> listStrL2 = new ArrayList<>();

		listStrL2.add("A");
		listStrL2.add("C");
		
		System.out.println("List 'listStrL1': " + listStrL1
				+ "\n" + "List 'listStrL2': " + listStrL2);
			// Output: List 'listStrL1': [A, B, C, D]
		    //         List 'listStrL2': [A, C]
		
		listStrL1.removeAll(listStrL2);
		
		System.out.println("List 'listStrL1' after removeAll: " + listStrL1);
			// Output: List 'listStrL1' after removeAll: [B, D]
		
		System.out.println("\n" + "-----------------------");

// retainAll(Collection <?> collection) => boolean
		

		ArrayList<String> listStrL3 = new ArrayList<>();
		
		listStrL3.add("A");
		listStrL3.add("B");
		listStrL3.add("C");
		listStrL3.add("D");
		
		System.out.println("List 'listStrL3': " + listStrL3
				+ "\n" + "List 'listStrL2': " + listStrL2);
			// Output: List 'listStrL1': [A, B, C, D]
		    //         List 'listStrL2': [A, C]
		
		listStrL3.retainAll(listStrL2);
		
		System.out.println("List 'listStrL1' after retainAll: " + listStrL3);
			// Output: List 'listStrL1' after removeAll: [A, C]

		System.out.println("\n" + "-----------------------");

// containsAll(Collection <?> collection) => boolean
		
		boolean check;
		
		ArrayList<Integer> listIntCon1 = new ArrayList<>();

		listIntCon1.add(1);
		listIntCon1.add(2);
		listIntCon1.add(3);
		
		ArrayList<Integer> listIntCon2 = new ArrayList<>();

		listIntCon2.add(1);
		listIntCon2.add(2);
		
		check = listIntCon2.containsAll(listIntCon1);
		System.out.println(check);
			// Output: false
		
		listIntCon2.add(3);
		
		check = listIntCon2.containsAll(listIntCon1);
		System.out.println(check);
			// Output: true
		
// subList(int fromIndex, int toIndex) => List<E>
		
		ArrayList<String> listSub = new ArrayList<>();
		
		listSub.add("HI");
		listSub.add("BY");
		listSub.add("OK");
		listSub.add("NO");
		listSub.add("HE");
		listSub.add("SHE");
		
		List<String> listSubList = listSub.subList(4, listSub.size());
		
		System.out.println("Segment ArrayList 'listSub' from 4 to end: " + listSubList);
			// Output: Segment ArrayList 'listSub' from 4 to end: [HE, SHE]
		
	// !!! IMPORTANT: id add to 'listSubList' this add to 'listSub' 
	
		listSubList.add("WHO?");
		
		System.out.println("ArrayList 'listSub': " + listSub + "\n" 
				+ "List 'listSubList': " + listSubList);
		// Output: ArrayList 'listSub': [HI, BY, OK, NO, HE, SHE, WHO?]
		//         List 'listSubList': [HE, SHE, WHO?]
	
	// but: 
		
		listSub.add("DO");
		
//		System.out.println(listSubList); // Exception: ConcurrentModificationException
		
		System.out.println("\n" + "-----------------------");

// toArray() => Object[]
		
		// listInt1: [10, 11, 12, 1, 2, 3, 4, 5, 6]
		
		Object[] arrayObj = listInt1.toArray(); // NOT Integer or int !!!
		
		for(int i = 0; i < arrayObj.length; i++) {
			System.out.print(arrayObj[i] + " ");
		}
			// Output: 10 11 12 1 2 3 4 5 6
		
		System.out.println("\n" + "-----------------------");

// toArray(T[] a) => T[]
		
		// listInt1: [10, 11, 12, 1, 2, 3, 4, 5, 6]
		
		Integer[] arrayToInteger = listInt1.toArray(new Integer[0]); // Integer[0] - auto size
		
		for(int i = 0; i < arrayObj.length; i++) {
			System.out.print(arrayToInteger[i] + " ");
		}
			// Output: 10 11 12 1 2 3 4 5 6
				
		System.out.println("\n" + "-----------------------");

// List.of(E ... elements) => List<E> 
		
        //List<String> stringList = List.of("01]", "[02]", "[03", null); // Exception: NullPointerException
		List<String> stringList = List.of("01]", "[02]", "[03");
		
		System.out.println(stringList);
			// Output: [01], [02], [03]
		
	// but:
       //stringList.add("NOT");  // Exception: UnsupportedOperationException
		
		
		System.out.println("\n" + "-----------------------");

// List.copyOf(Collection <E> collection) => List<E>
		
		List<String> stringListCopy = List.copyOf(stringList);
		
		System.out.println(stringListCopy);
			// Output: [01], [02], [03]
	
	// but:
//	       stringList.add("NOT");  // Exception: UnsupportedOperationException

	}
}