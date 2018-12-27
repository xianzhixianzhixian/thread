package wait.interrupt;

/**
 * 当线程处于wait状态时调用interrupt()方法会出现java.lang.InterruptedException异常
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 20:19
 */
public class MyService {

    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("end wait()");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
        }
    }
}
