package lock.fairheldlocked;

import java.util.concurrent.locks.ReentrantLock;

/**
 * lock.isLocked()的作用是查询此锁定是否由任意线程保持
 * @author: xianzhixianzhixian
 * @date: 2019-01-21 20:54
 */
public class ServiceIsLocked {
    private ReentrantLock lock;

    public ServiceIsLocked(Boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println("lock.isLocked() "+lock.isLocked());
            lock.lock();
            System.out.println("lock.isLocked() "+lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}
