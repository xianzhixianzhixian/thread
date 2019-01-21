package lock.lockinerrupttrylock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock.tryLock()和lock.tryLock(Long timeout,TimeUnit unit)的作用
 * lock.tryLock()的作用是：仅在调用时锁定未被另一个线程保持的情况下，才获取该锁定，否则就不获取。就是说只会去获取未被锁定的线程
 * lock.tryLock(long timeout,TimeUnit unit)的作用是：如果给定线程在等待时间内未被另一个线程保持，且当前线程未被中断，则获取该锁定，否则就不获取。相当于tryLock()加了等待时间
 * @author: xianzhixianzhixian
 * @date: 2019-01-21 21:10
 */
public class ServiceTryLock {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethodTryLock(){
        try {
            if (lock.tryLock()){
                System.out.println(Thread.currentThread().getName()+"获得锁");
            } else {
                System.out.println(Thread.currentThread().getName()+"没有获得锁");
            }
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }

    public void waitMethodTryLockTime(){
        try {
            if(lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName()+"获得锁的时间："+System.currentTimeMillis());
            } else {
                System.out.println(Thread.currentThread().getName()+"没有获得锁");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
                System.out.println(Thread.currentThread().getName()+"释放锁的时间："+System.currentTimeMillis());
            }
        }
    }
}
