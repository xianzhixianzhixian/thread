package synchronize.lock;

/**
 * 验证多个线程调用一个类的同一个实例时synchronized修饰的方法和非synchronized修饰的方法的同步性
 * @author: xianzhixianzhixian
 * @date: 2018-12-13 22:09
 */
public class MyObject {

    synchronized public void methodA(){
        try {
            System.out.println("begin synchronized methodA threadName="+ Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void methodB(){
        try {
            System.out.println("begin asynchronized methodB threadName="+ Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodC(){
        try {
            System.out.println("begin synchronized methodC threadName="+ Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
