package timer.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 多个TimerTask任务及延时的测试
 * Timer中允许有多个TimerTask任务
 * @author: xianzhixianzhixian
 * @date: 2019-01-28 21:59
 */
public class RunManyTimers {
    private static Timer timer = new Timer();
    static public class MyTask0 extends TimerTask {
        @Override
        public void run() {
            System.out.println("0运行了！时间为："+new Date());
        }
    }
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("1运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask0 task0 = new MyTask0();
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString0 = "2019-01-28 22:06:00";
            String dateString1 = "2019-01-28 22:10:00";
            Date dateRef0 = sdf0.parse(dateString0);
            Date dateRef1 = sdf1.parse(dateString1);
            System.out.println("字符串0时间："+dateRef0.toLocaleString()+" 当前时间："+ new Date().toLocaleString());
            System.out.println("字符串1时间："+dateRef1.toLocaleString()+" 当前时间："+new Date().toLocaleString());
            timer.schedule(task0, dateRef0);
            timer.schedule(task1, dateRef1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
