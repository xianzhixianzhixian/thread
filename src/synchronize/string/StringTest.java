package synchronize.string;

/**
 * 探究String的常量池特性在多线程中的影响
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 20:32
 */
public class StringTest {

    public void testStringSync(String str){
        synchronized(str){
            try {
                System.out.println("线程"+Thread.currentThread().getName()+"运行开始");
                Thread.sleep(1000);
                System.out.println("线程"+Thread.currentThread().getName()+"运行结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
