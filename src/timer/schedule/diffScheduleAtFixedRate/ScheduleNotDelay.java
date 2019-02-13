package timer.schedule.diffScheduleAtFixedRate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试schedule方法任务不延时
 * 下一次运行开始的时间是以上一个任务开始的时间加上period时间
 * @author: xianzhixianzhixian
 * @date: 2019-02-13 22:09
 */
public class ScheduleNotDelay {
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
            String dateString = "2019-02-13 15:11:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串1时间："+dateRef.toLocaleString()+" 当前时间："
                        +new Date().toLocaleString());
            timer.schedule(task, dateRef, 4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
