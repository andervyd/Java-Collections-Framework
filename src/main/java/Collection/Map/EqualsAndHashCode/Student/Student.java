//: HashCode example

package Collection.Map.EqualsAndHashCode.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
	
	private String firstName;
	private String lastName;
	private int course;
	
	public Student(String firstName, String lastName, int course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "Student: name=" + firstName
				+ ", last name=" + lastName
				+ ", course=" + course + ", avg";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return course == student.course &&
				Objects.equals(firstName, student.firstName) &&
				Objects.equals(lastName, student.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, course);
	}

}

class PrintStudent {
	public static void main(String[] args) {

		Student student1 = new Student("Mary", "Heel", 3);
		Student student2 = new Student("Ivan", "Petrov", 2);
		Student student3 = new Student("John", "Lee", 4);

		Map<Student, Double> studentMap = new HashMap<>();

		studentMap.put(student1, 7.3);
		studentMap.put(student2, 8.1);
		studentMap.put(student3, 6.9);

		System.out.println(studentMap);
			// Output: {Student: name=Ivan, last name=Petrov, course=2, avg=8.1, Student: name=Mary, last name=Heel, course=3, avg=7.3, Student: name=John, last name=Lee, course=4, avg=6.9}

		Student student4 = new Student("John", "Lee", 4);  // duplicat
		boolean search = studentMap.containsKey(student4);
		System.out.println(search);
			// Output: false !! if override method hashCode output true !!
	// but:
		System.out.println(student3.equals(student4));
			// Output: true

		Student student5 = new Student("Lee", "John", 4);

		System.out.println("hashCode student 1 = " + student1.hashCode()
			+ "\nhashCode student 3 = " + student3.hashCode()
			+ "\nhashCode student 4 = " + student4.hashCode()
			+ "\nhashCode student 5 = " + student5.hashCode());
			// Output: hashCode student 1 = -1927796071
			//         hashCode student 3 = -2068301214
			//         hashCode student 4 = -2068301214
			//         hashCode student 5 =  145074052

		for(Map.Entry<Student, Double> mapFor : studentMap.entrySet()) {
			System.out.println(mapFor);
		}
			// Output: Student: name=Mary, last name=Heel, course=3, avg=7.3
		    //         Student: name=Ivan, last name=Petrov, course=2, avg=8.1
			//         Student: name=John, last name=Lee, course=4, avg=6.9
	
		System.out.println(studentMap);
			// Output: {Student: name=Mary, last name=Heel, course=3, avg=7.3, Student: name=Ivan, last name=Petrov, course=2, avg=8.1, Student: name=John, last name=Lee, course=4, avg=6.9}

	}
}