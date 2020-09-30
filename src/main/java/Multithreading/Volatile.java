//: Thread keyword volatile

package Multithreading;

public class Volatile extends Thread {
    volatile boolean b = true;  // create volatile

    public void run() {
        long count = 0;
        while(b) {
            count++;
        }
        System.out.println("Loop is finished. \nCount: " + count);
    }

    public static void main(String[] args) throws InterruptedException {

        Volatile thread = new Volatile();
        thread.start();

        Thread.sleep(3000);
        System.out.println("After 3s it is time to wake up.");

        thread.b = false;
        thread.join();

        System.out.println("End of program.");

    }
}/* Output:
            After 3s it is time to wake up.
            Loop is finished.
            Count: 2633819811
            End of program.
*///:~
