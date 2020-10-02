//:

package Multithreading.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        new Employee("Ivan", lock);
        new Employee("Svet", lock);
        new Employee("Oleg", lock);
        new Employee("Olga", lock);
        new Employee("Alex", lock);

    }
}/* Output:
            Svet wait...
            Alex wait...
            Oleg wait...
            Olga wait...
            Alex uses an ATM
            Ivan wait...
            Alex finished work
            Olga uses an ATM
            Olga finished work
            Oleg uses an ATM
            Oleg finished work
            Svet uses an ATM
            Svet finished work
            Ivan uses an ATM
            Ivan finished work
*///:~

class Employee extends Thread {

    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " wait...");
            lock.lock();
            System.out.println(name + " uses an ATM");
            Thread.sleep(2000);
            System.out.println(name + " finished work");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}