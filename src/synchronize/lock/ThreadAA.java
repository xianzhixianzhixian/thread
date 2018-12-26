package synchronize.lock;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-13 22:13
 */
public class ThreadAA extends Thread {

    private MyObject myObject;

    public ThreadAA(MyObject object){
        this.myObject = object;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
