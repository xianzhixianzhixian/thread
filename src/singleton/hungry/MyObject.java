package singleton.hungry;

/**
 * 饿汉模式
 * @author: xianzhixianzhixian
 * @date: 2019-02-20 22:38
 */
public class MyObject {
    //立即加载方式==饿汉模式
    private static MyObject myObject = new MyObject();

    public MyObject() {
    }

    public static MyObject getInstance() {
        //此版本代码为立即加载
        //此版本代码的缺点是不能有其它实例变量
        //因为getInstance()方法没有同步
        //所以有可能出现非线程安全问题
        return myObject;
    }
}
