package lock.useconditionwaitnotifyerror;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 19:55
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
