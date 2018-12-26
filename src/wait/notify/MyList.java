package wait.notify;

import java.util.ArrayList;
import java.util.List;

/**
 * wait()和notify()的使用，wait()和notify()只有在线程获得了对象级别的锁之后才可以被使用
 * 即wait()和notify()函数只能在synchronized函数或synchronized代码块中使用
 * @author: xianzhixianzhixian
 * @date: 2018-12-26 23:07
 */
public class MyList {

    private static List<String> list = new ArrayList<>();

    public static void add(){
        list.add("anyString");
    }

    public static int size(){
        return list.size();
    }
}
