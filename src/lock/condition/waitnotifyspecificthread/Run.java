package lock.condition.waitnotifyspecificthread;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-10 22:28
 */
public class Run {
    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadA aa = new ThreadA(service);
        aa.setName("AA");
        aa.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadB bb = new ThreadB(service);
        bb.setName("BB");
        bb.start();
        Thread.sleep(3000);
        service.signalAll_A(); //只唤醒A类线程
        service.signal_B(); //只能唤醒一个B线程,另一个B线程永远处于await状态
        service.signal_B(); //调用第二次,另一个B线程也被唤醒
    }
}
