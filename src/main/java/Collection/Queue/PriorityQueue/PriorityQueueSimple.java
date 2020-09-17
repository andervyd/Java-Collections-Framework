//: Queue => AbstractQueue => PriorityQueue example

package Collection.Queue.PriorityQueue;

import java.util.*;

public class PriorityQueueSimple {
	public static void main(String[] args) {
		
		Queue<Integer> priorityInt = new PriorityQueue<>();

		priorityInt.add(4);
		priorityInt.add(8);
		priorityInt.add(0);
		priorityInt.add(1);
		priorityInt.add(7);
		
		System.out.println(priorityInt);
			// Output: [0, 1, 4, 8, 7]
		

		Queue<String> priorityStr = new PriorityQueue<>();

		priorityStr.add("D");
		priorityStr.add("A");
		priorityStr.add("X");
		priorityStr.add("G");
		priorityStr.add("S");
		
		System.out.println(priorityStr);
			// Output: [A, D, X, G, S]

	}
}
