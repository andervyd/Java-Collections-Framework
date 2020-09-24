//: Chaining array example in stream (work)

package Stream.StreamMethod.Chaining;

import java.util.*;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {-5, 8, 0, 12, -30, 56, 1, -14, 9, 3, -47};

// filter:
        int[] filterArray = Arrays.stream(array).filter(element -> element % 2 == 1).toArray();

        System.out.println(Arrays.toString(filterArray));
            // Output: [1, 9, 3]

// filter + map:
        int[] mapArray = Arrays.stream(array).filter(element -> element % 2 == 1)
                .map(element -> { if(element % 3 == 0) {element = element / 3;} return element; }).toArray();

        System.out.println(Arrays.toString(mapArray));
            // Output: [1, 9, 3]

// filter + map + reduce:
        int result = Arrays.stream(array).filter(element -> element % 2 == 1)
                .map(element -> { if(element % 3 == 0) {element = element / 3;} return element; })
                .reduce((accumulator, element) -> accumulator + element).getAsInt();

        System.out.println(result);
            // Output: 5

    }
}
