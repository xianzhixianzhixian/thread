package threadvariable.threadlocal.shielding2;

import java.util.Date;

/**
 * 验证ThreadLocal线程变量的隔离性
 * @author: xianzhixianzhixian
 * @date: 2019-01-08 20:11
 */
public class Tools {
    public static ThreadLocal<Date> t1 = new ThreadLocal<>();
}
