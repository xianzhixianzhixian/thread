package threadvariable.threadlocal.shielding1;

/**
 * 验证ThreadLocal线程变量的隔离性
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:07
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main"+(i+1));
                System.out.println("Main get Value="+Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
