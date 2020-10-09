//: Synchronized collections example

package Multithreading.CollectionsForMultithreading.SynchronizedСollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncIterator {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> list = new ArrayList<>(); // NOT sync (Exception: ConcurrentModificationException)

        List<Integer> syncList =
                Collections.synchronizedList(list);

        for(int i = 0; i < 15; i++) {
           syncList.add(i);
        }

        Runnable runnable1 = () -> {
            synchronized (syncList) {
                Iterator<Integer> iterator = syncList.iterator();
                while(iterator.hasNext()) {
                    System.out.print(iterator.next() + "  ");
                }
                System.out.println();
            }
        };

        Runnable runnable2 = () ->
                syncList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(syncList);
            // Output: 0  1  2  3  4  5  6  7  8  9  11  12  13  14
            //        [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14]

    }
}
