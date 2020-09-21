//: Function<T, R>

package Interfaces.Function;

import java.util.*;
import java.util.function.Function;

public class Student {

    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student [name: " + name
                + ", age: " + age
                + ", course: " + course + "]"
                + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Student student = (Student) o;
        return age == student.age &&
                course == student.course &&
                Objects.equals(name, student.name);
    }
}

class Output {

    public static int avgAge(List<Student> list, Function<Student, Integer> function) {

        int result = 0;
        for(Student student : list) {
            result += function.apply(student);
        }
        result = result / list.size();
        return result;
    }

    public static void main(String[] args) {

        Student st1 = new Student("Mary", 23, 3);
        Student st2 = new Student("Petr", 21, 1);
        Student st3 = new Student("Oleg" , 24, 5);
        Student st4 = new Student("Sveta", 22, 2);
        Student st5 = new Student("Sasha", 24, 4);

        List<Student> listStudent = new ArrayList<>();

        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        listStudent.add(st5);

        listStudent.forEach(student -> System.out.print(student + " "));
            // Output: Student [name: Mary,  age: 23, course: 3]
            //         Student [name: Petr,  age: 21, course: 1]
            //         Student [name: Oleg,  age: 24, course: 5]
            //         Student [name: Sveta, age: 22, course: 2]
            //         Student [name: Sasha, age: 24, course: 4]

//        Function<Student, Integer> function = student -> student.getAge();

        System.out.println("Average student age: " + avgAge(listStudent, function -> function.getAge()));
            // Output:  Average student age: 22

        System.out.println("Average student course: " + avgAge(listStudent, function -> function.getCourse()));
          // Output:  Average student course: 3
    }
}