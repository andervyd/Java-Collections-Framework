//: Thread: implements RunnableExample example
//
//: Create thread:
//         class SomeClass implements Runnable {
//              public void run() {
//                  some code ... } }
//     Run thread:
//         Thread thread = new Thread(new SomeClass());
//         thread.start();

package Multithreading.Create;

class NewThread1 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            if(i % 10 == 0) {
                System.out.println();
            } else System.out.print("  t1:" + i);
        }
    }
}

class NewThread2 implements Runnable {

    @Override
    public void run() {
        for(int i = 100; i >= 0; i--) {
            if(i % 10 == 0) {
                System.out.println();
            } else System.out.print("  t2:" + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        Thread t1 = new Thread(new NewThread1());
        Thread t2 = new Thread(new NewThread2());

        t1.start();
        t2.start();

    }
}/* Output:
            t2:99  t1:1  t1:2  t1:3  t1:4  t1:5  t1:6  t1:7  t1:8  t1:9
              t1:11  t1:12  t1:13  t1:14  t1:15  t1:16  t1:17  t1:18  t1:19
              t1:21  t1:22  t1:23  t1:24  t1:25  t1:26  t1:27  t1:28  t1:29
              t1:31  t1:32  t1:33  t1:34  t1:35  t1:36  t2:98  t2:97  t2:96  t2:95  t2:94  t2:93  t2:92  t2:91
              t2:89  t2:88  t2:87  t2:86  t2:85  t2:84  t2:83  t2:82  t2:81
              t2:79  t2:78  t2:77  t2:76  t2:75  t2:74  t2:73  t2:72  t2:71
              t2:69  t2:68  t2:67  t2:66  t2:65  t2:64  t2:63  t2:62  t1:37  t1:38  t1:39
              t2:61
              t1:41  t1:42  t1:43  t1:44  t1:45  t1:46  t1:47  t1:48  t1:49
              t1:51  t1:52  t1:53  t1:54  t1:55  t1:56  t1:57  t1:58  t1:59
              t1:61  t1:62  t1:63  t1:64  t1:65  t1:66  t1:67  t1:68  t1:69
              t1:71  t1:72  t1:73  t1:74  t1:75  t1:76  t1:77  t1:78  t1:79
              t1:81  t1:82  t1:83  t1:84  t1:85  t1:86  t1:87  t1:88  t1:89
              t1:91  t1:92  t2:59  t1:93  t1:94  t1:95  t1:96  t1:97  t1:98  t2:58  t1:99
              t2:57  t2:56  t2:55  t2:54  t2:53  t2:52  t2:51
              t2:49  t2:48  t2:47  t2:46  t2:45  t2:44  t2:43  t2:42  t2:41
              t2:39  t2:38  t2:37  t2:36  t2:35  t2:34  t2:33  t2:32  t2:31
              t2:29  t2:28  t2:27  t2:26  t2:25  t2:24  t2:23  t2:22  t2:21
              t2:19  t2:18  t2:17  t2:16  t2:15  t2:14  t2:13  t2:12  t2:11
              t2:9  t2:8  t2:7  t2:6  t2:5  t2:4  t2:3  t2:2  t2:1
*///:~
