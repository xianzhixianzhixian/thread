package join.simpleuse;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-03 22:25
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            //Thread.sleep(?);
            myThread.join();
            System.out.println("我想当threadTest对象执行完毕后再执行");
            System.out.println("但是上面代码sleep()中的值应该写多少呢？");
            System.out.println("答案是：根本不能确定！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
