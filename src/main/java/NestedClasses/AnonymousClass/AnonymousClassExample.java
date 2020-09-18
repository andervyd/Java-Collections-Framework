//: Anonymous class example

package NestedClasses.AnonymousClass;

interface Math {

    String doSomething(int a, int b);
}
public class AnonymousClassExample {

    private int var;

    public static void main(String[] args) {

        Math addition = new Math(){
            @Override
            public String doSomething(int a, int b) {
                return "Sum " + a + " + " + b + " = " + (a + b);
            }

            void callVar() {
                AnonymousClassExample classExample = new AnonymousClassExample();
                System.out.println(classExample.var);
            }

        };

        System.out.println(addition.doSomething(7, 4));
    }
}/* Output:
            Sum 7 + 4 = 11
*///:~
