package volatile_.synchronize;

/**
 * volatile修饰变量的内存可见性，以及配合synchronized使多个线程同步进行++运算
 * @author: xianzhixianzhixian
 * @date: 2018-12-25 23:51
 */
public class MyThread extends Thread {
    volatile public static int count; //这里要不要volatile关键字线程都是同步的

    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        super.run();
        addCount();
    }
}
