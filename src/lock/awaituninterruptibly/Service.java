package lock.awaituninterruptibly;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法condition.awaitUninterruptibly()的使用
 * 线程在调用condition.await()后处于await状态，此时调用thread.interrupt()会报错
 * 但是使用condition.awaitUninterruptibly()后，调用thread.interrupt()则不会报错
 * @author: xianzhixianzhixian
 * @date: 2019-01-22 20:49
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void testMethod(){
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.await();
            System.out.println("wait end");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }
    }

    public void testAwaitUnitMethod(){
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.awaitUninterruptibly();
            System.out.println("wait end");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }
    }
}
