package lock.reentrantreadwritelock.writeread;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-23 21:00
 */
public class Run {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service); //写锁
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service); //读锁
        threadB.setName("B");
        threadA.start();
        Thread.sleep(100);
        threadB.start();
    }
}
