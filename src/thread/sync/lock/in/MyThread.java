package thread.sync.lock.in;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-17 20:09
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        Sub sub = new Sub();
        sub.opreateISubMethod();
    }
}
