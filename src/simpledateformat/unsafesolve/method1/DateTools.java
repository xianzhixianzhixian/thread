package simpledateformat.unsafesolve.method1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat非线程安全的解决办法
 * 原理就是ThreadLocal可以使线程绑定到指定对象
 * @author: xianzhixianzhixian
 * @date: 2019-02-26 22:53
 */
public class DateTools {
    private static ThreadLocal<SimpleDateFormat> t0 = new ThreadLocal<>();
    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = null;
        sdf = t0.get();
        if (sdf == null){
            sdf = new SimpleDateFormat(datePattern);
            t0.set(sdf);
        }
        return sdf;
    }
}
