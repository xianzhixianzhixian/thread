package thread.synchronize.lockchange;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 21:50
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
