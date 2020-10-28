//: Example reflection

package ImportantTopics.ReflectionClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    public void sum(int a, int b) {
        System.out.println("Sum :: " + a + " + " + b + " = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction :: " + a + " - " + b + " = " + (a - b));
    }

    public void mult(int a, int b) {
        System.out.println("Multiplication :: " + a + " * " + b + " = " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("Division :: " + a + " \\ " + b + " = " + (a / b));
    }
}

class Main {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(
                "src/main/java/ImportantTopics/ReflectionClass/resource/input parameters.txt"))) {

            String nameMethod = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();

            Class calculatorClass = calculator.getClass();

            Method method = null;

            Method [] methods = calculatorClass.getDeclaredMethods();
            for(Method methodFor : methods) {
                if(methodFor.getName().equals(nameMethod)) {
                    method = methodFor;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}/* Input:
            sum
            12
            8
    Output:
            Sum :: 12 + 8 = 20
*///:~