package synchronize.innerclass;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 20:05
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        });
        t1.start();
        t2.start();
    }
}
