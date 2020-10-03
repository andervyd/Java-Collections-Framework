//: Thread pool with
//      interface ExecutorService
//         ExecutorService executor = Executors.newCachedThreadPool();

package Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolCached {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();

        for(int i = 1; i <= 10; i++) {
            service.execute(new GetNameThreadForCached());
        }

        service.shutdown();
        service.awaitTermination(5000, TimeUnit.SECONDS);

        System.out.println("Main ends");
    }
}/* Output:
            pool-1-thread-3 begins work
            pool-1-thread-5 begins work
            pool-1-thread-2 begins work
            pool-1-thread-7 begins work
            pool-1-thread-9 begins work
            pool-1-thread-1 begins work
            pool-1-thread-10 begins work
            pool-1-thread-6 begins work
            pool-1-thread-8 begins work
            pool-1-thread-4 begins work
            pool-1-thread-5 ends work
            pool-1-thread-9 ends work
            pool-1-thread-1 ends work
            pool-1-thread-10 ends work
            pool-1-thread-7 ends work
            pool-1-thread-2 ends work
            pool-1-thread-6 ends work
            pool-1-thread-8 ends work
            pool-1-thread-3 ends work
            pool-1-thread-4 ends work
            Main ends
*///:~

class GetNameThreadForCached implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " begins work");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +
                " ends work");
    }
}