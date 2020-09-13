//: Stack (implement Vector) example #1

package Collection.List.Stack;

public class StackExample {

    static void firstMethod() {
        System.out.println("Start method #1 ...");
        System.out.println("End method #1");
    }

    static void secondMethod() {
        System.out.println("Start method #2 ...");
        firstMethod();
        System.out.println("End method #2");
    }

    static void thirdMethod() {
        System.out.println("Start method #3 ...");
        secondMethod();
        System.out.println("End method #3");
    }

    public static void main(String[] args) {
        System.out.println("Main start...");

        thirdMethod();

        System.out.println("Main end");

    }
}/* Output:
            Main start...
            Start method #3 ...
            Start method #2 ...
            Start method #1 ...
            End method #1
            End method #2
            End method #3
            Main end
*///:~