//: Stream method .collect(Collectors.partitioningBy()) (terminal)

package Stream.StreamMethod.Collect;

import Stream.ClearStream.Student;
import java.util.*;
import java.util.stream.Collectors;

public class PartitioningBy {
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

        Map<Boolean, List<Student>> map =
                listStudents.stream().collect(Collectors.partitioningBy(sort -> sort.getAge() >= 20));

        String result = "18 - 20 age";
        for(Map.Entry<Boolean, List<Student>> mapEntry : map.entrySet()) {
            if(mapEntry.getKey().equals(true)) {
                result = "20 - 25 age";
            }
            System.out.println(result + " : " + mapEntry.getValue().toString());
        }
            // Output: 18 - 20 age : Student name: Mary,  sex: f, age: 19, course: 1, avgGrade: 9.1
            //                       Student name: Sasha, sex: f, age: 19, course: 1, avgGrade: 7.9
            //         21 - 25 age : Student name: Ivat,  sex: m, age: 21, course: 3, avgGrade: 8.4
            //                       Student name: Oleg,  sex: m, age: 23, course: 5, avgGrade: 7.5
            //                       Student name: Sveta, sex: f, age: 24, course: 6, avgGrade: 8.2

    }
}