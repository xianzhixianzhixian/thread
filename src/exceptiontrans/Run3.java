package exceptiontrans;

/**
 * 本例要想打印“静态的异常处理”的信息，则必须在public void uncaughtException(Thread t, Throwable e)方法中加上
 * super.uncaughtException(t, e)代码
 * @author: xianzhixianzhixian
 * @date: 2019-02-28 22:47
 */
public class Run3 {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group, "我的线程");
        //对象
        //myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        //类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
