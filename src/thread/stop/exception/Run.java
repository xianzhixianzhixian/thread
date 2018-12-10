package thread.stop.exception;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-10 21:10
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end！");
    }
}
