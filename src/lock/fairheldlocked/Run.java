package lock.fairheldlocked;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-21 20:59
 */
public class Run {
    public static void main(String[] args) throws Exception {
        final ServiceIsFair serviceIsFair0 = new ServiceIsFair(true);
        final ServiceIsFair serviceIsFair1 = new ServiceIsFair(false);
        Runnable runnable0 = new Runnable() {
            @Override
            public void run() {
                serviceIsFair0.serviceMethod();
            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                serviceIsFair1.serviceMethod();
            }
        };
        Thread thread0 = new Thread(runnable0);
        thread0.start();
        Thread thread1 = new Thread(runnable1);
        thread1.start();



        final ServiceIsHeldByCurrentThread serviceIsHeldByCurrentThread = new ServiceIsHeldByCurrentThread(true);
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                serviceIsHeldByCurrentThread.serviceMethod();
            }
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();



        final ServiceIsLocked serviceIsLocked = new ServiceIsLocked(true);
        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                serviceIsLocked.serviceMethod();
            }
        };
        Thread thread3 = new Thread(runnable3);
        thread3.start();
    }
}
