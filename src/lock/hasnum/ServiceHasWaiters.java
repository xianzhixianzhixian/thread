package lock.hasnum;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法lock.hasWaiters(Condition condition)的作用是检测当前是否有线程已调用condition.await()并且处于await状态
 * @author: xianzhixianzhixian
 * @date: 2019-01-16 21:19
 */
public class ServiceHasWaiters {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod(){
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
            System.out.println("有没有线程正在等待condition？"
                        +lock.hasWaiters(condition)+"线程数是多少？"
                        +lock.getWaitQueueLength(condition));
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
