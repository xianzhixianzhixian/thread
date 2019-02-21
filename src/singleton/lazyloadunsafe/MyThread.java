package singleton.lazyloadunsafe;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-21 23:03
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
