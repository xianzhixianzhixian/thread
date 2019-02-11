package timer.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask的任务是一个个执行的，下一个TimerTask执行之前必须等待上一个TimerTask执行完毕。
 * 所以有可能某个TimerTask的执行时间比预期时间晚，因为上一个TimerTask执行了很久。
 * @author: xianzhixianzhixian
 * @date: 2019-01-28 22:21
 */
public class RunTimerForcedDelay {
    private static Timer timer = new Timer();
    static public class MyTask0 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("0 begin 运行了！时间为："+new Date().toLocaleString());
                Thread.sleep(20000);
                System.out.println("0 end 运行了！时间为："+new Date().toLocaleString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 start 运行了！时间为："+new Date().toLocaleString());
                System.out.println("1 运行了！时间为："+new Date());
                System.out.println("1 end 运行了！时间为："+new Date().toLocaleString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTask0 task0 = new MyTask0();
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString0 = "2019-01-28 22:33:00";
            String dateString1 = "2019-01-28 22:35:00";
            Date dateRef0 = sdf0.parse(dateString0);
            Date dateRef1 = sdf1.parse(dateString1);
            timer.schedule(task0, dateRef0);
            timer.schedule(task1, dateRef1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
