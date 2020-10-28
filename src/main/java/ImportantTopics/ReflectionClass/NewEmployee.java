package ImportantTopics.ReflectionClass;

public class NewEmployee {

    public int id;
    public String name;
    public String department;
    private double salary = 1000;

    public NewEmployee() {
        // default
    }


    private NewEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public NewEmployee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

/*
    public NewEmployee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
*/

/*
    public double getSalary() {
        return salary;
    }
*/

/*
    public void setSalary(double salary) {
        this.salary = salary;
    }
*/

    private void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("New department is: " + department);
    }

    public void increaseSalary() {
        salary *= 2;
    }

    public String toString() {
        return "Employee :: " +
                " id: " + id +
                ", name: " + name +
                ", department: " + department +
                ", salary: " + salary;
    }
}