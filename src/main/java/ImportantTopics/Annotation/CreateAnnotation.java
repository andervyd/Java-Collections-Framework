//: Create Annotation
//     @MyAnnotation

//     @Target(ElementType._________)
//                        .TYPE
//                        .FIELD
//                        .METHOD
//                        .PARAMETER
//                        . ...

//     @Retention(RetentionPolicy._______)
//                               .SOURCE
//                               .CLASS
//                               .RUNTIME

package ImportantTopics.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CreateAnnotation {
    // some code
}

@interface ForEmployee {

}

@Target(ElementType.TYPE)
@interface ForClass {

}

@Target( {ElementType.FIELD, ElementType.METHOD} )
@interface ForFieldAndMethod {

}

@Retention(RetentionPolicy.RUNTIME)
@interface ForRuntime {

}

@ForRuntime
@ForClass
@ForEmployee
 class Employee {

    @ForFieldAndMethod
    @ForEmployee
     private String name;
     private double salary;

    @ForEmployee
     public Employee(String name, double salary) {
         this.name = name;
         this.salary = salary;
     }

     @ForFieldAndMethod
     @ForEmployee
     public String getName() {
         return name;
     }

     public void setName(@ForEmployee String name) {
         this.name = name;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     public void increaseSalary() {
         salary *= 2;
     }

     public String toString() {
         return "Employee :: name = " + name +
                 ", salary = " + salary;
     }
}