package lock.useconditionwaitnotifyerror;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 19:56
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
