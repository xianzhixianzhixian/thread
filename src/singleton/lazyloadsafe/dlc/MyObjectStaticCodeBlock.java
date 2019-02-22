package singleton.lazyloadsafe.dlc;

/**
 * 使用static代码块实现单例模式
 * static代码块在使用类的时候就已经执行了，所以可以使用这个特性实现单例模式
 * @author: xianzhixianzhixian
 * @date: 2019-02-22 23:10
 */
public class MyObjectStaticCodeBlock {
    private static MyObjectStaticCodeBlock myObject =null;

    public MyObjectStaticCodeBlock() {
    }
    static {
        myObject = new MyObjectStaticCodeBlock();
    }

    public static MyObjectStaticCodeBlock getInstance() {
        return myObject;
    }
}
