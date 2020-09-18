//: Local inner class example

package NestedClasses.LocalInnerClass;

interface NewMath {

    String doSomething(int a, int b);
}

public class LocalClassExample {
    public static void main(String[] args) {

        class Addition implements NewMath {

            @Override
            public String doSomething(int a, int b) {
                return "Sum " + a + " + " + b + " = " + (a + b);
            }
        }

        Addition sum = new Addition();
        System.out.println(sum.doSomething(5, 3));
    }
}/* Output:
            Sum 5 + 3 = 8
*///:~
