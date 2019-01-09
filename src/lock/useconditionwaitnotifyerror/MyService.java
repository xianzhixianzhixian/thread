package lock.useconditionwaitnotifyerror;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Condition类实现等待/通知错误的用法与解决
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 19:51
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try {
            //这里直接调用condition.await()方法是错误的，在调用该方法时，线程对象必须调用lock.lock()方法以获得同步监视器
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
