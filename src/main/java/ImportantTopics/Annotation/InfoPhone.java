//: Example Annotation with Reflection

package ImportantTopics.Annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";
    int yearCompany();
}

@SmartPhone(yearCompany = 2010)
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "iOS", yearCompany = 1976)
class iPhone {
    String model;
    double price;
}

public class InfoPhone {
    public static void main(String[] args) {

        Class xiaomiClass = Xiaomi.class;
        Annotation annotationXiaomi = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhoneXiaomi = (SmartPhone) annotationXiaomi;
        System.out.println("Annotation info from Xiaomi class " + smartPhoneXiaomi.OS() + ", " + smartPhoneXiaomi.yearCompany());
            // Output: Annotation info from Xiaomi class Android, 2010

        Class iPhoneClass = iPhone.class;
        Annotation annotationIPhone = iPhoneClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhoneIPhone = (SmartPhone) annotationIPhone;
        System.out.println("Annotation info from Xiaomi class " + smartPhoneIPhone.OS() + ", " + smartPhoneIPhone.yearCompany());
            // Output: Annotation info from Xiaomi class iOS, 1976

    }
}