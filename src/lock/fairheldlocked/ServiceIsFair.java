package lock.fairheldlocked;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.concurrent.locks.ReentrantLock;

/**
 * lock.isFair()方法用来判断lock锁是公平锁还是非公平锁
 * @author: xianzhixianzhixian
 * @date: 2019-01-21 20:43
 */
public class ServiceIsFair {
    public ReentrantLock lock;

    public ServiceIsFair(Boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("公平锁情况："+lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
