package threadvariable.threadlocal.fixfirstgetnull2;

import java.util.Date;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:27
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
