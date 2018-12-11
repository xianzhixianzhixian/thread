package thread.suspend.resume.deallock;

/**
 * suspend()和System.out.println()导致的独占问题
 * @author: xianzhixianzhixian
 * @date: 2018-12-11 20:12
 */
public class MyThread extends Thread {

    private long i=0;
    @Override
    public void run() {
        super.run();
        while (true){
            i++;
            System.out.println(i);
        }
    }
}
