//: TreeSet example methods:
//           .first()
//           .last()
//           .headSet()
//           .tailSet()
//           .subSet()

//  The rule:
//            a.equals(b) => true == a.compareTo(b) => 0

package Collection.Set.TreeSet;

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
        return "student name = " + name
                + ", course = " + course;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}

class Output {
    public static void main(String[] args) {

        Student st1 = new Student("Oleg", 5);
        Student st2 = new Student("Alex", 1);
        Student st3 = new Student("Zaur", 2);
        Student st4 = new Student("Mary", 3);
        Student st5 = new Student("Olya", 4);

        TreeSet<Student> students = new TreeSet<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students);
            // Output: student name = Alex, course = 1,
            //         student name = Mary, course = 3,
            //         student name = Oleg, course = 5,
            //         student name = Olya, course = 4,
            //         student name = Zaur, course = 2

// .first()
        System.out.println(students.first());
            // Output: student name = Alex, course = 1

// .last()
        System.out.println(students.last());
            // Output: student name = Zaur, course = 2

// .headSet()
        System.out.println(students.headSet(new Student("Oleg", 5)));
        // Output: student name = Alex, course = 1,
        //         student name = Mary, course = 3

// .tailSet()
        System.out.println(students.tailSet(new Student("Oleg", 5)));
        // Output: student name = Oleg, course = 5,
        //         student name = Olya, course = 4,
        //         student name = Zaur, course = 2

// .subSet()
        System.out.println(students.subSet(new Student("Mary", 3), new Student("Olya", 4)));
        // Output: student name = Mary, course = 3,
        //         student name = Oleg, course = 5

        // check equals and hashCode
        Student st6 = new Student("Olya", 4);

        System.out.println(st5.equals(st6));
            // Output: true

        System.out.println("hashCode st5: " + st5.hashCode() + "\n"
                + "hashCode st6: " + st6.hashCode());
            // Output: hashCode st5: 35
            //         hashCode st6: 35

    }
}
