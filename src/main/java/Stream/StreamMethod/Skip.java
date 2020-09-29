//: Stream method .skip() (intermediate)

package Stream.StreamMethod;

import java.util.List;

public class Skip {
    public static void main(String[] args) {

        List<Integer> list = List.of(3, 4, 6, 9, 1, 8, 12, 9);
            // sort: 3, 4,  >  6, 9,  .skip(2)  8, 12, 9

        list.stream()
                    .filter(f -> f > 5)
                        .skip(2)
                            .forEach(output -> System.out.print(output + " "));
            // Output: 8 12 9

    }
}
