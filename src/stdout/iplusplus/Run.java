package stdout.iplusplus;

import stdout.iplusplus.MyThread;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-10 21:10
 */
public class Run {

    public static void main(String[] args) {
        MyThread run = new MyThread();
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);
        Thread thread4 = new Thread(run);
        Thread thread5 = new Thread(run);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
