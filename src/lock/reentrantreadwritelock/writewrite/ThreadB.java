package lock.reentrantreadwritelock.writewrite;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-23 20:48
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
