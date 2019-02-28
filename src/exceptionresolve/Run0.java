package exceptionresolve;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-02-28 22:28
 */
public class Run0 {
    public static void main(String[] args) {
        MyThread t0 = new MyThread();
        t0.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程："+t.getName()+"出现了异常：");
                e.printStackTrace();
            }
        });
        t0.start();
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.start();
    }
}
