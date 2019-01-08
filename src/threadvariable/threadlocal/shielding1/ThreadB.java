package threadvariable.threadlocal.shielding1;

/**
 * 验证ThreadLocal线程变量的隔离性
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:04
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadB"+(i+1));
                System.out.println("ThreadB get Value="+Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
