//: Daemon thread with methods:
//                              .setDaemon() and .isDaemon()

package Multithreading;

public class Daemon {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread starts");

        UserThread userThread = new UserThread();
        userThread.setName("user_thread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

//        daemonThread.setDaemon(true); // Exception: IllegalThreadStateException

//        userThread.join();
//        daemonThread.join();

        System.out.println("Main thread ends");

    }
}/* Output:
            Main thread starts
            Main thread ends
            user_thread is daemon: false
            daemon_thread is daemon: true
            D:1 D:2 U:A D:3 D:4 D:5 U:B D:6 D:7 D:8 U:C D:9 D:10
                D:11 U:D D:12 D:13 D:14 U:E D:15 D:16 D:17 U:F D:18
                    D:19 D:20 U:G D:21 D:22 D:23 U:H D:24 D:25 D:26 U:I
*///:~

class UserThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for(char i = 'A'; i < 'J'; i++) {
            try {
                sleep(300);
                System.out.print("U:" + i + " ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for(int i = 1; i < 1000; i++) {
            try {
                sleep(100);
                System.out.print("D:" + i + " ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}