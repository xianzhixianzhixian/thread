package lock.reentrantlock2;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 19:35
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
