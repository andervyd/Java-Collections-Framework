package Multithreading.SynchronizedBlock;

public class CallMyPhone {

    static final Object lock = new Object();

    void mobileCall() {

        synchronized(lock) {                            // lock or CallMyPhone.class
            System.out.println("Call mobile ... ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("mobile call ending.");
        }
    }

    void skypeCall() {

        synchronized (lock) {                           // lock or CallMyPhone.class
            System.out.println("Call skype ... ");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype call ending.");
        }
    }

    void viberCall() {

        synchronized (lock) {                           // lock or CallMyPhone.class
            System.out.println("Call viber ... ");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("viber call ending.");
        }
    }

    public static void main(String[] args) {

        Thread threadMobile = new Thread(new Mobile());
        Thread threadSkype = new Thread(new Skype());
        Thread threadViber = new Thread(new Viber());

        threadMobile.start();
        threadSkype.start();
        threadViber.start();

    }
}

class Mobile implements Runnable {

    @Override
    public void run() {
        new CallMyPhone().mobileCall();
    }
}

class Skype implements Runnable {
    @Override
    public void run() {
        new CallMyPhone().skypeCall();
    }
}

class Viber implements Runnable {
    @Override
    public void run() {
        new CallMyPhone().viberCall();
    }
}

