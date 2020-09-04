//: Parameterized Class <T>

package Generics.ParameterizedClass;


class Info<T> {
	
//	private static T value; // NOT WORK
	private T value;

	public Info(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "[ " + value + " ]";
	}
	
}/* Output:
			type <T> => [ String ]
			String
			type <T> => [ 24 ]
			24
*///:~


public class Parameterized {
	public static void main(String[] args) {

		Info<String> infoStr = new Info<>("String");
		System.out.println("type <T> => " + infoStr);
		
		String s = infoStr.getValue();
		System.out.println(s);
		
		Info<Integer> infoInt = new Info<>(24);
		System.out.println("type <T> => " + infoInt);
		
		Integer  i = infoInt.getValue();
		System.out.println(i);
		
	}
}

