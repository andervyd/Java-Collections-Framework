//: Stream method .flatMap() (intermediate)

package Stream.StreamMethod;

import java.io.OutputStream;
import java.util.*;

public class FlatMap {
    public static void main(String[] args) {

        Student st1 = new Student("Ivat",  'm', 21, 3, 8.4);
        Student st2 = new Student("Mary",  'f', 19, 1, 9.1);
        Student st3 = new Student("Oleg",  'm', 23, 5, 7.5);
        Student st4 = new Student("Sasha", 'f', 19, 1, 7.9);
        Student st5 = new Student("Sveta", 'f', 24, 6, 8.2);

        Faculty facultyEconomics = new Faculty("Economics");

        facultyEconomics.addStudentToFaculty(st1);
        facultyEconomics.addStudentToFaculty(st3);
        facultyEconomics.addStudentToFaculty(st4);

        Faculty facultyMathematics = new Faculty("Mathematics");

        facultyMathematics.addStudentToFaculty(st2);
        facultyMathematics.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();

        facultyList.add(facultyEconomics);
        facultyList.add(facultyMathematics);

        facultyList.stream().forEach(out -> System.out.println(out));
            // Output: Faculty: Economics Student name: Ivat, sex: m, age: 21, course: 3, avgGrade: 8.4
            //                            Student name: Oleg, sex: m, age: 23, course: 5, avgGrade: 7.5
            //                            Student name: Sasha, sex: f, age: 19, course: 1, avgGrade: 7.9
            //       Faculty: Mathematics Student name: Mary, sex: f, age: 19, course: 1, avgGrade: 9.1
            //                            Student name: Sveta, sex: f, age: 24, course: 6, avgGrade: 8.2

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(output -> System.out.println(output));
            // Output: Student name: Ivat, sex: m, age: 21, course: 3, avgGrade: 8.4
            //         Student name: Oleg, sex: m, age: 23, course: 5, avgGrade: 7.5
            //         Student name: Sasha, sex: f, age: 19, course: 1, avgGrade: 7.9
            //         Student name: Mary, sex: f, age: 19, course: 1, avgGrade: 9.1
            //         Student name: Sveta, sex: f, age: 24, course: 6, avgGrade: 8.2



    }
}

class Faculty {

    private String nameFaculty;
    List<Student> studentsOnFaculty;

    public Faculty(String nameFaculty) {

        this.nameFaculty = nameFaculty;
        studentsOnFaculty = new ArrayList<>();
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    @Override
    public String toString() {
        return "Faculty: " + nameFaculty + " " + studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}