//: Stream method .forEach() (t)

package Stream.StreamMethod;

import java.util.Arrays;

public class StreamMethodForEach {
    public static void main(String[] args) {

        String[] array = {"A", "G", "T", "S", "X", "K", "O"};

// long write:
        Arrays.stream(array).forEach(element ->
                System.out.print(element + " "));
            // Output: A G T S X K O

// short write:
        Arrays.stream(array).forEach(System.out::print);
        // Output: AGTSXKO

// example short write:

        int[] arrayInt = {1, 2, 3, 4, 5};

        Arrays.stream(arrayInt).forEach(System.out::print);
            // Output: 12345


        Arrays.stream(arrayInt).forEach(element -> Utils.addMethod(element));
            // Output: 6 7 8 9 10
// or
        Arrays.stream(arrayInt).forEach(Utils::addMethod);
            // Output: 6 7 8 9 10
    }
}

class Utils {

    public static void addMethod(int a) {
        a = a + 5;
        System.out.print(a + " ");
    }
}