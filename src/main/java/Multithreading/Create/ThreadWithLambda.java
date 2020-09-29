package Multithreading.Create;

public class ThreadWithLambda {
    public static void main(String[] args) {

        new Thread(() -> System.out.println("run... ")).start();
            // Output: run...
    }
}
