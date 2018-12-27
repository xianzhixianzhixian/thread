package wait.lockchange;

/**
 * 在使用wait/notify时，wait等待的条件发生变化的情况，并不是wait等待的锁发生变化的情况
 * 这里指的是if和while中的条件
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 20:46
 */
public class Subtract {

    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract(){
        try {
            synchronized (lock) {
                if (ValueObject.list.size() == 0) {
                    System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName="+Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size="+ValueObject.list.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void subtractSafe(){
        try {
            synchronized (lock) {
                while (ValueObject.list.size() == 0) {
                    System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName="+Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size="+ValueObject.list.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
