package thread.suspend.resume.nosamevalue;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-12 20:20
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                super.run();
                myObject.setValue("a", "aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                super.run();
                myObject.printUsernamePassword();
            }
        };
        //在thread2.start()之前加入thread1.resume()输出的结果为 a aa
        //thread1.resume();
        thread2.start();
    }
}
