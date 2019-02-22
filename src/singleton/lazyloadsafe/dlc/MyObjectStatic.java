package singleton.lazyloadsafe.dlc;

/**
 * 使用静态内置类实现单例模式
 * 静态内置类可以达到线程安全问题，但如果遇到序列化对象时，使用默认的方式运行得到的结果还是多例的
 * @author: xianzhixianzhixian
 * @date: 2019-02-22 22:46
 */
public class MyObjectStatic {
    //内部类方式
    private static class MyObjectHandler {
        private static MyObjectStatic myObject = new MyObjectStatic();
    }

    public MyObjectStatic() {
    }

    public static MyObjectStatic getInstance() {
        return MyObjectHandler.myObject;
    }
}
