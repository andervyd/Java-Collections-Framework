//: Wildcards (Joker) <?>
//  List<?> list = new ArrayList<Integer>();
		

package Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Joker {
	public static void main(String[] args) {
		
		List<Double> listDub = new ArrayList<>();
		
		listDub.add(3.14);
		listDub.add(12.5);
		listDub.add(1.9);
		
		showInfo(listDub);
		
		System.out.println("------------------------------------");
		
		List<String> listStr = new ArrayList<>();
		
		listStr.add("HI");
		listStr.add("BY");
		listStr.add("OK");
		
		showInfo(listStr);
	}
	
	public static void showInfo(List<?> list) {
		System.out.println("Show list elements: " + list);
	}
}/* Output:
			Show list elements: [3.14, 12.5, 1.9]
			------------------------------------
			Show list elements: [HI, BY, OK] 
*///:~