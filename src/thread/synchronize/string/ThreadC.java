package thread.synchronize.string;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 20:30
 */
public class ThreadC extends Thread {

    private StringTest test;

    public ThreadC(StringTest test) {
        this.test = test;
    }

    @Override
    public void run() {
        super.run();
        test.testStringSync("AA");
    }
}
