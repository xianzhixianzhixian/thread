package lock.condition.producercustomer.onetoone;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用await()和signal()实现一生产者一消费者交替打印
 * @author: xianzhixianzhixian
 * @date: 2019-01-14 20:34
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Boolean hasValue = false;
    public void set(){
        try {
            lock.lock();
            while (hasValue){ //这里一定要用while
                condition.await();
            }
            System.out.println("设置值");
            hasValue = true;
            condition.signal(); //这里最好用signalALL()，避免出现多生产者/多消费者的假死情况
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
                condition.await();
            }
            System.out.println("获取值");
            hasValue = false;
            condition.signal(); //这里最好用signalALL()，避免出现多生产者/多消费者的假死情况
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
