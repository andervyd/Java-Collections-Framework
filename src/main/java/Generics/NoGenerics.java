//: Generics - specific type

package Generics;

import java.util.ArrayList;
import java.util.List;


class Car {}


public class NoGenerics {
	public static void main(String[] args) {
		
		List list = new ArrayList(); // not correct (non parameterized)
		
//		list.add("OK");
//		list.add(27);
//		list.add(new StringBuilder("check"));
//		list.add(new Car());
		
//		System.out.println(list);
		
		list.add("Hi");
		list.add("By");
		list.add("check");
		list.add("Exit");
//		list.add(new Car());  // exception: ClassCastException 
		
		for(Object obj : list) {
			System.out.println(obj + " - length: " + ((String)obj).length());
		}
		
        System.out.println("\n" + "-----------------------------" + "\n");
		
		List<String> corList = new ArrayList<>();
		
		corList.add("Hi");
		corList.add("By");
		corList.add("check");
		corList.add("Exit");
		
		for(String str : corList) {
			System.out.println(str + " - length: " + str.length());
		}
	
	}
}/* Output:
			Hi - length: 2
			By - length: 2
			check - length: 5
			Exit - length: 4
			
			-----------------------------
			
			Hi - length: 2
			By - length: 2
			check - length: 5
			Exit - length: 4
*///:~