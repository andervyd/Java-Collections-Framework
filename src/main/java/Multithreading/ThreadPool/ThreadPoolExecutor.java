//: Thread pool with
//      interface ExecutorService
//         ExecutorService executor = Executors.newFixedThreadPool(int count);
//         ExecutorService executor = Executors.newSingleThreadPool();

//          methods: .execute()
//                   .shutdown()
//                   .awaitTermination()

package Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);
//         ExecutorService executor = Executors.newSingleThreadPool();

        for(int i = 1; i <= 10; i++) {
            executor.execute(new GetNameThreadForExecutor());
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Main ends");
    }
}/* Output:
            pool-1-thread-1
            pool-1-thread-3
            pool-1-thread-2
            pool-1-thread-4
            pool-1-thread-5
            pool-1-thread-1
            pool-1-thread-2
            pool-1-thread-4
            pool-1-thread-3
            pool-1-thread-5
            Main ends
*///:~

class GetNameThreadForExecutor implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}