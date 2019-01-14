package lock.condition.producercustomer.onetoone;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-14 20:43
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        ThreadB b = new ThreadB(myService);
        b.start();
    }
}
