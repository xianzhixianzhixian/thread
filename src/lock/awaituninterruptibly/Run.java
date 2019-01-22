package lock.awaituninterruptibly;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-22 20:56
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread0 myThread0 = new MyThread0(service);
            myThread0.start();
            Thread.sleep(3000);
            myThread0.interrupt();

            MyThread1 myThread1 = new MyThread1(service);
            myThread1.start();
            Thread.sleep(3000);
            myThread1.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
