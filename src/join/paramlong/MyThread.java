package join.paramlong;

/**
 * join(long)的用法
 * @author: xianzhixianzhixian
 * @date: 2019-01-07 18:59
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
