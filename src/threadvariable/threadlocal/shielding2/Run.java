package threadvariable.threadlocal.shielding2;

/**
 * 验证ThreadLocal线程变量的隔离性
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:15
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
