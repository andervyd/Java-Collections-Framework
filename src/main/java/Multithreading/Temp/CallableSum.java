package Multithreading.Temp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableSum {

    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(10);

        List<Future<Long>> list = new ArrayList<>();

        long valueDiv10 = value / 10;

        for(int i = 0; i < 10; i++) {
            long from = valueDiv10 * i + 1;
            long to = valueDiv10 * (i + 1);

            Sum task = new Sum(from, to);

            Future<Long> future = service.submit(task);
            list.add(future);
        }

        for(Future<Long> result : list) {
            sum += result.get();
        }

        service.shutdown();
        System.out.println("Result: " + sum);

    }
}/* Output:
            Sum from 100000001 to 200000000 = 15000000050000000
            Sum from 600000001 to 700000000 = 65000000050000000
            Sum from 1 to 100000000 = 5000000050000000
            Sum from 800000001 to 900000000 = 85000000050000000
            Sum from 300000001 to 400000000 = 35000000050000000
            Sum from 200000001 to 300000000 = 25000000050000000
            Sum from 700000001 to 800000000 = 75000000050000000
            Sum from 400000001 to 500000000 = 45000000050000000
            Sum from 900000001 to 1000000000 = 95000000050000000
            Sum from 500000001 to 600000000 = 55000000050000000
            Result: 500000000500000000
*///:~

class Sum implements Callable<Long> {

    private long from;
    private long to;
    private long localSum;

    public Sum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {

        for(long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from " + from +
                " to " + to + " = " + localSum);

        return localSum;
    }
}