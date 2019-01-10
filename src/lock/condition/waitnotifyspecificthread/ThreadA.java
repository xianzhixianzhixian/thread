package lock.condition.waitnotifyspecificthread;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-10 22:24
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
