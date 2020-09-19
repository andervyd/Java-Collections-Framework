package Lambda.ReplacementLambda;

import java.util.*;

public class StudentInfoV1 {
    public static void main(String[] args) {

        Student st1 = new Student("Mary",  'f', 24, 5, 8.43);
        Student st2 = new Student("Oleg",  'm', 22, 3, 7.82);
        Student st3 = new Student("Sasha", 'f', 20, 2, 8.7);
        Student st4 = new Student("Zaur",  'm', 25, 5, 8.3);
        Student st5 = new Student("Petr",  'm', 20, 2, 7.66);

        ArrayList<Student> list = new ArrayList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        for (Student studentList : list) {
            System.out.println(studentList);
        }
            // Output: Student #1 name: Mary, sex: f, age: 24, course: 5, avgGrade: 8.43
            //         Student #2 name: Oleg, sex: m, age: 22, course: 3, avgGrade: 7.82
            //         Student #3 name: Sasha, sex: f, age: 20, course: 2, avgGrade: 8.7
            //         Student #4 name: Zaur, sex: m, age: 25, course: 5, avgGrade: 8.3
            //         Student #5 name: Petr, sex: m, age: 20, course: 2, avgGrade: 7.66

        StudentInfoV1 info = new StudentInfoV1();

        System.out.println("-----------------------------------------------------");
        info.printStudentsOverGrade(list, 8);
            // Output: Student #6 name: Mary, sex: f, age: 24, course: 5, avgGrade: 8.43
            //         Student #7 name: Sasha, sex: f, age: 20, course: 2, avgGrade: 8.7
            //         Student #8 name: Zaur, sex: m, age: 25, course: 5, avgGrade: 8.3

        System.out.println("-----------------------------------------------------");
        info.printStudentsUnderAge(list, 22);
            // Output: Student #9 name: Sasha, sex: f, age: 20, course: 2, avgGrade: 8.7
            //         Student #10 name: Petr, sex: m, age: 20, course: 2, avgGrade: 7.66

        System.out.println("-----------------------------------------------------");
        info.printStudentsMixCondition(list, 22, 8.5, 'm');
            // Output: Student #11 name: Zaur, sex: m, age: 25, course: 5, avgGrade: 8.3

    }

    public void printStudentsOverGrade(ArrayList<Student> list, double grade) {
        for(Student student : list) {
            if(student.getAvgGrade() > grade) {
                System.out.println(student);
            }
        }
    }

    public void printStudentsUnderAge(ArrayList<Student> list, int age) {
        for(Student student : list) {
            if(student.getAge() < age) {
                System.out.println(student);
            }
        }
    }

    public void printStudentsMixCondition(ArrayList<Student> list, int age, double grade, char sex) {
        for(Student student : list) {
            if(student.getAge() > age && student.getAvgGrade() < grade && student.getSex() == sex) {
                System.out.println(student);
            }
        }
    }

}