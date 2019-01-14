package lock.condition.waitnotifyall;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition唤醒全部处于await状态的线程
 * @author: xianzhixianzhixian
 * @date: 2019-01-10 22:19
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA时间为"+System.currentTimeMillis()
                        + " ThreadName="+Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitA时间为"+System.currentTimeMillis()
                        + " ThreadName="+Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            System.out.println("begin awaitB时间为"+System.currentTimeMillis()
                    + " ThreadName="+Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitB时间为"+System.currentTimeMillis()
                    + " ThreadName="+Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll(){
        try {
            lock.lock();
            System.out.println("signalAll的时间为"+System.currentTimeMillis()
                        + " ThreadName="+Thread.currentThread().getName());
            condition.signalAll(); //这里signalAll()可以唤醒所有类型处于await状态的线程
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
