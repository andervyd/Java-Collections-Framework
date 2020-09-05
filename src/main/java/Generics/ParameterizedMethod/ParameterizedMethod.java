// Parameterized method

package Generics.ParameterizedMethod;

import java.util.ArrayList;


class GenericMethod {
	
	public static <T> T getSecondElement(ArrayList<T> arrayList) {
		return arrayList.get(1);
	}
}


class Info <V> {
	
	private V val;
	
	public Info(V val) {
		this.val = val;
	}
	
	public V getVal() {  // if class parameterized: <V> not write 
		return val;
	}
	
	public V methodV(V val) {
		return val;
	}
	
}


public class ParameterizedMethod {
	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<>();
		
		al1.add(9);
		al1.add(23);
		al1.add(135);
		al1.add(1);
		
		int i = GenericMethod.getSecondElement(al1);
		
		System.out.println(i);
		
		System.out.println("---");
		
		ArrayList<String> al2 = new ArrayList<>();
		
		al2.add("hi");
		al2.add("by");
		al2.add("OK");
		
		String s = GenericMethod.getSecondElement(al2);
		
		System.out.println(s);
		
	}
}/* Output:
			23
			---
			by
*///:~