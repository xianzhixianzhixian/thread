package singleton.lazyloadsafe.dlc;

/**
 * 使用静态内置类实现单例模式
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
