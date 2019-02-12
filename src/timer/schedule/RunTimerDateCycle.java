package timer.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task, Date firstTime, long period)的作用
 * 在指定日期之后，按指定的间隔周期性地无限地执行某一任务
 * @author: xianzhixianzhixian
 * @date: 2019-02-12 22:35
 */
public class RunTimerDateCycle {
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
            String dateString = "2019-02-12 22:45:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："
                        +new Date());
            timer.schedule(task, dateRef, 4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
