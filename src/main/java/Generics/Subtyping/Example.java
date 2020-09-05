//: Subtyping
//  <?>           - any class
//  <? extends X> - class X or any of its subclasses 
//  <? super Y>   - class Y or any of its super classes

package Generics.Subtyping;

import java.util.ArrayList;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		
		X x = new Y();
		
		List<X> list1 = new ArrayList<>();       // auto: ArrayList<X>();
//		List<X> list2 = new ArrayList<Y>();      // NOT WORK
//		ArrayList<X> list3 = new ArrayList<Y>(); // NOT WORK
		
//      Example:
//		List<Number> list = new ArrayList<Integer>();
//		list.add(18);
//		list.add(3.14);
		
	}
}


class X {
	
}


class Y extends X {
	
}