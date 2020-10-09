//: Concurrent collections: CopyOnWriteArrayList

package Multithreading.CollectionsForMultithreading.ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListCollection {
    public static void main(String[] args) throws InterruptedException {

//        ArrayList<String> list = new ArrayList<>(); // Exception: ConcurrentModificationException

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Oleg");
        list.add("Mary");
        list.add("Alex");
        list.add("John");
        list.add("Olga");

        System.out.println(list);

        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(iterator.next() + "  ");
            }
            System.out.println();
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Lee");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(list);
            // Output: [Oleg, Mary, Alex, John, Olga]
            //          Oleg  Mary  Alex  John  Olga
            //         [Oleg, Mary, Alex, John, Lee]
    }
}
