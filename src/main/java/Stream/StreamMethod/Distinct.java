//: Stream method .distinct() (intermediate)

package Stream.StreamMethod;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {

        Stream<Integer> streamInt = Stream.of(1, 2, 3, 4, 5, 6, 1, 6, 3);
        streamInt.forEach(out -> System.out.print(out + " "));
            // Output: 1 2 3 4 5 6 1 6 3

        System.out.println("\n-----------------");

        Stream<Integer> streamIntSort = Stream.of(1, 2, 3, 4, 5, 6, 1, 6, 3);
        streamIntSort.distinct().forEach(out -> System.out.print(out + " "));
            // Output: 1 2 3 4 5 6

    }
}
