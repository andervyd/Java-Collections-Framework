//: Stream method .findFirst() (terminal)

package Stream.StreamMethod;

import java.util.*;

public class FindFirst {
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

        Student firstResult = listStudents.stream()
                .map(changeName -> { changeName.setName(changeName.getName()
                .toUpperCase()); return changeName; })
                .filter(filter -> filter.getAge() > 20)
                .findFirst().get();

        System.out.println(firstResult);
            // Output: Student name: IVAT, sex: m, age: 21, course: 3, avgGrade: 8.4

    }
}
