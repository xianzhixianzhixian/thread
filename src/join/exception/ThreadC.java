package join.exception;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-07 18:40
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
