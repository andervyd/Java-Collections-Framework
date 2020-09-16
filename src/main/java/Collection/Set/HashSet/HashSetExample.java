//: HashSet example

package Collection.Set.HashSet;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        stringSet.add("F");
        stringSet.add("H");
        stringSet.add("A");
        stringSet.add("P");
        stringSet.add("X");
//        stringSet.add("X");   // duplicate NOT WORK
        stringSet.add(null);

        System.out.println(stringSet);
            // Output: [P, null, A, F, H, X]

        for(String string : stringSet) {
            System.out.print(string + " ");
        }
        // Output: P null A F H X

    }
}
