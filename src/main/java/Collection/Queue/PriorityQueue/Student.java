//: Queue => AbstractQueue => PriorityQueue example

package Collection.Queue.PriorityQueue;

import java.util.*;

public class Student implements Comparable<Student> {
	
	private String name;
	private int course;
	
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCourse() {
		return course;
	}
	
	@Override
	public String toString() {
		return "Student { name student: " + name
				+ ", course: " + course + "} ";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return course == student.course &&
				Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, course);
	}

	@Override
	public int compareTo(Student student) {
		return this.course - student.course;
	}
}

class Output {
	public static void main(String[] args) {
		
		Student st1 = new Student("Oleg",3 );
		Student st2 = new Student("Mary",2 );
		Student st3 = new Student("Alex",4 );
		Student st4 = new Student("Zaur", 1);
		Student st5 = new Student("Saha",2 );
		
		Queue<Student> listStudentCompableCourse = new PriorityQueue<>();
  
		listStudentCompableCourse.add(st1);
		listStudentCompableCourse.add(st2);
		listStudentCompableCourse.add(st3);
		listStudentCompableCourse.add(st4);
		listStudentCompableCourse.add(st5);
			
		System.out.println(listStudentCompableCourse);
			// Output: Student { name student: Zaur, course: 1} , 
			//    	   Student { name student: Mary, course: 2} ,
			//	  	   Student { name student: Alex, course: 4} ,
			//		   Student { name student: Oleg, course: 3} ,
			//		   Student { name student: Saha, course: 2}
		
		Queue<Student> listStudentComparatorName = new PriorityQueue<>(new Comparator<Student>() {
			@Override
			public int compare(Student st1, Student st2) {
				return st1.getName().compareTo(st2.getName());
			}
		});
		  
		listStudentComparatorName.add(st1);
		listStudentComparatorName.add(st2);
		listStudentComparatorName.add(st3);
		listStudentComparatorName.add(st4);
		listStudentComparatorName.add(st5);
			
		System.out.println(listStudentComparatorName);
			// Output: Student { name student: Alex, course: 4} , 
		    //         Student { name student: Oleg, course: 3} ,
		    //         Student { name student: Mary, course: 2} ,
		    //         Student { name student: Zaur, course: 1} ,
		    //         Student { name student: Saha, course: 2}

	}
}