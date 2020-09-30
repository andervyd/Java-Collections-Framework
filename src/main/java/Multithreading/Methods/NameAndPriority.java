//: Thread methods:
//                 .getName()
//                 .setName()
//                 .getPriority()
//                 .setPriority()

package Multithreading.Methods;

class FirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("Run first thread method...");
    }
}

class SecondThread extends Thread {

    @Override
    public void run() {
        System.out.println("Run second thread method...");
    }
}

class ThirdThread extends Thread {

    @Override
    public void run() {
        System.out.println("Run third thread method...");
    }
}

public class NameAndPriority {
    public static void main(String[] args) {

        System.out.println("------------------ change name ------------------");

        FirstThread firstThread = new FirstThread();
        firstThread.start();

        firstThread.setName("First thread");

        System.out.println("#1. Name thread: " + firstThread.getName()
            + ", priority thread: " + firstThread.getPriority());

        System.out.println("---------------- change priority ----------------");

        SecondThread secondThread = new SecondThread();
        secondThread.start();

        secondThread.setPriority(10);

        System.out.println("#2. Name thread: " + secondThread.getName()
                + ", priority thread: " + secondThread.getPriority());

        System.out.println("-------------------- default --------------------");

        ThirdThread thirdThread = new ThirdThread();
        thirdThread.start();

        System.out.println("#3. Name thread: " + thirdThread.getName()
                + ", priority thread: " + thirdThread.getPriority());

    }
}/* Output:
            ------------------ change name ------------------
            Run first thread method...
            #1. Name thread: First thread, priority thread: 5
            ---------------- change priority ----------------
            Run second thread method...
            #2. Name thread: Thread-1, priority thread: 10
            -------------------- default --------------------
            Run third thread method...
            #3. Name thread: Thread-2, priority thread: 5
*///:~
