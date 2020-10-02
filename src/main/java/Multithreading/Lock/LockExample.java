//: Interface Lock;
//  Class ReentrantLock;
//  Methods: .lock() and .unlock()

package Multithreading.Lock;

import java.util.concurrent.locks.Lock;          // interface
import java.util.concurrent.locks.ReentrantLock; // class

public class LockExample {
    public static void main(String[] args) {

        Call call = new Call();

        Thread threadMobile = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread threadSkype = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread threadViber = new Thread(new Runnable() {
            @Override
            public void run() {
                call.viberCall();
            }
        });

        threadMobile.start();
        threadSkype.start();
        threadViber.start();

    }
}/* Output:
            Mobile call starts
            Mobile call ends
            Viber call starts
            Viber call ends
            Skype call starts
            Skype call ends
*///:~

class Call {

    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();

        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();

        try {
            System.out.println("Skype call starts");
            Thread.sleep(3000);
            System.out.println("Skype call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void viberCall() {
        lock.lock();

        try {
            System.out.println("Viber call starts");
            Thread.sleep(3000);
            System.out.println("Viber call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
