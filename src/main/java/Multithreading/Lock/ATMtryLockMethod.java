//: Method .tryLock() => boolean

package Multithreading.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATMtryLockMethod {
    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();

        new Student("Ivan", lock);
        new Student("Svet", lock);

        Thread.sleep(5000);

        new Student("Oleg", lock);
        new Student("Olga", lock);
        new Student("Alex", lock);

    }
}/* Output:
            Svet does not wait
            Ivan uses an ATM
            Ivan finished work
            Oleg uses an ATM
            Olga does not wait
            Alex does not wait
            Oleg finished work
*///:~

class Student extends Thread {

    private String name;
    private Lock lock;

    public Student(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if(lock.tryLock()) {
            try {
                System.out.println(name + " uses an ATM");
                Thread.sleep(2000);
                System.out.println(name + " finished work");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " does not wait");
        }
    }
}