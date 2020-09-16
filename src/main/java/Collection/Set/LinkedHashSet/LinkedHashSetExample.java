//: LinkedHashset example

package Collection.Set.LinkedHashSet;

import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<Integer> link = new LinkedHashSet<>();

        link.add(5);
        link.add(3);
        link.add(1);
        link.add(8);
        link.add(7);

        System.out.println(link);
            // Output: [5, 3, 1, 8, 7]

        link.remove(8);
        System.out.println(link.contains(8));
            // Output: false

        System.out.println(link);
            // Output: [5, 3, 1, 7]

    }
}