package producer.consumer.onetoone.value;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-28 21:33
 */
public class ThreadC extends Thread {

    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            c.getValue();
        }
    }
}
