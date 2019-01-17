package lock.hasnum;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-16 20:37
 */
public class Run {
    public static void main(String[] args) throws Exception {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.lockMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());



        final ServiceHasWaiters serviceHasWaiters = new ServiceHasWaiters();
        Runnable runnableHasWaiters = new Runnable() {
            @Override
            public void run() {
                serviceHasWaiters.waitMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnableHasWaiters);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
            serviceHasWaiters.notifyMethod();
        }
        Thread.sleep(2000);
        serviceHasWaiters.notifyMethod();
    }
}
