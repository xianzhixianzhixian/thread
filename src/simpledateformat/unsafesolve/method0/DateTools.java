package simpledateformat.unsafesolve.method0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat非线程安全的解决办法
 * 原理就是创建多个SimpleDateFormat实例
 * @author: xianzhixianzhixian
 * @date: 2019-02-26 22:53
 */
public class DateTools {

    public static Date parse(String formatPattern, String dateString) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }
}
