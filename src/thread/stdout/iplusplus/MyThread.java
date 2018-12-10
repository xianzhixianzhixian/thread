package thread.stdout.iplusplus;

/**
 * 测试System.out.println(i++)出现非线程安全问题
 * @author: xianzhixianzhixian
 * @date: 2018-12-10 21:48
 */
public class MyThread extends Thread {
    private int i = 5;
    @Override
    public void run() {
        super.run();
        System.out.println("i="+(i++)+" threadName="+Thread.currentThread().getName());
    }
}