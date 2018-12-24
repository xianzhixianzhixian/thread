package thread.synchronize.innerclass;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 20:18
 */
public class Run1 {

    public static void main(String[] args) {
        final OutClass0.InnerClass0 in0 = new OutClass0.InnerClass0();
        final OutClass0.InnerClass1 in1 = new OutClass0.InnerClass1();
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                in0.method0(in1);
            }
        }, "T1");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                in0.method1();
            }
        }, "T2");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method0();
            }
        }, "T3");
        t0.start();
        t1.start();
        t2.start();
    }
}
