//: Create ArrayList:
//         1) ArrayList<Data Type> list = new ArrayList<Data Type>();
//         2) ArrayList<Data Type> list = new ArrayList<>();
//         3) ArrayList<Data Type> list = new ArrayList<>(30); 
//               		Length list = 30; (default 10)
//         4) List<Data Type> list = new ArrayList<>(); 
//         5) ArrayList<Data Type> list = new ArrayList<>(anotherList); 



package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

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
		
		System.out.println("\n" + "----------------" + "\n");
		
		ArrayList<Double> listDub= new ArrayList<>(200);
		
		listDub.add(2.13);
		listDub.add(21.1);
		listDub.add(0.9);
//		...
		
		System.out.println(listDub);
		
		System.out.println("\n" + "----------------" + "\n");
		
		List<String> listStrL = new ArrayList<>();
		
		listStrL.add("HI");
		listStrL.add("BY");
		listStrL.add("OK");
		
		System.out.println(listStrL);
		
		System.out.println("\n" + "----------------" + "\n");
		
		ArrayList<String> listAL = new ArrayList<>(listStrL);
		
		listAL.add("WHO");
		
		System.out.println(listAL);
	
	}
}/* Output:
			[Masha, Petr, Svetlana]
			
			----------------
			
			[23, 12, 456]
			
			----------------
			
			[2.13, 21.1, 0.9]
			
			----------------
			
			[HI, BY, OK]
			
			----------------
			
			[HI, BY, OK, WHO]
*///:~