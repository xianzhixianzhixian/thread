package singleton.lazyloadunsafe;

/**
 * 演示懒汉模式时多线程会创建多个对象的情况
 * @author: xianzhixianzhixian
 * @date: 2019-02-21 23:00
 */
public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }
    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                //在这里加上和不加上synchronized代码块都是无法实现多线程单例模式的
                synchronized (MyObject.class) {
                    //模拟在创建对象之前做一些准备性工作
                    Thread.sleep(3000);
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
