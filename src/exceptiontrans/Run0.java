package exceptiontrans;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-28 22:43
 */
public class Run0 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //对象
        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        //类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
