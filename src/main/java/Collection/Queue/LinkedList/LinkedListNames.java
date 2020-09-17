//: Queue => Deque => LinkedList
//         methods:
//                .add()
//                .offer()
//                .remove()
//                .poll()
//                .element()
//                .peek()


package Collection.Queue.LinkedList;

import java.util.*;

public class LinkedListNames {
    public static void main(String[] args) {

        Queue<String> list4 = new LinkedList<>();
        list4.add("E");
        list4.add("S");

        Queue<String> list3 = new LinkedList<>();
        list3.add("E");
        list3.add("S");

        Queue<String> list2 = new LinkedList<>();
        list2.add("E");
        list2.add("S");
        list2.add("X");

// methods:

        Queue<String> list = new LinkedList<>();

// .add()
        list.add("S");
        list.add("E");
        list.add("H");

        System.out.println(list);
            // Output: [S, E, H]

// .offer()
        list.offer("P");
        list.offer("Z");
        list.offer("I");

        System.out.println(list);
            // Output: [S, E, H, P, Z, I]

// .remove()
        list.remove("E");
        System.out.println(list);
            // Output: [S, H, P, Z, I]

    // or
        System.out.println(list.remove()); // S
        System.out.println(list.remove()); // H
        System.out.println(list.remove()); // P
        System.out.println(list.remove()); // Z
        System.out.println(list.remove()); // I
//        System.out.println(list.remove()); // Exception: NoSuchElementException

// .poll()
        System.out.println(list2);
            // Output: [E, S, X]

        System.out.println(list2.poll()); // E
        System.out.println(list2.poll()); // S
        System.out.println(list2.poll()); // X
        System.out.println(list2.poll()); // null (NOT EXCEPTION)

// .element()
        System.out.println(list3);
            // Output: [E, S]

        System.out.println(list3.element());
            // Output: E

    // if
        list3.poll();
        list3.poll();
//        System.out.println(list3.element()); // Exception: NoSuchElementException

// .peek()
        System.out.println(list4);
        // Output: [E, S]

        System.out.println(list4.element());
        // Output: E

        list4.poll();
        list4.poll();
        System.out.println(list4.peek()); // null (NOT EXCEPTION)

    }
}
