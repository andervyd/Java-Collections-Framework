//: Synchronizer Semaphore
//       method: .acquire()
//               .release()

package Multithreading.Synchronizers;

import java.util.concurrent.Semaphore;

public class SemaphoreSync {
    public static void main(String[] args) {

        Semaphore callBox = new Semaphore(2);

        new Person("John", callBox);
        new Person("Mike", callBox);
        new Person("Lee",  callBox);
        new Person("Joan", callBox);
        new Person("Lari", callBox);

    }
}/* Output:
            Joan is waiting
            Mike is waiting
            Lee is waiting
            Lari is waiting
            John is waiting
            Lee uses phone
            Lari uses phone
            Lee ended the call
            Lari ended the call
            Mike uses phone
            Joan uses phone
            Mike ended the call
            Joan ended the call
            John uses phone
            John ended the call
*///:~

class Person extends Thread {

    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " is waiting");
            callBox.acquire();
            System.out.println(name + " uses phone");
            sleep(2000);
            System.out.println(name + " ended the call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}