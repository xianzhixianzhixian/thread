package lock.awaituntil;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-22 21:16
 */
public class Run1 {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        Thread.sleep(2000);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }
}
