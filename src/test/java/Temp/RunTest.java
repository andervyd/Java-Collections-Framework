package Temp;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RunTest {
    public static void main(String[] args) {

        RunTest runMethod = new RunTest();

        runMethod.runTest();
    }

    private void runTest() {

        try {

            Class classPath = Class.forName("Temp.JUnitTest");

            Constructor constructors = classPath.getConstructor();
            Object entity = constructors.newInstance();
            Method[] methods = classPath.getMethods();

            for(Method method : methods) {

                Test annotation = method.getAnnotation(Test.class);
                if(annotation != null) {
                    method.invoke(entity);
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
