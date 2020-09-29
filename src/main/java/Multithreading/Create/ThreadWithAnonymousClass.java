package Multithreading.Create;

public class ThreadWithAnonymousClass {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 10; i++) {
                    System.out.print(i + " ");
                }
            }
        }).start();
            // Output: 0 1 2 3 4 5 6 7 8 9 10
    }
}