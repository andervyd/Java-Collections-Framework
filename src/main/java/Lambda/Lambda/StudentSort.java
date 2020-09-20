//: Lambda sort with comparator

package Lambda.Lambda;

import Lambda.ReplacementLambda.Student;

import java.util.*;

public class StudentSort {
    public static void main(String[] args) {

        Lambda.ReplacementLambda.Student st1 = new Lambda.ReplacementLambda.Student("Mary",  'f', 24, 5, 8.43);
        Lambda.ReplacementLambda.Student st2 = new Lambda.ReplacementLambda.Student("Oleg",  'm', 22, 3, 7.82);
        Lambda.ReplacementLambda.Student st3 = new Lambda.ReplacementLambda.Student("Sasha", 'f', 20, 2, 8.7);
        Lambda.ReplacementLambda.Student st4 = new Lambda.ReplacementLambda.Student("Zaur",  'm', 25, 5, 8.3);
        Lambda.ReplacementLambda.Student st5 = new Lambda.ReplacementLambda.Student("Petr",  'm', 20, 2, 7.66);

        ArrayList<Student> list = new ArrayList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getCourse() - st2.getCourse();
            }
        });

        System.out.println(list);
            // Output: Student #1 name: Sasha, sex: f, age: 20, course: 2, avgGrade: 8.7
            //         Student #2 name: Petr, sex: m, age: 20, course: 2, avgGrade: 7.66
            //         Student #3 name: Oleg, sex: m, age: 22, course: 3, avgGrade: 7.82
            //         Student #4 name: Mary, sex: f, age: 24, course: 5, avgGrade: 8.43
            //         Student #5 name: Zaur, sex: m, age: 25, course: 5, avgGrade: 8.3

        Collections.sort(list, (student1, student2) -> {
            return student2.getCourse() - student1.getCourse();});

        System.out.println(list);
            // Output: Student #6 name: Mary, sex: f, age: 24, course: 5, avgGrade: 8.43
            //         Student #7 name: Zaur, sex: m, age: 25, course: 5, avgGrade: 8.3
            //         Student #8 name: Oleg, sex: m, age: 22, course: 3, avgGrade: 7.82
            //         Student #9 name: Sasha, sex: f, age: 20, course: 2, avgGrade: 8.7
            //         Student #10 name: Petr, sex: m, age: 20, course: 2, avgGrade: 7.66

    }
}
