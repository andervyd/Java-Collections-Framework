//: Runnable (NOT AtomicInteger class)

package Multithreading.AtomicInteger;

public class NotAtomicInteger {

    private static int count;

    public static synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new CallMethod());
        Thread thread2 = new Thread(new CallMethod());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count);
            // Output: 200
    }
}

class CallMethod implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            NotAtomicInteger.increment();
        }
    }
}