package wait.interrupt;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 20:25
 */
public class Run {

    public static void main(String[] args) {
        try {
            Object object = new Object();
            ThreadA a = new ThreadA(object);
            a.start();
            Thread.sleep(1000);
            a.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
