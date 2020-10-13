//: Synchronized collections example

package Multithreading.CollectionsForMultithreading.SynchronizedСollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloneArrayList {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> source = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            source.add(i);
        }

//        ArrayList<Integer> target =  new ArrayList<>();

        List<Integer> syncList =
                Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () -> syncList.addAll(source);

        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread0.start();
        thread1.start();

        thread0.join();
        thread1.join();

        System.out.print(syncList);
            // Output: [0, 1, 2, 3, 4, 0, 1, 2, 3, 4]
    }
}
