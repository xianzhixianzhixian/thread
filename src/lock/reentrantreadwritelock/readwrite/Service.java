package lock.reentrantreadwritelock.readwrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ReentrantReadWriteLock读写互斥
 * @author: xianzhixianzhixian
 * @date: 2019-01-23 20:57
 */
public class Service {
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public void read(){
        try {
            try {
                readWriteLock.readLock().lock();
                System.out.println("获得读锁 "+ Thread.currentThread().getName()
                        +" "+System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                readWriteLock.readLock().unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void write(){
        try {
            try {
                readWriteLock.writeLock().lock();
                System.out.println("获得写锁 "+ Thread.currentThread().getName()
                        +" "+System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                readWriteLock.writeLock().unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
