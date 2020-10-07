//: Interface Callable
//  Interface Future
//      methods: .submit()
//               .get()
//               .isDone()

package Multithreading;

import java.util.concurrent.*;

public class CallableAndFuture {

    static int factorialResult;

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Factorial factorial = new Factorial(12);

        Future<Integer> future = service.submit(factorial);

        try {
            System.out.println("Work future is done? " + future.isDone());

            factorialResult = future.get();

            System.out.println("Work future is done? " + future.isDone());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            service.shutdown();
        }
        System.out.println("Factorial number: " + factorial.getFactorial() + " - " + factorialResult);
            // Output: Work future is done? false
            //         Work future is done? true
            //         Factorial number: 12 - 479001600
    }
}

class Factorial implements Callable<Integer> {

    private int factorial;

    public Factorial(int factorial) {
        this.factorial = factorial;
    }

    public int getFactorial() {
        return factorial;
    }

    @Override
    public Integer call() throws Exception {
        if(factorial <= 0) {
            throw new Exception("You entered an invalid number");
        }
        int result = 1;
        for(int i = 1; i <= factorial; i++) {
            result *= i;
        }
        return result;
    }
}