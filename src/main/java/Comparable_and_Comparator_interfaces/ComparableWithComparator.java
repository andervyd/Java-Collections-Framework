//: Comparable with Comparator

package Comparable_and_Comparator_interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {

    private int id;
    private String first_name;
    private String last_name;
    private int salary;

    public Employee(int id, String first_name, String last_name, int salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return "Employee: "+ "\n"
                + "  id: " + id + ", "
                + "first name: " + first_name + ", "
                + "last name: " + last_name + ", "
                + "salary: " + salary + ";"
                + "\n";
    }

    
    public int compareTo(Employee employee) {
        return this.id - employee.id;
    }
}


class SalaryComparator implements Comparator<Employee> {

    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSalary() - emp2.getSalary();
    }
}


class Output {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();

        Employee employee_1 = new Employee(14,   "Zaur", "Tregulov", 2300);
        Employee employee_2 = new Employee(2,    "Ivan", "Tara",     2600);
        Employee employee_3 = new Employee(315,  "John", "Snow",     1800);
        Employee employee_4 = new Employee(1456, "Petr", "Verhovez", 4200);
        Employee employee_5 = new Employee(64,   "Ivan", "Smirnov",  2600);

        list.add(employee_1);
        list.add(employee_2);
        list.add(employee_3);
        list.add(employee_4);
        list.add(employee_5);

        System.out.println("Default sorting: ");              // default sort
        System.out.println(list);

        Collections.sort(list);                               // implements Comparable

        System.out.println("Collections sorting 'id': ");
        System.out.println(list);

        Collections.sort(list, new SalaryComparator());       // implements Comparator

        System.out.println("Collections sorting 'salary': ");
        System.out.println(list);

    }
}/* Output:
            Default sorting:
            [Employee:
              id: 14, first name: Zaur, last name: Tregulov, salary: 2300;
            , Employee:
              id: 2, first name: Ivan, last name: Tara, salary: 2600;
            , Employee:
              id: 315, first name: John, last name: Snow, salary: 1800;
            , Employee:
              id: 1456, first name: Petr, last name: Verhovez, salary: 4200;
            , Employee:
              id: 64, first name: Ivan, last name: Smirnov, salary: 2600;
            ]

            Collections sorting 'id':
            [Employee:
              id: 2, first name: Ivan, last name: Tara, salary: 2600;
            , Employee:
              id: 14, first name: Zaur, last name: Tregulov, salary: 2300;
            , Employee:
              id: 64, first name: Ivan, last name: Smirnov, salary: 2600;
            , Employee:
              id: 315, first name: John, last name: Snow, salary: 1800;
            , Employee:
              id: 1456, first name: Petr, last name: Verhovez, salary: 4200;
            ]

            Collections sorting 'salary':
            [Employee:
              id: 315, first name: John, last name: Snow, salary: 1800;
            , Employee:
              id: 14, first name: Zaur, last name: Tregulov, salary: 2300;
            , Employee:
              id: 2, first name: Ivan, last name: Tara, salary: 2600;
            , Employee:
              id: 64, first name: Ivan, last name: Smirnov, salary: 2600;
            , Employee:
              id: 1456, first name: Petr, last name: Verhovez, salary: 4200;
            ]
*///:~