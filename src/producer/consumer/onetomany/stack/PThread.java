package producer.consumer.onetomany.stack;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 22:45
 */
public class PThread extends Thread {

    private P p;

    public PThread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            p.pushService();
        }
    }
}
