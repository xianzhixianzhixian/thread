package singleton.lazyload;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-20 22:48
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
