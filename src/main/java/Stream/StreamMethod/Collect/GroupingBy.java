//: Stream method .collect(Collectors.groupingBy()) (terminal)

package Stream.StreamMethod.Collect;

import Stream.ClearStream.Student;
import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy {
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

        Map<Integer, List<Student>> groubStudents = listStudents.stream()
                .map(changeName -> {
                    changeName.setName(changeName.getName().toUpperCase()); return changeName; })
                .collect(Collectors.groupingBy(groupBy -> groupBy.getCourse()));

        System.out.println(groubStudents.entrySet());
            // Output: 1 = Student name: MARY,  sex: f, age: 19, course: 1, avgGrade: 9.1
            //             Student name: SASHA, sex: f, age: 19, course: 1, avgGrade: 7.9
            //         3 = Student name: IVAT,  sex: m, age: 21, course: 3, avgGrade: 8.4
            //         5 = Student name: OLEG,  sex: m, age: 23, course: 5, avgGrade: 7.5
            //         6 = Student name: SVETA, sex: f, age: 24, course: 6, avgGrade: 8.2

    }
}
