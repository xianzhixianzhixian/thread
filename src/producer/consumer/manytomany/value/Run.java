package producer.consumer.manytomany.value;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-28 21:35
 */
public class Run {

    public static void main(String[] args) {
        Object object = new Object();
        P p = new P(object);
        C c = new C(object);
        ThreadP[] threadP = new ThreadP[2];
        ThreadC[] threadC = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            threadP[i] = new ThreadP(p);
            threadP[i].setName("生产者"+i);
            threadC[i] = new ThreadC(c);
            threadC[i].setName("消费者"+i);
            threadP[i].start();
            threadC[i].start();
        }
    }
}
