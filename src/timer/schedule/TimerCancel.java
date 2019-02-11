package timer.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer类中的cancel()方法作用是将任务队列中的全部任务清空
 * @author: xianzhixianzhixian
 * @date: 2019-02-11 22:08
 */
public class TimerCancel {
    private static Timer timer = new Timer();
    static public class MyTaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("A运行了！时间为："+new Date());
            timer.cancel();
        }
    }

    static public class MyTaskB extends TimerTask {
        @Override
        public void run() {
            System.out.println("B运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTaskA taskA = new MyTaskA();
            MyTaskB taskB = new MyTaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-02-11 22:05:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："
                    + new Date().toLocaleString());
            timer.schedule(taskA, dateRef, 4000); //taskA被取消了
            timer.schedule(taskB, dateRef, 4000); //taskB未被取消
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
