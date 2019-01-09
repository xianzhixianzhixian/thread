package lock.useconditionwaitnotifyrigth;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 20:14
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
    }
}
