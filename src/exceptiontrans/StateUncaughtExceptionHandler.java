package exceptiontrans;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-28 22:43
 */
public class StateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
        e.printStackTrace();
    }
}
