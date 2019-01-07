package join.paramlong;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-07 19:01
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join(2000); //两秒钟treadTest还没执行完的话，main线程就不等待threadTest线程执行了
            Thread.sleep(2000);
            System.out.println("end time="+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
