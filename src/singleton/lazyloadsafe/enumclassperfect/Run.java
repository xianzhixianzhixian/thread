package singleton.lazyloadsafe.enumclassperfect;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-26 22:10
 */
public class Run {
    public static void main(String[] args) {
        MyThread t0 = new MyThread();
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t0.start();
        t1.start();
        t2.start();
    }
}
