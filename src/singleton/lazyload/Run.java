package singleton.lazyload;

/**
 * 本例的饿汉模式在多线程中会取出多个不同的实例对象
 * @author: xianzhixianzhixian
 * @date: 2019-02-20 22:45
 */
public class Run {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
