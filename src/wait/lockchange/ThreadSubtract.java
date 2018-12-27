package wait.lockchange;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 20:49
 */
public class ThreadSubtract extends Thread {

    private Subtract r;

    public ThreadSubtract(Subtract r) {
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        //r.subtract(); 不在subtract()方法中加while循环这里会出现问题
        r.subtractSafe();
    }
}
