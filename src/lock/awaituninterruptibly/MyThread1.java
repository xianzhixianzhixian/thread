package lock.awaituninterruptibly;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-22 20:56
 */
public class MyThread1 extends Thread {
    private Service service;

    public MyThread1(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testAwaitUnitMethod();
    }
}
