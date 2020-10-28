//: Reflection [create class Class]
//          methods: .setAccessible()
//                   .set()
//                   .get()

package ImportantTopics.ReflectionClass;

import java.lang.reflect.Field;

public class ReflectionMethodChange {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        NewEmployee employee = new NewEmployee(3, "Ivan", "IT");
        System.out.println(employee);
            // Output: Employee ::  id: 3, name: Ivan, department: IT, salary: 1000.0

        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");

        field.setAccessible(true);

        double salary = (Double) field.get(employee);
        System.out.println("private field \"salary\" " + salary);
            // Output: private field "salary" 1000.0

        field.set(employee, 1500);
        System.out.println(employee);
            // Output: Employee ::  id: 3, name: Ivan, department: IT, salary: 1500.0








    }
}
