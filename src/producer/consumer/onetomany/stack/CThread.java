package producer.consumer.onetomany.stack;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 22:50
 */
public class CThread extends Thread {

    private C c;

    public CThread(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            c.popService();
        }
    }
}
