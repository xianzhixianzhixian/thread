package thread.synchronize.static_;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 19:41
 */
public class ThreadE extends Thread {

    private Service service;

    public ThreadE(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printE();
    }
}
