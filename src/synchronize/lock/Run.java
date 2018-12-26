package synchronize.lock;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-13 22:16
 */
public class Run {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        ThreadAA threadAA = new ThreadAA(object);
        //ThreadB threadB = new ThreadB(object);
        ThreadC threadC = new ThreadC(object);

        threadA.start();
        threadAA.start();
        //threadB.start();
        threadC.start();
    }
}
