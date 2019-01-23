package lock.reentrantreadwritelock.readread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ReentrantReadWriteLock类中读读共享
 * @author: xianzhixianzhixian
 * @date: 2019-01-23 20:45
 */
public class Service {
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public void read(){
        try {
            try {
                readWriteLock.readLock().lock();
                System.out.println("获得读锁 "+Thread.currentThread().getName()
                            +" "+System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                readWriteLock.readLock().unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
