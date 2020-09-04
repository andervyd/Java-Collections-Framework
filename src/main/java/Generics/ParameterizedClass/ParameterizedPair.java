//: Parameterized pair <V1, V2>

package Generics.ParameterizedClass;


class Pair<V1, V2> {
	private V1 valueOne;
	private V2 valueTwo;
	
	public Pair(V1 valueOne, V2 valueTwo) {
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}

	public V1 getFirstValue() {
		return valueOne;
	}

	public V2 getSecondValue() {
		return valueTwo;
	}	
}


public class ParameterizedPair {
	public static void main(String[] args) {
		
		Pair<Integer, String> emp1 = new Pair<>(341, "Ivan");
		
		System.out.println("Value one: " + emp1.getFirstValue() +
				";" + "\n" + "Value two: " + emp1.getSecondValue() + ".");
		
	}
}/*
			Value one: 341;
			Value two: Ivan.
*///:~