//: Stream method .peek() (intermediate)

package Stream.StreamMethod;

import java.util.*;

public class Peek {
    public static void main(String[] args) {

        List<String> list = List.of("D", "P", "H", "W", "Q");

        list.stream().peek(out -> System.out.print(out + " "))
                .map(map -> map.toUpperCase())
                .peek(out -> System.out.print(out + " "))
                .forEach(out -> System.out.println(out + " "));

    }
}/* Output:
            D D D
            P P P
            H H H
            W W W
            Q Q Q
*///:~