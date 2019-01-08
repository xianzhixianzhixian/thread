package threadvariable.inheritablethreadlocal;

import java.util.Date;

/**
 * InheritableThreadLocal类可以让子线程从父类线程中取得值
 * 子线程在取值时，如果父线程改变了InheritableThreadLocal中的值，子线程依然取到的是旧值
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:39
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+"我在子线程加的~！";
    }
}
