//: Chaining class example in stream (work)

package Stream.StreamMethod.Chaining;

import java.util.*;

public class ClassExample {
    public static void main(String[] args) {

        Student st1 = new Student("Oleg", 'm', 34);
        Student st2 = new Student("Mary", 'f', 22);
        Student st3 = new Student("Olga", 'f', 19);
        Student st4 = new Student("Alex", 'm', 27);
        Student st5 = new Student("Svet", 'f', 32);

        List<Student> studentList = new ArrayList<>();

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        studentList.stream().map(element -> element.getName().toUpperCase()).forEach(element -> System.out.print(element + " "));
            // Output: OLEG MARY OLGA ALEX SVET

        studentList.stream().filter(element -> element.getSex() == 'f').forEach(element -> System.out.println(element));
            // Output: Student{name='Mary', sex=f, age=22}
            //         Student{name='Olga', sex=f, age=19}
            //         Student{name='Svet', sex=f, age=32}

        studentList.stream().sorted((sort1, sort2) -> sort1.getAge() - sort2.getAge()).forEach(element -> System.out.println(element));
            // Output: Student{name='Olga', sex=f, age=19}
            //         Student{name='Mary', sex=f, age=22}
            //         Student{name='Alex', sex=m, age=27}
            //         Student{name='Svet', sex=f, age=32}
            //         Student{name='Oleg', sex=m, age=34}

// sort: name - upper; only - female; sort for age:

        studentList.stream().map(change -> { change.setName(change.getName().toUpperCase()); return change;})
                .filter(filter -> filter.getSex() == 'f')
                .sorted((sort1, sort2) -> sort1.getAge() - sort2.getAge())
                .forEach(output -> System.out.println(output));
            // Output: Student{name='OLGA', sex=f, age=19}
            //         Student{name='MARY', sex=f, age=22}
            //         Student{name='SVET', sex=f, age=32}


    }
}

class Student {

    private String name;
    private char sex;
    private int age;

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}