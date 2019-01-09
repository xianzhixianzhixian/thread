package lock.reentrantlock1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock实现同步
 * lock()方法使当前线程持有锁对象，其它线程无法获得当前锁对象
 * unlock()方法使当前线程释放锁对象
 * lock()和unlock()配合使用可以实现同步
 * @author: xianzhixianzhixian
 * @date: 2019-01-09 19:21
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadName="+Thread.currentThread().getName()+(" "+(i+1)));
        }
        lock.unlock();
    }
}
