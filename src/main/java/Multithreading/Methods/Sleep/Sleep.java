//: Thread method .sleep()

package Multithreading.Methods.Sleep;

class SleepThread implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" " + Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class Sleep extends Thread {

    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(" " + Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {

        Thread threadOut = new Thread(new SleepThread());
        Sleep threadIn = new Sleep();

        System.out.println("Starting...");

        threadIn.start();
        threadOut.start();

        System.out.println("...ending");

    }
}