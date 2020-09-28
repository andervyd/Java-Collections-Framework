//: Stream method .count() (terminal)

package Stream.StreamMethod;

import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("F", "X", "P", "D");
        System.out.println(stream.count());
            // Output: 4

    }
}
