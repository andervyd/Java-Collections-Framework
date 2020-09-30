//: Thread introduction example

package Multithreading.Methods.Sleep;

public class Introduction {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting...");

        for(int i = 5; i > 0; i--) {

            Thread.sleep(1000); // 1s
            System.out.println(i);
        }

        System.out.println("...ending");

    }
}
