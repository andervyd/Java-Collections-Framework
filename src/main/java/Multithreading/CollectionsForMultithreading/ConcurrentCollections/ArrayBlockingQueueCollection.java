//: Concurrent collections: ArrayBlockingQueue

package Multithreading.CollectionsForMultithreading.ConcurrentCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueCollection {
    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> blocking =
                new ArrayBlockingQueue<>(4);

        // Producer
        new Thread(() -> {
            int i = 0;
            while(true) {
                try {
                    blocking.put(++i);
                    System.out.println("Producer  add: " + i
                             + " " + blocking);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            while(true) {
                try {
                    Integer j = blocking.take();
                    System.out.println("Consumer take: " + j
                            + " " + blocking);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}/* Output:
            Producer  add: 1 []
            Consumer take: 1 []
            Producer  add: 2 [2]
            Producer  add: 3 [2, 3]
            Consumer take: 2 [3]
            Producer  add: 4 [3, 4]
            Producer  add: 5 [3, 4, 5]
            Producer  add: 6 [3, 4, 5, 6]
            Consumer take: 3 [4, 5, 6]
            Producer  add: 7 [4, 5, 6, 7]
            Consumer take: 4 [5, 6, 7]
            Producer  add: 8 [5, 6, 7, 8]
            Consumer take: 5 [6, 7, 8]
            Producer  add: 9 [6, 7, 8, 9]
            Consumer take: 6 [7, 8, 9, 10]
            ...
*///:~
