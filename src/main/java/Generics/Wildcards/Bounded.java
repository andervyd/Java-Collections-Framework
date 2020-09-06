//: Bounded wildcarts

package Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Bounded {
	public static void main(String[] args) {
		
//		List<? extends Number> listNum = new ArrayList<Integer>();
//		List<? super Number> listNum = new ArrayList<Obgect>();
		
		ArrayList<Double> listDub = new ArrayList<>();
		
		listDub.add(2.19);
		listDub.add(91.2);
		listDub.add(1.1);
		
		System.out.println("Sum ArrayList listDub = " + sum(listDub));
		
		System.out.println("-----------------------------");
		
		ArrayList<Integer> listInt = new ArrayList<>();
		
		listInt.add(23);
		listInt.add(91);
		listInt.add(1);
		
		System.out.println("Sum ArrayList listInt = " + sum(listInt));

		System.out.println("-----------------------------");
		
//		ArrayList<String> listStr = new ArrayList<>();
//		
//		listStr.add("OK");
//		listStr.add("HI");
//		listStr.add("BY");
//		
//		System.out.println("Sum ArrayList listStr = " + sum(listStr));
		
		
	}
	
	public static double sum(ArrayList<? extends Number> arrayList) {
		double sum = 0;
		for(Number number : arrayList) {
			sum += number.doubleValue();
		}
		return sum;
	}
}/* Output:
			Sum ArrayList listDub = 94.49
			-----------------------------
			Sum ArrayList listInt = 115.0
			-----------------------------
*///:~