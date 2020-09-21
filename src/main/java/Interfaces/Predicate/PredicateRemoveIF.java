//: Predicate<T> method .removeIf()

package Interfaces.Predicate;

import java.util.*;
import java.util.function.Predicate;

public class PredicateRemoveIF {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("goodby");
        list.add("hello");
        list.add("welcome");
        list.add("how a you");
        list.add("thanks");

        for(String string : list) {
            System.out.print("length " + string + ": " + string.length() + " ");
        }
            // Output: length goodby: 6 length hello: 5 length welcome: 7 length how a you: 9 length thanks: 6

        System.out.println("----------------------------");
        list.removeIf(remove -> remove.length() < 7);

        System.out.println(list);
            // Output: [welcome, how a you]
    }
}
