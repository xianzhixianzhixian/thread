package lock.condition.producercustomer.manytomany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用await()和signalAll()实现多生产者多消费者交替打印
 * while(){}循环中的字符串可能连续打印多次原因是：signalAll()唤醒的有可能是同类线程，如果使用多个condition则不会出现这种情况了
 * @author: xianzhixianzhixian
 * @date: 2019-01-14 20:34
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition0 = lock.newCondition(); //生产者condition
    private Condition condition1 = lock.newCondition(); //消费者condition
    private Boolean hasValue = false;
    public void set(){
        try {
            lock.lock();
            while (hasValue){ //这里一定要用while
                //System.out.println(Thread.currentThread().getName()+"生产者等待设置值有可能连续打印多次");
                condition0.await();
            }
            System.out.println(Thread.currentThread().getName()+"设置值");
            hasValue = true;
            condition0.signalAll(); //这里一定要用signalALL()，避免出现多生产者/多消费者的假死情况
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get(){
        try {
            lock.lock();
            while (!hasValue){ //这里一定要用while
                //System.out.println(Thread.currentThread().getName()+"消费者等待设置值有可能连续打印多次");
                condition0.await();
            }
            System.out.println(Thread.currentThread().getName()+"获取值");
            hasValue = false;
            condition0.signal(); //这里一定要用signalALL()，避免出现多生产者/多消费者的假死情况
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
