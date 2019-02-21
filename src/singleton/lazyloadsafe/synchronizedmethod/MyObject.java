package singleton.lazyloadsafe.synchronizedmethod;

/**
 * 演示懒汉模式时多线程会创建多个对象的情况
 * @author: xianzhixianzhixian
 * @date: 2019-02-21 23:00
 */
public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }

    //设置同步方法效率低
    //整个方法被上锁
    synchronized public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                //模拟在创建对象之前做一些准备性工作
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
