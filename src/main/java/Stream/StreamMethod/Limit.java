//: Stream method .limit() (intermediate)

package Stream.StreamMethod;

import java.util.*;

public class Limit {
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

        listStudents.stream()
                .filter(filterAge -> filterAge.getAge() > 20)
                    .limit(3)
                        .forEach(System.out::println);
            // Output: Student name: Ivat,  sex: m, age: 21, course: 3, avgGrade: 8.4
            //         Student name: Oleg,  sex: m, age: 23, course: 5, avgGrade: 7.5
            //         Student name: Sveta, sex: f, age: 24, course: 6, avgGrade: 8.2

    }
}
