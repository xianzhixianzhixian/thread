package threadvariable.threadlocal.shielding2;

import java.util.Date;

/**
 * 验证ThreadLocal线程变量的隔离性
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:12
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.t1.get() == null){
                    Tools.t1.set(new Date());
                }
                System.out.println("A "+Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
