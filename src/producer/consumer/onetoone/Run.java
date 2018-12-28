package producer.consumer.onetoone;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-28 21:35
 */
public class Run {

    public static void main(String[] args) {
        Object object = new Object();
        P p = new P(object);
        C c = new C(object);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
