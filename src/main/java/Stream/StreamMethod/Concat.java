//: Stream method .concat()

package Stream.StreamMethod;

import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {

        Stream<Integer> streamStart = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> streamEnd = Stream.of(6, 7, 8, 9, 10);

        Stream<Integer> streamAll = Stream.concat(streamStart, streamEnd);
        streamAll.forEach(output -> System.out.print(output + " "));
            // Output: 1 2 3 4 5 6 7 8 9 10


    }
}
