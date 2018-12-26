package sync.lock.in;

/**
 * 测试在父子类继承中也支持可重入锁
 * @author: xianzhixianzhixian
 * @date: 2018-12-17 20:04
 */
public class Main {

    public int i = 10;

    synchronized public void opreateIMainMethod() {
        try {
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
