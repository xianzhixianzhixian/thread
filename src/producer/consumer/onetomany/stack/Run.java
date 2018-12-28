package producer.consumer.onetomany.stack;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 22:51
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c0 = new C(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);

        PThread pThread = new PThread(p);
        pThread.start();
        CThread cThread0 = new CThread(c0);
        CThread cThread1 = new CThread(c1);
        CThread cThread2 = new CThread(c2);
        CThread cThread3 = new CThread(c3);
        CThread cThread4 = new CThread(c4);
        cThread0.start();
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
    }
}
