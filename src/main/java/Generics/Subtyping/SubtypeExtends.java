//: Subtype extends <? extends X>

package Generics.Subtyping;


class Info<T extends Number> {
	
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
}


class Car {
	
	private String color;

	public Car(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
}


public class SubtypeExtends {
	public static void main(String[] args) {

//		Info<String> infoStr = new Info<>("String");     // NOT WORK (extends Number)
//		System.out.println(infoStr);
		
//		Info<Car> infoCar = new Info<>(new Car("red"));  // NOT WORK (extends Number)
//		System.out.println(infoCar);
	
		Info<Integer> infoInt = new Info<>(24);
		System.out.println(infoInt);
		
		Info<Double> infoDub = new Info<>(3.14);
		System.out.println(infoDub);
		
		
		
	}
}/* Output:
			[ 24 ]
			[ 3.14 ]
*///:~