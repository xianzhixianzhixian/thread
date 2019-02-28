package exceptiontrans;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-28 22:42
 */
public class ObjectUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("对象的异常处理");
        e.printStackTrace();
    }
}
