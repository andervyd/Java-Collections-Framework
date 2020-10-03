//: Interruption thread example
//       method .interrupt() and isInterrupted()

package Multithreading.Interruption;

public class Introduction {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main starts");

        InterruptionThread interruption = new InterruptionThread();
        interruption.start();
        Thread.sleep(2000);

        // Old version:
//        interruption.stop();

        // New version
        interruption.interrupt();                // .interrupt()

        interruption.join();
        System.out.println("Main ends");
    }
}

class InterruptionThread extends Thread {
    private double sqrtSum = 0;

    public void run() {
        for(int i = 1; i <= 1000000000; i++) {
            if(isInterrupted()) {                // .isInterrupted()
                System.out.println("Want to interrupt the flow");
                System.out.println("The stream is interrupted");
                return;
            }
            sqrtSum += Math.sqrt(i);
        }
        System.out.println("Sum: " + sqrtSum);
    }
}