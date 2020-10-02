//: Synchronized block example #1:

package Multithreading.SynchronizedBlock;

public class SynchronizedBlockEx1 {
    public static void main(String[] args) {

        AddToCount toCount = new AddToCount();

        Thread thread1 = new Thread(toCount);
        Thread thread2 = new Thread(toCount);
        Thread thread3 = new Thread(toCount);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class Count {
    static int count = 0;
}

class AddToCount implements Runnable {

    private void someString() {
        System.out.print(" error ");
    }

    private void increment() {
        someString();

        synchronized (this) {    // synchronized block
            Count.count++;
            System.out.print(Count.count + " ");
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            increment();
        }
    }
}