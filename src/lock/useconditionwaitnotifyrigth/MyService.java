package lock.useconditionwaitnotifyrigth;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Condition类实现等待/通知正确的用法
 * 在调用condition.await()方法时，线程对象必须调用lock.lock()方法以获得同步监视器
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 19:51
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod(){
        try {
            lock.lock();
            System.out.println("A");
            //线程运行之后如果不被唤醒就一直处于等待状态了
            condition.await();
            System.out.println("B");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("锁释放了！");
        }
    }
}
