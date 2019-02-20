package singleton.lazyload;

/**
 * 懒汉模式
 * @author: xianzhixianzhixian
 * @date: 2019-02-20 22:46
 */
public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }

    public static MyObject getInstance() {
        //延迟加载
        if (myObject != null){
        } else {
            myObject = new MyObject();
        }
        return myObject;
    }
}
