//: Queue => Deque => ArrayDeque example

package Collection.Queue.ArrayDeque;

import java.util.*;

public class ArrayDequeInt {
    public static void main(String[] args) {

        Queue<Integer> list = new ArrayDeque<>();

        list.add(12);
        list.add(42);
        list.add(86);
        list.add(21);
        list.add(79);

        System.out.println(list);




    }
}
