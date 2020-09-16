//: TreeSet example

package Collection.Set.TreeSet;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(3);
        set.add(4);
        set.add(8);
        set.add(1);
        set.add(2);
//        set.add(null); // Exception: NullPointerException

        System.out.println(set);

    }
}
