//: Class AtomicInteger
//    methods: .incrementAndGet()     .getAndIncrement()
//             .addAndGet()           .getAndAdd()
//             .decrementAndGet()     .getAndDecrement()

package Multithreading.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerClass {

    private static AtomicInteger count = new AtomicInteger();

    public static void increment() {
        count.incrementAndGet();
//        count.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new CallAtomicMethod());
        Thread thread2 = new Thread(new CallAtomicMethod());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count);
            // Output: 200
    }
}

class CallAtomicMethod implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            AtomicIntegerClass.increment();
        }
    }
}