package lock.awaituntil;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-22 21:07
 */
public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
