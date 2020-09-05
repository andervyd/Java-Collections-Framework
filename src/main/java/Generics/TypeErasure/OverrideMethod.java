package Generics.TypeErasure;

public class OverrideMethod {

}


class Info2<T> {

	private T value;

	public Info2(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public T methodT(T value) {
		return value;
	}

	@Override
	public String toString() {
		return "[ " + value + " ]";
	}
}


class Parent {
	
	public void method(Info2<String> info2) {
		String s = info2.getValue();
	}
}


class Child extends Parent {
	
//	@Override
//	public void method(Info<Integer> info) {
//		Integer i = info.getValue();
//	}
}