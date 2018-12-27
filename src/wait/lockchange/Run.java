package wait.lockchange;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 20:51
 */
public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        Subtract subtract = new Subtract(lock);
        Add add = new Add(lock);
        ThreadSubtract subtractThread0 = new ThreadSubtract(subtract);
        subtractThread0.setName("subtractThread0");
        subtractThread0.start();
        ThreadSubtract subtractThread1 = new ThreadSubtract(subtract);
        subtractThread1.setName("subtractThread1");
        subtractThread1.start();
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();
    }
}
