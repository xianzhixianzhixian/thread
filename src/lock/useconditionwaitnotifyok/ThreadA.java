package lock.useconditionwaitnotifyok;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 20:20
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
