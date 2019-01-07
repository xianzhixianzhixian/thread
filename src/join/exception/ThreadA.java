package join.exception;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-07 18:36
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
