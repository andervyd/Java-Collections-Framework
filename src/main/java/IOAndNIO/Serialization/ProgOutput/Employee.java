package IOAndNIO.Serialization.ProgOutput;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String department;
    private int age;
    private double salary;
    private static int count = 1;
    private Car car;

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee #" + count++
                + " name: " + name
                + ", department: " + department
                + ", age: " + age
                + ", salary: " + salary
                + ", car: " + car;
    }
}
