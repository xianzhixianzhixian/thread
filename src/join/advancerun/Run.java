package join.advancerun;

/**
 * 方法join()后面的代码提前运行示例(有时会出现这种情况)
 * 原因是main线程等待2s后就会继续运行了,而a、b线程运行时间超过了2s，所以会导致后面的语句先打印出
 * 这里涉及到join(long)和a、b线程争抢对象锁的问题
 * @author: xianzhixianzhixian
 * @date: 2019-01-07 21:38
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            //b.join(2000);
            System.out.println("main end "+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
