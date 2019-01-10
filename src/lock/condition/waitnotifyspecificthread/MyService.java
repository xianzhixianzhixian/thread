package lock.condition.waitnotifyspecificthread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用多个Condition对象唤醒特定的线程
 * @author: xianzhixianzhixian
 * @date: 2019-01-10 22:30
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA时间为"+System.currentTimeMillis()
                    + " ThreadName="+Thread.currentThread().getName());
            conditionA.await();
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
            conditionB.await();
            System.out.println("end awaitB时间为"+System.currentTimeMillis()
                    + " ThreadName="+Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A(){
        try {
            lock.lock();
            System.out.println("signalAll_A时间为"+System.currentTimeMillis()
                        +" ThreadName="+Thread.currentThread().getName());
            conditionA.signalAll(); //这里就只会唤醒A类线程
        } finally {
            lock.unlock();
        }
    }

    public void signal_B(){
        try {
            lock.lock();
            System.out.println("signalAll_B时间为"+System.currentTimeMillis()
                    +" ThreadName="+Thread.currentThread().getName());
            conditionB.signal(); //这里就只会唤醒B线程
        } finally {
            lock.unlock();
        }
    }
}
