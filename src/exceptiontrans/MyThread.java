package exceptiontrans;

/**
 * 异常在线程之间的传递
 * @author: xianzhixianzhixian
 * @date: 2019-02-28 22:38
 */
public class MyThread extends Thread {
    private String num = "a";

    public MyThread() {
        super();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("在线程中打印："+ (numInt+1));
    }
}
