package lock.condition.waitnotifyspecificthread;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-10 22:24
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
