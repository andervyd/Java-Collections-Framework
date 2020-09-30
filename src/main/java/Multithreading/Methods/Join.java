//: Thread method .join()

package Multithreading.Methods;

class JoinThread implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class Join {
    public static void main(String[] args) throws InterruptedException {

        // step 1
        System.out.print("Starting... ");

        Thread thread = new Thread(new JoinThread());

        // step 2
        thread.start();
        thread.join();  // main waiting thread

        // step 3
        System.out.print(" ...ending");

    }
}/* Output:
            Starting... 1 2 3 4 5 6 7 8 9 10  ...ending
*///:~
