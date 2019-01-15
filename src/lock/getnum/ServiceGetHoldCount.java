package lock.getnum;

import java.util.concurrent.locks.ReentrantLock;

/**
 * getHoldCount()的使用示例
 * lock.getHoldCount()作用是查询当前线程保持锁定的个数，也就是调用lock()方法的次数
 *
 * 注意这里保持锁定的意思是，当前正在持有锁的线程的个数
 * @author: xianzhixianzhixian
 * @date: 2019-01-15 21:15
 */
public class ServiceGetHoldCount {
    public ReentrantLock lock = new ReentrantLock();
    public void serviceGetHoldCount1(){
        try {
            lock.lock();
            System.out.println("serviceGetHoldCount1 getHoldCount()="
                    +lock.getHoldCount());
            serviceGetHoldCount2();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void serviceGetHoldCount2(){
        try {
            lock.lock();
            System.out.println("serviceGetHoldCount2 getHoldCount()="
                    +lock.getHoldCount());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
