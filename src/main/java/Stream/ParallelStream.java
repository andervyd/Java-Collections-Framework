//: Parallel stream

package Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();

        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

// list.parallelStream(). ...

        // example:
        double resultStream = list.stream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("Sum all elements: " + resultStream);
            // Output: Sum all elements: 16.25

        double resultParallelStream = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("Sum all elements: " + resultParallelStream);
            // Output: Sum all elements: 16.25

        // example:
        double divResultStream = list.stream()
                .reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("Division all elements: " + divResultStream);
            // Output: Division all elements: 8.0

        double divResultParallelStream = list.parallelStream()
                .reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("Division all elements: " + divResultParallelStream);
            // Output: Division all elements: 0.5


    }
}
