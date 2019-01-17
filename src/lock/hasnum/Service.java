package lock.hasnum;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法lock.hasQueueThread(Thread thread)的作用是查询指定的线程是否在等待获取此锁定，就是当前该线程是否处于未获取锁的状态
 * 方法lock.hasQueueThreads()的作用是检测当前是否有线程在等待获取该锁定
 * @author: xianzhixianzhixian
 * @date: 2019-01-16 20:15
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void lockMethod(){
        try {
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
