package lock.reentrantreadwritelock.readread;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-23 20:48
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
