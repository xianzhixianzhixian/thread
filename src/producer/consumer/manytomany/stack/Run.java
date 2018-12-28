package producer.consumer.manytomany.stack;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 22:51
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);

        PThread[] pThread = new PThread[5];
        CThread[] cThread = new CThread[5];
        for (int i = 0; i < 5; i++) {
            pThread[i] = new PThread(p);
            pThread[i].setName("线程p"+i);
            cThread[i] = new CThread(c);
            cThread[i].setName("线程c"+i);
            pThread[i].start();
            cThread[i].start();
        }
    }
}
