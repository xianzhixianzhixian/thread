package join.exception;

/**
 * 在join过程中，如果当前线程对象被中断，则当前线程出现异常。说明join()和interrupt()方法如果彼此遇到，则会出现异常
 * @author: xianzhixianzhixian
 * @date: 2019-01-07 18:41
 */
public class Run {

    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500); //这里等待太久了则b线程会执行完毕，不会出现异常的情况
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
