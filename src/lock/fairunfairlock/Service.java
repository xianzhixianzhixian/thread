package lock.fairunfairlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 公平锁和非公平锁示例
 * @author: xianzhixianzhixian
 * @date: 2019-01-15 20:46
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()
                    +"获得锁定");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
