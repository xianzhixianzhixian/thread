package lock.hasnum;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法hasQueueThread(Thread thread)的作用是查询指定的线程是否在等待获取此锁定
 * @author: xianzhixianzhixian
 * @date: 2019-01-16 20:15
 */
public class ServiceHasQueueThread {
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
