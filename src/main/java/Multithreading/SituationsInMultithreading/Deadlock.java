//: Situation: deadlock

package Multithreading.SituationsInMultithreading;

public class Deadlock {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {

        Capture1 capture1 = new Capture1();
        Capture2 capture2 = new Capture2();

        capture1.start();
        capture2.start();

            // deadlock
    }
}

class Capture1 extends Thread {

    public void run() {
        System.out.println("Cupture1: attempting to hijack a monitor object 'lock1'");
        synchronized (Deadlock.lock1) {
            System.out.println("Capture1: monitor capture object 'lock1'");
            System.out.println("Cupture1: attempting to hijack a monitor object 'lock2'");
            synchronized (Deadlock.lock2) {
                System.out.println("Capture1: monitors capture objects 'lock1' and 'lock2'");
            }
        }
    }
}

class Capture2 extends Thread {

    public void run() {
        System.out.println("Cupture2: attempting to hijack a monitor object 'lock2'");
        synchronized (Deadlock.lock2) {
            System.out.println("Capture2: monitor capture object 'lock2'");
            System.out.println("Cupture2: attempting to hijack a monitor object 'lock1'");
            synchronized (Deadlock.lock1) {
                System.out.println("Capture2: monitors capture objects 'lock1' and 'lock2'");
            }
        }
    }
}
