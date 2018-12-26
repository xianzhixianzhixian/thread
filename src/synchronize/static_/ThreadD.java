package synchronize.static_;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 19:41
 */
public class ThreadD extends Thread {

    private Service service;

    public ThreadD(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printD();
    }
}
