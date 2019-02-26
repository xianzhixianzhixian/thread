package simpledateformat.unsafesolve.method0;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat非线程安全的解决办法
 * @author: xianzhixianzhixian
 * @date: 2019-02-26 22:39
 */
public class MyThread extends Thread {
    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = DateTools.parse("yyyy-MM-dd", dateString);
            String newDateString = DateTools.format("yyyy-MM-dd", dateRef);
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName=" + this.getName()
                            + "报错了日期字符串：" + dateString + " 转换成的日期为："
                            + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
