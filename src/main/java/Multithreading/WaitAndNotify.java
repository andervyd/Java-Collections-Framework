package Multithreading;

public class WaitAndNotify {
    public static void main(String[] args) {

        Market market = new Market();

        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread threadProduser = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);

        threadProduser.start();
        threadConsumer.start();

    }
}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while(breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("The consumer bought one bread");
        System.out.println("The amount of bread in the store: " + breadCount);

        notify();
    }

    public synchronized void putBread() {
        while(breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("The manufacturer added one bread to the showcase");
        System.out.println("The amount of bread in the store: " + breadCount);

        notify();
    }
}

class Producer implements Runnable {

    private Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {

    private Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}