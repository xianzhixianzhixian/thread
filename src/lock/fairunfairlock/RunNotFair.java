package lock.fairunfairlock;

/**
 * 非公平锁：一种获取锁的抢占机制，是随机获得锁的，和公平锁不一样的就是先来的不一定线的到锁
 * 线程启动顺序随机，获得锁的顺序也随机，和线程启动顺序无关
 * @author: xianzhixianzhixian
 * @date: 2019-01-15 20:57
 */
public class RunNotFair {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程"+Thread.currentThread().getName()
                            +"运行了");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
