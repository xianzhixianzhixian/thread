package thread.synchronize.lockchange;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 21:50
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
