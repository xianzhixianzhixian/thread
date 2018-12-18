package thread.synchronize.static_;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 19:41
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printB();
    }
}
