package IOAndNIO.IO.Serialization.ProgOutput;

import java.io.Serializable;

/*public class Employee implements Serializable {

    private static final long serialVersionUID = 1;

    private String firstName;
    private String department;
    private int age;
    private transient double salary;
    private static int count = 1;
    private Car car;

    public Employee(String firstName, String department, int age, double salary, Car car) {
        this.firstName = firstName;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
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
                + " first name: " + firstName
                + ", department: " + department
                + ", age: " + age
                + ", salary: " + salary
                + ", car: " + car;
    }
}*/

public class Employee implements Serializable {

    private static final long serialVersionUID = 2;

    private String firstName;
    private String lastName;
    private String department;
    private transient double salary;
    private static int count = 1;
    private Car car;

    public Employee(String firstName, String lastName, String department, double salary, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLasttName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee #" + count++
                + " first name: " + firstName
                + ", last name: " + lastName
                + ", department: " + department
                + ", salary: " + salary
                + ", car: " + car;
    }
}
