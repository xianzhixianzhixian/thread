package singleton.hungry;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-20 22:42
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
