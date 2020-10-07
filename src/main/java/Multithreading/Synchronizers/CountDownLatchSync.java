//: Synchronizer CountDownLatch
//       method: .await()
//               .countDown()
//               .getCount()

package Multithreading.Synchronizers;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchSync {

    static CountDownLatch latch = new CountDownLatch(3);

    private static void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        latch.countDown();                                                // count -1
        System.out.println("Count: " + latch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");
        latch.countDown();                                                // count -1
        System.out.println("Count: " + latch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        latch.countDown();                                                // count -1
        System.out.println("Count: " + latch.getCount());
    }

    public static void main(String[] args) {


        new Friend("John", latch);
        new Friend("Mike", latch);
        new Friend("Lee",  latch);
        new Friend("Joan", latch);
        new Friend("Lari", latch);

        try {
            marketStaffOnPlace();
            everythingIsReady();
            openMarket();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}/* Output:
            Market staff came to work
            Count: 2
            Everything is ready, so let's open market
            Count: 1
            Market is opened
            Count: 0
            John started purchasing
            Joan started purchasing
            Lee started purchasing
            Mike started purchasing
            Lari started purchasing
*///:~

class Friend extends Thread {

    private String name;
    private CountDownLatch latch;

    public Friend(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
        this.start();
    }

    public void run() {
        try {
            latch.await();                 // if latch > 0 = wait, else = work
            System.out.println(name + " started purchasing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}