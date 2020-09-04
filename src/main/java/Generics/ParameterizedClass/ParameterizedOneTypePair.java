//: Parameterized one type pair <V>

package Generics.ParameterizedClass;


class OtherPair<V> {
	private V valueOne;
	private V valueTwo;
	
	public OtherPair(V valueOne, V valueTwo) {
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}

	public V getFirstValue() {
		return valueOne;
	}

	public V getSecondValue() {
		return valueTwo;
	}	
}


public class ParameterizedOneTypePair {
	public static void main(String[] args) {
		
		OtherPair<String> list = new OtherPair<>("new", "price");
		
		System.out.println("Value one: " + list.getFirstValue() +
				";" + "\n" + "Value two: " + list.getSecondValue() + ".");
		
	}
}/* Output:
			Value one: new;
			Value two: price.
*///:~