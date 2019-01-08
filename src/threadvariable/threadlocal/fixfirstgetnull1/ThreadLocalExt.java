package threadvariable.threadlocal.fixfirstgetnull1;

/**
 * 解决第一次get()返回null的问题
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:18
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值，第一次get不再为null";
    }
}
