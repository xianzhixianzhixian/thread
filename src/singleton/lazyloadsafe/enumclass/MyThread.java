package singleton.lazyloadsafe.enumclass;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-26 22:10
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.connectionFactory.getConnection().hashCode());
        }
    }
}
