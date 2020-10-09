//: Concurrent collections: ConcurrentHashMap

package Multithreading.CollectionsForMultithreading.ConcurrentCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapCollection {
    public static void main(String[] args) throws InterruptedException {

//        HashMap<Integer, String> map = new HashMap<>();

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Oleg");
        map.put(2, "Mary");
        map.put(3, "Alex");
        map.put(4, "John");
        map.put(5, "Olga");

        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while(iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Liam");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(map);

    }
}/* Output:
            {1=Oleg, 2=Mary, 3=Alex, 4=John, 5=Olga}
            1 : Oleg
            2 : Mary
            3 : Alex
            4 : John
            5 : Olga
            6 : Liam
            {1=Oleg, 2=Mary, 3=Alex, 4=John, 5=Olga, 6=Liam}
*///:~