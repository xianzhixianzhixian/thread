package lock.reentrantlock1;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 19:24
 */
public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
