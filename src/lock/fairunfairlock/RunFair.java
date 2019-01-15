package lock.fairunfairlock;

/**
 * 公平锁：线程获取锁的顺序是按照线程加锁的顺序来分配的，即先来先得的FIFO先进先出顺序
 * 线程启动顺序随机，获得锁的顺序按照启动顺序来，先启动的先获得锁
 * @author: xianzhixianzhixian
 * @date: 2019-01-15 20:51
 */
public class RunFair {
    public static void main(String[] args) throws Exception {
        final Service service = new Service(true);
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
