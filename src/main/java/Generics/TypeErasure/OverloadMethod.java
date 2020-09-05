//: Type Erasure
//          ArrayList<Integer> list = new ArrayList<>();
//
//          list.add(21);
//          list.add(9);
//          list.add(45);
//
// Runtime: ArrayList list = new ArrayList();
//          int i = list.get(0);
//
// Runtime: cast to Integer
//          int i = (Integer)list.get(0);

package Generics.TypeErasure;

class Info<T> {

	private T value;

	public Info(T value) {
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


public class OverloadMethod {

//  Overload methods:

	public void someMethod(Info<String> info) {
		String str = info.getValue();
	}

//  public void someMethod(Info<Integer> info) {  // NOT WORK SOMEONE (Info info)
//  	int i = info.getValue();
//  }

}