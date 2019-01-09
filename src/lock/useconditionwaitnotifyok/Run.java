package lock.useconditionwaitnotifyok;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 20:21
 */
public class Run {
    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start(); //start之后运行run()方法中的内容
        Thread.sleep(3000);
        service.signal(); //signal后线程被唤醒，实现了线程的等待/通知机制
    }
}
