package thread.synchronize.lock;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-13 22:13
 */
public class ThreadC extends Thread {

    private MyObject myObject;

    public ThreadC(MyObject object){
        this.myObject = object;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodC();
    }
}
