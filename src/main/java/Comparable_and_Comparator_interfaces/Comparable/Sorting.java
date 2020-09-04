//: Collections.sort

package Comparable_and_Comparator_interfaces.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Alex");
		list.add("Zaur");
		list.add("Ivan");
		list.add("Petr");
		
		System.out.println("Before sorting: ");
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("After sorting: ");
		System.out.println(list);
		
	}
}/* Output:
			Before sorting: 
			[Alex, Zaur, Ivan, Petr]
			After sorting: 
			[Alex, Ivan, Petr, Zaur]
*///:~

