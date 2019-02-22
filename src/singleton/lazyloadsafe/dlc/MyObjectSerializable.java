package singleton.lazyloadsafe.dlc;

import synchronize.lock.MyObject;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 使用序列化与反序列化实现单例模式
 * @author: xianzhixianzhixian
 * @date: 2019-02-22 22:54
 */
public class MyObjectSerializable implements Serializable {

    private static final long serialVersionUID = -7274390665112253146L;

    private static class MyObjectHandler {
        private static MyObjectSerializable myObject = new MyObjectSerializable();
    }
    public static MyObjectSerializable getInstance() {
        return MyObjectHandler.myObject;
    }

    //使用这个方法才能保证在序列化时多线程安全的单例模式
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("用到了readResolve方法！");
        return MyObjectHandler.myObject;
    }
}
