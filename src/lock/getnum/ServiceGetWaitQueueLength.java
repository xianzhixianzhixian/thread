package lock.getnum;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * getWaitQueueLength(Condition condition)的使用示例
 * lock.getWaitQueueLength(Condition condition)方法的作用是返回等待与此锁定相关的给定条件Condition的线程估计数
 * 比如说有5个线程，每个线程都执行了同一个condition对象的await()方法，则调用getWaitQueueLength(Condition condition)
 * 方法的返回值是5
 *
 * 特别注意：这里返回值统计的是调用同一个condtion的await()方法且处于await状态的线程个数
 * @author: xianzhixianzhixian
 * @date: 2019-01-15 21:34
 */
public class ServiceGetWaitQueueLength {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void awaitMethod(){
        try {
            lock.lock();
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("有"+lock.getWaitQueueLength(condition)
                        +"个线程正在等待condition");
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
