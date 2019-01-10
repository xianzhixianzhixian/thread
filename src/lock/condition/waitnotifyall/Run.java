package lock.condition.waitnotifyall;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-10 22:25
 */
public class Run {
    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll();
    }
}
