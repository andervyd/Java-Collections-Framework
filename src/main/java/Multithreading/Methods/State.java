//: Condition thread:
// New => Runnable: (Ready) => Terminated
//                 (Running)

// method .getState()

package Multithreading.Methods;

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Worker shift start ... ");
        System.out.print("Waiting ");
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(800);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nEnd of worker shift");
    }
}

public class State {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start method main ... ");

        Thread thread = new Thread(new Worker());
            System.out.println("Condition: " + thread.getState()); // NEW
        thread.start();
            System.out.println("Condition: " + thread.getState()); // RUNNABLE
        thread.join();
            System.out.println("Condition: " + thread.getState()); // TERMINATED

        System.out.println("End method main.");
    }
}/* Output:
            Start method main ...
            Condition: NEW
            Condition: RUNNABLE
            Worker shift start ...
            Waiting ..........
            End of worker shift
            Condition: TERMINATED
            End method main.
*///:~
