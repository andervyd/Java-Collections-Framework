//: ForEach method

package Lambda.ForEach;

import java.util.*;

public class ForEachExaple {
    public static void main(String[] args) {

        List<String> list = List.of("D", "P", "S", "B", "Q");

// method #1
        for(String string : list) {
            System.out.print(string + " ");
        }
            //Output: D P S B Q

// method #2
        System.out.println("\n" + list);
            //Output: [D, P, S, B, Q]

// method #3 (ForEach)
        list.forEach(string -> System.out.print(string + " "));
            //Output: D P S B Q

    }
}
