package exceptionresolve;

/**
 * 线程中出现异常的解决办法
 * @author: xianzhixianzhixian
 * @date: 2019-02-28 22:27
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}
