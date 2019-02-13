package timer.schedule.diffScheduleAtFixedRate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试scheduleAtFixedRate不延时
 * 下一个任务的开始时间是上一个任务的结束时间（上一次任务的开始时间加上delay时间，此处delay时间为run()函数中的Thread.sleep()的时间）
 * @author: xianzhixianzhixian
 * @date: 2019-02-13 22:24
 */
public class ScheduleAtFixedRateNotDelay {
    private static Timer timer = new Timer();
    private static int runCount = 0;
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为："+new Date());
                Thread.sleep(1000);
                System.out.println("1 end 运行了！时间为："+new Date());
                runCount++;
                if (runCount == 5) {
                    timer.cancel();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-02-13 22:33:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串1时间："+dateRef.toLocaleString()+" 当前时间："
                    +new Date().toLocaleString());
            timer.scheduleAtFixedRate(task, dateRef, 4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
