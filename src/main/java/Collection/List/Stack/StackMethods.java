//: Stack (implement Vector) example #2

// methods.:
//          .push()
//          .pop()
//          .peek()
//          .isEmpty()



package Collection.List.Stack;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {

        Stack<String> stackString = new Stack<>();

        // .push()
        stackString.push("Ivan");
        stackString.push("Mary");
        stackString.push("Oleg");
        stackString.push("Sveta");

        System.out.println(stackString);
            // Output: [Ivan, Mary, Oleg, Sveta]

        // .pop()
        System.out.println(stackString.pop());

        System.out.println(stackString);
        // Output: Sveta
        //        [Ivan, Mary, Oleg]

        // .peek()
        System.out.println(stackString.peek());

        System.out.println(stackString);
        // Output: Oleg
        //        [Ivan, Mary, Oleg]
    }
}