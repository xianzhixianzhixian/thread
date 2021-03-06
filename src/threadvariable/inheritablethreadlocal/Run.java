package threadvariable.inheritablethreadlocal;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:50
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main线程中取值="+Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA(); //InheritableThreadLocal类可以让子线程从父类线程中取得值，在这里a是子线程
            a.start();
            Tools.t1.set("Hello world！"); //这里main线程和子线程是同步运行的，main线程在改变值的同时子线程取得的值还是旧值
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
