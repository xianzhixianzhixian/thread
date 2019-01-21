package lock.lockinerrupttrylock;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-21 21:38
 */
public class RunTryLock {

    public static void main(String[] args) throws Exception {
        final ServiceTryLock serviceTryLock = new ServiceTryLock();
        Runnable runnable0 = new Runnable() {
            @Override
            public void run() {
                serviceTryLock.waitMethodTryLock();
            }
        };
        Thread threadA = new Thread(runnable0);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable0);
        threadB.setName("B");
        threadB.start();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"调用waitMethodTryLockTime的时间："+System.currentTimeMillis());
                serviceTryLock.waitMethodTryLockTime();
            }
        };
        Thread threadC = new Thread(runnable1);
        threadC.setName("C");
        threadC.start();
        //Thread.sleep(3000);
        Thread threadD = new Thread(runnable1);
        threadD.setName("D");
        threadD.start();
    }
}
