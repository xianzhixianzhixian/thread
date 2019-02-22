package singleton.lazyloadsafe.dlc;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-22 22:39
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObjectVolatile.getInstance().hashCode());
    }
}
