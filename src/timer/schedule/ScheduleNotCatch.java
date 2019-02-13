package timer.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule方法不具有追赶性
 * 不具有追赶性的意思是上一个任务执行完毕后（不延时），下一个任务的开始时间为上一个任务的开始时间加上period时间
 * 两个时间段之间的任务被取消了
 * @author: xianzhixianzhixian
 * @date: 2019-02-13 22:40
 */
public class ScheduleNotCatch {
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
            timer.schedule(task, dateRef, 5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
