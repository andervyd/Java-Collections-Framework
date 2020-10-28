//: Reflection [create class Class]
//          methods: .newInstance()
//                   .invoke()

package ImportantTopics.ReflectionClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMethodObject {
    public static void main(String[] args) throws IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class employeeClass = Employee.class;

/* V1 [old]
        Object object = employeeClass.newInstance();
        System.out.println(object);
            // Output: Employee ::  id: 0, name: null, department: null, salary: 0.0
*/
/* V2 [old]
        Employee employee = (Employee)employeeClass.newInstance();
        System.out.println(employee);
            // Output: Employee ::  id: 0, name: null, department: null, salary: 0.0
*/
/* V3 [new]
        Constructor constructor = employeeClass.getConstructor();
        Object object = constructor.newInstance();
        System.out.println(object);
            // Output: Employee ::  id: 0, name: null, department: null, salary: 0.0
*/
// V3 [new update]
        Constructor<Employee> employeeConstructor = employeeClass.getConstructor();
        Employee employee = employeeConstructor.newInstance();
        System.out.println(employee);
            // Output: Employee ::  id: 0, name: null, department: null, salary: 0.0

        Constructor constructor = employeeClass.getConstructor(int.class, String.class, String.class);
        Object object = constructor.newInstance(5, "Ivan", "IT");
        System.out.println(object);
            // Output: Employee ::  id: 5, name: Ivan, department: IT, salary: 0.0

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(object, 1200);
        System.out.println(object);
            // Output: Employee ::  id: 5, name: Ivan, department: IT, salary: 1200.0

    }
}
