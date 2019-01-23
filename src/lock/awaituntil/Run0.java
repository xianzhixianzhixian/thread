package lock.awaituntil;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-22 21:15
 */
public class Run0 {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
    }
}
