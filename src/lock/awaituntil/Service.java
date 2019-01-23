package lock.awaituntil;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法condition.awaitUntil(Date deadline)的使用：
 * condition.awaitUntil(Date deadline)在等待时间之内可以被其它线程唤醒，等待时间一过该线程会自动唤醒，和别的线程争抢锁资源
 * condition.await(long)和condition.awaitUtil(Date deadline)和thread.wait(long)用法一样
 * @author: xianzhixianzhixian
 * @date: 2019-01-22 21:08
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod(){
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("wait begin timer="+System.currentTimeMillis());
            condition.awaitUntil(calendarRef.getTime());
            System.out.println("wait end timer="+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("notify begin timer="+System.currentTimeMillis());
            condition.signalAll();
            System.out.println("notify end timer="+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
