package lock.reentrantreadwritelock.writewrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ReentrantReadWriteLock类中写写锁互斥
 * @author: xianzhixianzhixian
 * @date: 2019-01-23 20:51
 */
public class Service {
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
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
