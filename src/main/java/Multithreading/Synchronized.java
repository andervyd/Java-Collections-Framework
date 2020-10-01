package Multithreading;

public class Synchronized {
    static int count = 0;

    public static synchronized void increment() { // synchronized method
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MethodCall());
        Thread thread2 = new Thread(new MethodCall());

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        System.out.println("Counter: " + count);
            //Output: Counter: 20000
    }
}

class MethodCall implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            Synchronized.increment();
        }
    }
}