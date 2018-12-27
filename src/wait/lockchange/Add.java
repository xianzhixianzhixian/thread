package wait.lockchange;

/**
 * 在使用wait/notify时，wait等待的条件发生变化的情况，并不是wait等待的锁发生变化的情况
 * 这里指的是if和while中的条件
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 20:44
 */
public class Add {

    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add(){
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll(); //notifyAll()之后，如果lock锁对象未改变，则所有线程都是同步运行的
        }
    }
}
