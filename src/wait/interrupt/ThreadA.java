package wait.interrupt;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 20:23
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        MyService service = new MyService();
        service.testMethod(lock);
    }
}
