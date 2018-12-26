package synchronize.lock;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-13 22:13
 */
public class ThreadA extends Thread {

    private MyObject myObject;

    public ThreadA(MyObject object){
        this.myObject = object;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
