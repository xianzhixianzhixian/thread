package timer.schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 方法schedule(TimerTask task, long delay)方法以当前时间为参考，
 * 在此时间基础上延迟指定时间的毫秒数后执行一次TimerTabke任务
 * @author: xianzhixianzhixian
 * @date: 2019-02-11 21:50
 */
public class RunTimerDelay {
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date().toLocaleString());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间："+new Date().toLocaleString());
        timer.schedule(task, 7000); //以当前时间为参考，7s后置行TimerTask
    }
}
