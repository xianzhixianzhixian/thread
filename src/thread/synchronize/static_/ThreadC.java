package thread.synchronize.static_;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 19:41
 */
public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printC();
    }
}
