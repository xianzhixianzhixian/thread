package lock.awaituntil;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-22 21:07
 */
public class MyThreadA extends Thread {

    private Service service;

    public MyThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
