//: Stream clear example

package Stream.ClearStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Student {

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student " +
                "name: " + name +
                ", sex: " + sex +
                ", age: " + age +
                ", course: " + course +
                ", avgGrade: " + avgGrade;
    }
}

class Output {
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

        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        myStream.filter(element ->
                element.getAge() > 20).forEach(output -> System.out.println(output));
            // Output: Student name: Ivat, sex: m, age: 21, course: 3, avgGrade: 8.4
            //         Student name: Oleg, sex: m, age: 23, course: 5, avgGrade: 7.5
            //         Student name: Sveta, sex: f, age: 24, course: 6, avgGrade: 8.2




    }
}