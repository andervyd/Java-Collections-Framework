//: Info on players:
//       name, age, IQ

package Generics.Example;

public abstract class Participant {
	
	private String name;
	private int age;
	private int IQ;
	
	public Participant(String name, int age, int iQ) {
		this.name = name;
		this.age = age;
		IQ = iQ;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getIQ() {
		return IQ;
	}
}
