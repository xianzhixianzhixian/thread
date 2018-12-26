package suspend.resume.deallock;

/**
 * 测试suspend和resume的缺点--独占
 * 原因是当前线程主动暂停，也只能由Thread.currentThread().resume()来恢复运行
 * 但是在线程外别的线程没有办法让该线程恢复运行，所以该线程一直处于suspend状态，且占用了object对象的锁，不释放
 * @author: xianzhixianzhixian
 * @date: 2018-12-11 19:35
 */
public class SynchronizedObject {

    /**
     * 方法锁
     * synchronized 方法锁控制对类成员变量的访问：
     * 每个类实例对应一把锁
     * 每个synchronized方法都必须获得调用该方法的类实例的”锁“方能执行，否则所属线程阻塞。
     */
    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
