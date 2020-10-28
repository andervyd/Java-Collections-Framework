//: Reflection [create class Class]
//       methods: .getField()
//                .getType()
//                .getFields()
//                .getName()
//                .getDeclaredFields()
//                .getMethod()
//                .getReturnType()
//                .getParameterTypes()
//                .getMethods()
//                .getDeclaredMethods()
//                .isPublic()
//                .getModifiers()
//                .getConstructor()
//                .getParameterCount()
//                .getConstructors()
//                .getDeclaredConstructors()

package ImportantTopics.ReflectionClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionMethod {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

/*
// create Class #1
        Class employeeInfoV1 = Class.forName("src/main/java/ImportantTopics/ReflectionClass.Employee");

// create Class #2
        Class employeeInfoV2 = Employee.class;

// create Class #3
        Employee employee = new Employee();
        Class employeeInfoV3 = employee.getClass();
*/

        Class employeeInfo = Employee.class;
        Field employeeField = employeeInfo.getField("id");
        System.out.println("Type of 'id' field: " + employeeField.getType());
            // Output: Type of 'id' field: int

        System.out.println("-----------------------------");

        Field [] fieldsEmployee = employeeInfo.getFields();
        for(Field field : fieldsEmployee) {
            System.out.println("Type of " + field.getName() + " : " + field.getType());
        }
            // Output: Type of id : int
            //         Type of name : class java.lang.String
            //         Type of department : class java.lang.String

        System.out.println("-----------------------------");

        Field [] fieldsAllEmployee = employeeInfo.getDeclaredFields();
        for(Field field : fieldsAllEmployee) {
            System.out.println("Type of " + field.getName() + " : " + field.getType());
        }
            // Output: Type of id : int
            //         Type of name : class java.lang.String
            //         Type of department : class java.lang.String
            //         Type of salary : double

        System.out.println("-----------------------------");

        Method someMethod = employeeInfo.getMethod("increaseSalary");
        System.out.println("Return type of method 'increaseSalary': " + someMethod.getReturnType() +
                ", parameter type: " + Arrays.toString(someMethod.getParameterTypes()));
            // Output: Return type of method 'increaseSalary': void, parameter type: []

        System.out.println("-----------------------------");

        Method someMethodWithParam = employeeInfo.getMethod("setSalary", double.class);
        System.out.println("Return type of method 'setSalary': " + someMethodWithParam.getReturnType() +
                ", parameter type: " + Arrays.toString(someMethodWithParam.getParameterTypes()));
            // Output: Return type of method 'increaseSalary': void, parameter type: [double]

        System.out.println("-----------------------------");

        Method [] allMethods = employeeInfo.getMethods();
        for(Method method : allMethods) {
            System.out.println("Name of method: " + method.getName() +
                    ", return type of method : " + method.getReturnType() +
                    ", parameter type: " + Arrays.toString(method.getParameterTypes()));
        }
            // Output: Name of method: increaseSalary, return type of method : void, parameter type: []
            //         Name of method: setSalary, return type of method : void, parameter type: [double]
            //         Name of method: getSalary, return type of method : double, parameter type: []
            //         Name of method: toString, return type of method : class java.lang.String, parameter type: []
            //         Name of method: wait, return type of method : void, parameter type: [long]
            //         Name of method: wait, return type of method : void, parameter type: [long, int]
            //         Name of method: wait, return type of method : void, parameter type: []
            //         Name of method: equals, return type of method : boolean, parameter type: [class java.lang.Object]
            //         Name of method: hashCode, return type of method : int, parameter type: []
            //         Name of method: getClass, return type of method : class java.lang.Class, parameter type: []
            //         Name of method: notify, return type of method : void, parameter type: []
            //         Name of method: notifyAll, return type of method : void, parameter type: []

        System.out.println("-----------------------------");

        Method [] allMethodsWithPrivate = employeeInfo.getDeclaredMethods();
        for(Method method : allMethodsWithPrivate) {
            System.out.println("Name of method: " + method.getName() +
                    ", return type of method : " + method.getReturnType() +
                    ", parameter type: " + Arrays.toString(method.getParameterTypes()));
        }
        // Output: Name of method: increaseSalary, return type of method : void, parameter type: []
        //         Name of method: setSalary, return type of method : void, parameter type: [double]
        //         Name of method: getSalary, return type of method : double, parameter type: []
        //         Name of method: changeDepartment, return type of method : void, parameter type: [class java.lang.String]
        //         Name of method: toString, return type of method : class java.lang.String, parameter type: []

        System.out.println("-----------------------------");

        Method [] allPublicMethods = employeeInfo.getDeclaredMethods();
        for(Method method : allPublicMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method: " + method.getName() +
                        ", return type of method : " + method.getReturnType() +
                        ", parameter type: " + Arrays.toString(method.getParameterTypes()));
            }
        }
        // Output: Name of method: increaseSalary, return type of method : void, parameter type: []
        //         Name of method: setSalary, return type of method : void, parameter type: [double]
        //         Name of method: getSalary, return type of method : double, parameter type: []
        //         Name of method: toString, return type of method : class java.lang.String, parameter type: []

        System.out.println("-----------------------------");

        Constructor constructor = employeeInfo.getConstructor();
        System.out.println("Constructor has " + constructor.getParameterCount() +
                " parameters, their types has " +
                Arrays.toString(constructor.getParameterTypes()));
            // Output: Constructor has 0 parameters, their types has []

        System.out.println("-----------------------------");

        Constructor constructorWithParameter = employeeInfo.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructorWithParameter.getParameterCount() +
                " parameters, their types has " + Arrays.toString(
                        constructorWithParameter.getParameterTypes()));
            // Output: Constructor has 3 parameters, their types has
            //                  [int, class java.lang.String, class java.lang.String]

        System.out.println("-----------------------------");

        Constructor [] constructorEmployee = employeeInfo.getConstructors();
        for(Constructor constructorFor : constructorEmployee) {
            System.out.println("Constructor has " + constructorFor.getParameterCount() +
                    " parameters, their types has \n" + Arrays.toString(
                    constructorFor.getParameterTypes()));
        }
            // Output: Constructor has 0 parameters, their types has
            //              []
            //         Constructor has 4 parameters, their types has
            //              [int, class java.lang.String, class java.lang.String, double]
            //         Constructor has 3 parameters, their types has
            //              [int, class java.lang.String, class java.lang.String]

        System.out.println("-----------------------------");

        Constructor [] constructorPrivate = employeeInfo.getDeclaredConstructors();
        for(Constructor constructorFor : constructorPrivate) {
            System.out.println("Constructor has " + constructorFor.getParameterCount() +
                    " parameters, their types has \n" + Arrays.toString(
                    constructorFor.getParameterTypes()));
        }
        // Output: Constructor has 0 parameters, their types has
        //              []
        //         Constructor has 4 parameters, their types has
        //              [int, class java.lang.String, class java.lang.String, double]
        //         Constructor has 2 parameters, their types has
        //              [int, class java.lang.String]
        //         Constructor has 3 parameters, their types has
        //              [int, class java.lang.String, class java.lang.String]

    }
}