package synchronize.lockchange;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 21:49
 */
public class Run {
    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        //Thread.sleep(50);  //这里注释掉了Thread.sleep(50)方法，a线程和b线程同时调用start()方法
        b.start();
    }
}
