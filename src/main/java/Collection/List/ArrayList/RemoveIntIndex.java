// remove(int index) => Data Type

package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student {
	
	private String name;
	private int age;
	private int course;
	
	public Student(String name, int age, int course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name: " + name
				+ ", age: " + age
				+ ", course: " + course + "]"
				+ "\n";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) 
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		
		Student student = (Student) o;
			return age == student.age &&
					course == student.course &&
					Objects.equals(name, student.name);
	}
	
	
}


public class RemoveIntIndex {
	public static void main(String[] args) {
		
		Student st1 = new Student("Mary", 23, 3);
		Student st2 = new Student("Petr", 21, 1);
		Student st3 = new Student("Oleg" , 24, 5);
		Student st4 = new Student("Sveta", 22, 2);
		Student st5 = new Student("Sasha", 24, 4);
		
		List<Student> listStudent = new ArrayList<>();
		
		listStudent.add(st1);
		listStudent.add(st2);
		listStudent.add(st3);
		listStudent.add(st4);
		listStudent.add(st5);
		
		System.out.println(listStudent);
		
		Student st6 = new Student("Sasha", 24, 4);
		
		listStudent.remove(st6);
		
		System.out.println(listStudent);
		
	}
}/* Output:
			[Student [name: Mary, age: 23, course: 3]
			, Student [name: Petr, age: 21, course: 1]
			, Student [name: Oleg, age: 24, course: 5]
			, Student [name: Sveta, age: 22, course: 2]
			, Student [name: Sasha, age: 24, course: 4]
			]
			[Student [name: Mary, age: 23, course: 3]
			, Student [name: Petr, age: 21, course: 1]
			, Student [name: Oleg, age: 24, course: 5]
			, Student [name: Sveta, age: 22, course: 2]
			]
*///:~






