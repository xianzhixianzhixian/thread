package thread.synchronize.string;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 20:30
 */
public class ThreadA extends Thread {

    private StringTest test;

    public ThreadA(StringTest test) {
        this.test = test;
    }

    @Override
    public void run() {
        super.run();
        test.testStringSync(new String("AA"));
    }
}
