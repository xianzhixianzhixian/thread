package synchronize.lockchange;

/**
 * 锁对象改变对线程同步性影响的探究
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 21:46
 */
public class MyService {
    private String lock = "123";
    public void testMethod(){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
                lock = "456";
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
