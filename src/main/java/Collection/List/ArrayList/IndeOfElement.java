// indexOf(Object element) => int (return index element if not -1)

package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


class Employee {

    private String name;
    private int age;
    private int course;

    public Employee(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name: " + name
                + ", age: " + age
                + ", course: " + course + "]"
                + "\n";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Employee employee = (Employee) object;
        return age == employee.age &&
                course == employee.course &&
                Objects.equals(name, employee.name);
    }
}


public class IndeOfElement {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Mary", 23, 3);
        Employee emp2 = new Employee("Petr", 21, 1);
        Employee emp3 = new Employee("Oleg" , 24, 5);
        Employee emp4 = new Employee("Sveta", 22, 2);
        Employee emp5 = new Employee("Sasha", 24, 4);

        List<Employee> listEmployee = new ArrayList<>();

        listEmployee.add(emp1);
        listEmployee.add(emp2);
        listEmployee.add(emp3);
        listEmployee.add(emp4);
        listEmployee.add(emp5);

        System.out.println(listEmployee);

        Employee emp6 = new Employee("Sasha", 24, 4);

        // In the presence of щverride equals (!)
        System.out.println("\n" + "Index emp6: " + listEmployee.indexOf(emp6));

    }
}/* Output:
            [Student [name: Mary, age: 23, course: 3]
            , Student [name: Petr, age: 21, course: 1]
            , Student [name: Oleg, age: 24, course: 5]
            , Student [name: Sveta, age: 22, course: 2]
            , Student [name: Sasha, age: 24, course: 4]
            ]

            Index emp6: 4
*///:~