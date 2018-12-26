package suspend.resume.deallock;

/**
 * 独占的原因是因为PritStream对象的println()方法一直呈暂停状态，并且锁未释放
 * 别的线程无法获得PritStream对象锁导致一直暂停
 * @author: xianzhixianzhixian
 * @date: 2018-12-11 20:13
 */
public class MyThreadRun {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
