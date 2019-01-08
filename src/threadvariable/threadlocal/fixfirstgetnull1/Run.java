package threadvariable.threadlocal.fixfirstgetnull1;

/**
 * 解决第一次get()返回null的问题，这里是针对main线程的
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:19
 */
public class Run {
    public static ThreadLocalExt t1 = new ThreadLocalExt();
    public static void main(String[] args) {
        if (t1.get() == null){
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
