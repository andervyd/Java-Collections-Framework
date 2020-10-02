//: Synchronized block example #2:

package Multithreading.SynchronizedBlock;

public class SynchronizedBlockEx2 {
    static int count = 0;

    public static void implement() {
        synchronized (SynchronizedBlockEx2.class) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new CallCounter());
        Thread thread2 = new Thread(new CallCounter());

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        System.out.println("Count: " + count);
    }
}

class CallCounter implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            SynchronizedBlockEx2.implement();
        }
    }
}