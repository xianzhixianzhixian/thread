package lock.getnum;

import java.util.concurrent.locks.ReentrantLock;

/**
 * getQueueLength()的使用示例
 * lock.getQueueLength()的作用是返回正在等待获取此锁定的线程的估计数
 * 比如有5个线程，1个线程首先执行await()方法，那么在调用getQueueLength()方法后返回值是4，说明有4个线程同时在等待lock的释放
 * @author: xianzhixianzhixian
 * @date: 2019-01-15 21:24
 */
public class ServiceGetQueueLength {
    public ReentrantLock lock = new ReentrantLock();
    public void serviceGetQueueLength(){
        try {
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()
                        +"进入方法");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
