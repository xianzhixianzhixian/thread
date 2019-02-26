package simpledateformat.unsafe;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat非线程安全
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
            Date dateRef = sdf.parse(dateString);
            String newDateString = sdf.format(dateRef).toString();
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
