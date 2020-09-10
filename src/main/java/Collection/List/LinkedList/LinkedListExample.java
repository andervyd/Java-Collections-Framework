// LinkedList example

package Collection.List.LinkedList;


import java.util.LinkedList;
import java.util.List;

class Student {
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
        return "Student [name: " + name +
                        ", course: " + course + "]";
    }
}


public class LinkedListExample {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Olga", 2);
        Student st3 = new Student("Mary", 4);
        Student st4 = new Student("Petr", 1);
        Student st5 = new Student("Sveta", 3);

        List<Student> studentList = new LinkedList<>();

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        System.out.println(studentList);
            // Output: [Student [name: Ivan, course: 3], Student [name: Olga, course: 2],
            //          Student [name: Mary, course: 4], Student [name: Petr, course: 1],
            //          Student [name: Sveta, course: 3]]

        System.out.println("Student at second index: " + studentList.get(2));
            // Output: Student at second index: Student [name: Mary, course: 4]

        Student st6 = new Student("Igor", 4);
        Student st7 = new Student("Katy", 3);


        studentList.add(st6);

        System.out.println(studentList);
        // Output: [Student [name: Ivan, course: 3], Student [name: Olga, course: 2],
                 // Student [name: Mary, course: 4], Student [name: Petr, course: 1],
                 // Student [name: Sveta, course: 3], Student [name: Igor, course: 4]]

        studentList.add(1, st7);

        System.out.println(studentList);
        // Output: [Student [name: Ivan, course: 3], Student [name: Katy, course: 3],
                 // Student [name: Olga, course: 2], Student [name: Mary, course: 4],
                // Student [name: Petr, course: 1], Student [name: Sveta, course: 3], Student [name: Igor, course: 4]]

        studentList.remove(3);

        System.out.println(studentList);
        // Output: [Student [name: Ivan, course: 3], Student [name: Katy, course: 3],
                 // Student [name: Olga, course: 2], Student [name: Petr, course: 1],
                 // Student [name: Sveta, course: 3], Student [name: Igor, course: 4]]



    }
}
