package lock.condition.producercustomer.manytomany;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-14 20:43
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA[] a = new ThreadA[10];
        ThreadB[] b = new ThreadB[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new ThreadA(myService);
            a[i].start();
            b[i] = new ThreadB(myService);
            b[i].start();
        }
    }
}
