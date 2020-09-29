//: Stream method .min(), .max() } (terminal)

package Stream.StreamMethod;

import java.util.ArrayList;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) {

        Student st1 = new Student("Ivat",  'm', 21, 3, 8.4);
        Student st2 = new Student("Mary",  'f', 19, 1, 9.1);
        Student st3 = new Student("Oleg",  'm', 23, 5, 7.5);
        Student st4 = new Student("Sasha", 'f', 19, 1, 7.9);
        Student st5 = new Student("Sveta", 'f', 24, 6, 8.2);

        List<Student> listStudents = new ArrayList<>();

        listStudents.add(st1);
        listStudents.add(st2);
        listStudents.add(st3);
        listStudents.add(st4);
        listStudents.add(st5);

        Student minResultForName = listStudents.stream().min((min1, min2) -> min1.getName().compareTo(min2.getName())).get();
        System.out.println(minResultForName);
            // Output: Student name: Ivat, sex: m, age: 21, course: 3, avgGrade: 8.4

        Student maxAge = listStudents.stream().min((max1, max2) -> max2.getAge() - max1.getAge()).get();
        System.out.println(maxAge);
        // Output: Student name: Sveta, sex: f, age: 24, course: 6, avgGrade: 8.2

    }
}
