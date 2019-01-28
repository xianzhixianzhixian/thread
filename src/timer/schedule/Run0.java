package timer.schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task,Date time)的用法，非守护线程形式
 * @author: xianzhixianzhixian
 * @date: 2019-01-28 21:27
 */
public class Run0 {
    private static Timer timer = new Timer(); //默认为非守护线程形式
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-01-28 21:33:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toLocaleString());
            timer.schedule(task, dateRef); //这里创建的是守护线程，所以执行到该步骤后线程并不会自己停止
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
