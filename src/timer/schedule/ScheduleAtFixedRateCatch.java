package timer.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * scheduleAtFixedRate具有追赶性
 * 具有追赶性的意思是上一个任务执行完毕后（不延时），下一个任务的开始时间为上一个任务的结束时间
 * 两个时间段之间的任务被补充执行了
 * @author: xianzhixianzhixian
 * @date: 2019-02-13 22:36
 */
public class ScheduleAtFixedRateCatch {
    private static Timer timer = new Timer();
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("1 begin 运行了！时间为："+new Date());
            System.out.println("1 end 运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-02-13 22:44:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串1时间："+dateString+" 当前时间："
                    +new Date().toLocaleString());
            timer.scheduleAtFixedRate(task, dateRef, 5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
