package wait.lockchange;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 20:49
 */
public class ThreadAdd extends Thread {

    private Add p;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        p.add();
    }
}
