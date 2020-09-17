//: Queue => Deque => ArrayDeque example
//       methods:
//           .addFirst()
//           .addLast()
//           .offerFirst()
//           .offerLast()
//           .removeFirst()
//           .removeLast()
//           .pollFirst()
//           .pollLast()
//           .getFirst()
//           .getLast()
//           .peelFirst()
//           .peekLast()


package Collection.Queue.ArrayDeque;

import java.util.*;

public class ArrayDequeMethods {
    public static void main(String[] args) {

        Deque<Integer> list = new ArrayDeque<>();

// .add()
        list.add(12);
        System.out.println(list);
            // Output: [12]

// .addLast()
        list.addLast(86);
        System.out.println(list);
            // Output: [12, 86]

// .addFirst()
        list.addFirst(79);
        System.out.println(list);
            // Output: [79, 12, 86]

// .offerFirst()
        list.offerFirst(56);
        System.out.println(list);
            // Output: [56, 79, 12, 86]

// .offerLast()
        list.offerLast(81);
        System.out.println(list);
            // Output: [56, 79, 12, 86, 81]

// .removeFirst()
        System.out.println(list.removeFirst());
            // Output: 56

// .removeLast()
        System.out.println(list.removeLast());
            // Output: 81

// .pollFirst()
        System.out.println(list.pollFirst());
            // Output: 79

// .pollLast()
        System.out.println(list.pollLast());
            // Output: 86

        System.out.println(list);
            // Output: [12]

        list.add(34);
        list.add(56);
        list.add(99);
        list.add(14);

        System.out.println(list);
            // Output: [12, 34, 56, 99, 14]

// .getFirst()
        System.out.println(list.getFirst());
            // Output: 12

// .getLast()
        System.out.println(list.getLast());
            // Output: 14

// .peekFirst()
        System.out.println(list.peekFirst());
            // Output: 12

// .peekLast()
        System.out.println(list.peekLast());
            // Output: 14

    }
}
