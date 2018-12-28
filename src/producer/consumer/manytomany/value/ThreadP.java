package producer.consumer.manytomany.value;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-28 21:33
 */
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            p.setValue();
        }
    }
}
