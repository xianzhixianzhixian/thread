package timer.schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task, long delay, lonmg period)的用法
 * @author: xianzhixianzhixian
 * @date: 2019-02-12 22:15
 */
public class RunTimerCycle {
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间："+new Date().toLocaleString());
        timer.schedule(task, 3000, 5000);
    }
}
