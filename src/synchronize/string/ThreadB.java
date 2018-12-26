package synchronize.string;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 20:30
 */
public class ThreadB extends Thread {

    private StringTest test;

    public ThreadB(StringTest test) {
        this.test = test;
    }

    @Override
    public void run() {
        super.run();
        test.testStringSync("AA");
    }
}
