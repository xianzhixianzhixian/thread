package join.exception;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-07 18:37
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join(); //线程B要等待线程A执行完成后才会继续执行
            System.out.println("线程B在run end处打印了");
        } catch (Exception e) {
            System.out.println("线程B在catch处打印了");
            e.printStackTrace();
        }
    }
}
