package threadvariable.threadlocal.simpleuse;

/**
 * 类ThreadLocal的使用，ThreadLocal中每个线程只能放一个Object
 * 类ThreadLocal主要解决的就是每个线程绑定自己的值，可以将ThreadLocal比喻为全局存放数据的盒子，盒子中存储每个线程的私有数据
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 19:57
 */
public class Run {
    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        try {
            if (t1.get() == null) {
                System.out.println("从未放过值");
                t1.set("我的值");
            }
            System.out.println(t1.get());
            System.out.println(t1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
