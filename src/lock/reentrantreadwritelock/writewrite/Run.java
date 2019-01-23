package lock.reentrantreadwritelock.writewrite;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-23 20:54
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
