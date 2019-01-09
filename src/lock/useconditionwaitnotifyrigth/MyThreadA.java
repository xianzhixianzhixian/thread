package lock.useconditionwaitnotifyrigth;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 20:12
 */
public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService service) {
        this.myService = service;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}
