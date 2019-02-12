package timer.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer类中的cancel()方法有时不一定会停止执行计划任务，而是正常执行
 * 原因是Timer的cancel()方法有时并没有争抢到queue锁，所以TimerTask中的任务继续正常执行
 * @author: xianzhixianzhixian
 * @date: 2019-02-12 22:03
 */
public class TimerCancelDisabled {
    static int i = 0;
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("正常执行了"+i);
        }
    }

    public static void main(String[] args) {
        while (true) {
            try {
                i++;
                Timer timer = new Timer();
                MyTask task = new MyTask();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateString = "2019-02-12 22:10:00";
                Date dateRef = sdf.parse(dateString);
                timer.schedule(task, dateRef);
                timer.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
