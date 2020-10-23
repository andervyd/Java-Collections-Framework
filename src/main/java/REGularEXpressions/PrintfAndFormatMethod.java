//: Method .printf();
//       %[flags][width][.precision]datatype_specifier

package REGularEXpressions;

public class PrintfAndFormatMethod {

    public static void employeeInfo(Employee emp) {
        System.out.printf("id: %03d, name: %-1s, salary: %,.1f.\n",
                emp.getId(), emp.getName(), emp.getSalary() * (1 + emp.getBonus()));
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(9,  "Ivan", 1200, 2.3);
        Employee emp2 = new Employee(14, "Mary", 2100, 0.0);
        Employee emp3 = new Employee(25, "John", 1900, 0.3);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);
            // Output: id: 009, name: Ivan, salary: 3,960.0.
            //         id: 014, name: Mary, salary: 2,100.0.
            //         id: 025, name: John, salary: 2,470.0.

        System.out.printf("-------------------------------------\n");
        String formatForEmployee = String.format("id: %03d, name: %-1s, salary: %,.1f.\n",
                9, "Ivan", 1200 * (1 + 2.3));
        System.out.println(formatForEmployee);
            // Output: id: 009, name: Ivan, salary: 3,960.0.

    }
}

class Employee {

    private int id;
    private String name;
    private int salary;
    private double bonus;

    public Employee(int id, String name, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }
}