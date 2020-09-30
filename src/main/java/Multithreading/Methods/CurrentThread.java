//: Current thread example

package Multithreading.Methods;

class CurrentMethod implements Runnable {

    @Override
    public void run() {
        System.out.println("Method run(); Thread name: " + Thread.currentThread().getName());
    }
}

public class CurrentThread {
    public static void main(String[] args) {

        Thread thread = new Thread(new CurrentMethod());

        thread.start();

        System.out.println("Method main(); Thread name: " + Thread.currentThread().getName());

    }
}/* Output:
            Method run(); Thread name: Thread-0
            Method main(); Thread name: main
*///:~