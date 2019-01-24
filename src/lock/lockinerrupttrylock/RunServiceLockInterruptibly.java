package lock.lockinerrupttrylock;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-21 21:22
 */
public class RunServiceLockInterruptibly {
    public static void main(String[] args) throws Exception {
        final ServiceLockInterruptibly serviceLockInterruptibly = new ServiceLockInterruptibly();
        Runnable runnable0 = new Runnable() {
            @Override
            public void run() {
                serviceLockInterruptibly.waitMethodLock();
            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                serviceLockInterruptibly.waitMethodLockInterruptibly();
            }
        };
        Thread threadA = new Thread(runnable0);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable0);
        threadB.setName("B");
        threadB.start();
        /**
         * 此处中断threadB线程，看看结果会怎么样，不会出现异常，使用的是lock.lock()方法。
         * 为什么B线程interrupt之后还能执行lock end B呢，因为仅仅靠thread.interrupt()是无法中断线程的，需要结合抛异常使用
         * 才行，"异常法终止线程运行"。
         */
        threadB.interrupt();
        Thread threadC = new Thread(runnable1);
        threadC.setName("C");
        threadC.start();
        threadC.interrupt(); //此处中断threadC线程，看看结果会怎么样，会出现异常，使用的是lock.lockInterruptibly()方法
        System.out.println("main end");
    }
}
