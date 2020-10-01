//: Data race

package Multithreading;

public class DataRace {
    public static void main(String[] args) {

        IncreasingValue incValue = new IncreasingValue();

        Thread thread1 = new Thread(incValue);
        Thread thread2 = new Thread(incValue);
        Thread thread3 = new Thread(incValue);

        thread1.start();
        thread2.start();
        thread3.start();

            // Output: 3 4 5 1 2 7 8 6 9
    }
}

class Counter {
    static int count = 0;
}

class IncreasingValue implements Runnable {
    public void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            increment();
        }
    }
}