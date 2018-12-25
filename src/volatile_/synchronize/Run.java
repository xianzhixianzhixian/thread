package volatile_.synchronize;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-25 23:57
 */
public class Run {

    public static void main(String[] args) {
        MyThread[] myThreadArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreadArray[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreadArray[i].start();
        }
    }
}
