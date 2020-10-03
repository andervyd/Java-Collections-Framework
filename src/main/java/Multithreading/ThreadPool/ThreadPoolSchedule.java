//: Thread pool with
//      interface ScheduleExecutorService
//         ExecutorService executor = Executors.newScheduleThreadPool(int count);

//          methods: .schedule()
//                   .scheduleAtFixedRate()
//                   .scheduleWithFixedDelay()

package Multithreading.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSchedule {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(8);

        for(int i = 1; i <= 10; i++) {
            service.execute(new GetNameThreadForSchedule());
        }

//        service.schedule(new GetNameThreadForSchedule(),
//                3, TimeUnit.SECONDS);

//        service.scheduleAtFixedRate(new GetNameThreadForSchedule(),
//                3, 1, TimeUnit.SECONDS);

//        service.scheduleWithFixedDelay(new GetNameThreadForSchedule(),
//                3, 1, TimeUnit.SECONDS);

        service.shutdown();
        service.awaitTermination(10000, TimeUnit.SECONDS);

        System.out.println("Main ends");
    }
}/* Output:
            pool-1-thread-3 begins work
            pool-1-thread-4 begins work
            pool-1-thread-5 begins work
            pool-1-thread-6 begins work
            pool-1-thread-7 begins work
            pool-1-thread-2 begins work
            pool-1-thread-8 begins work
            pool-1-thread-1 begins work
            pool-1-thread-6 ends work
            pool-1-thread-2 ends work
            pool-1-thread-2 begins work
            pool-1-thread-7 ends work
            pool-1-thread-7 begins work
            pool-1-thread-4 ends work
            pool-1-thread-5 ends work
            pool-1-thread-1 ends work
            pool-1-thread-3 ends work
            pool-1-thread-8 ends work
            pool-1-thread-2 ends work
            pool-1-thread-7 ends work
            Main ends
*///:~

class GetNameThreadForSchedule implements Runnable {

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
