//: Stream method .mapToInt().min()
//                .mapToInt().max()

package Stream.StreamMethod.MapTo;

import Stream.ClearStream.Student;
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

        int minAge = listStudents.stream()
                .mapToInt(element -> element.getAge()).min().getAsInt();
        System.out.println("Minimum age students: " + minAge);
        // Output: Minimum age students: 19


        int maxAge = listStudents.stream()
                .mapToInt(element -> element.getAge()).max().getAsInt();
        System.out.println("Maximum age students: " + maxAge);
        // Output: Minimum age students: 24

    }
}