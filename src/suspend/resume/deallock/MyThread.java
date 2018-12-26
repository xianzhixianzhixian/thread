package suspend.resume.deallock;

/**
 * suspend()和System.out.println()导致的独占问题
 * @author: xianzhixianzhixian
 * @date: 2018-12-11 20:12
 */
public class MyThread extends Thread {

    /**
     * 原因：
     * 每当调用System.out.println()方法时，该方法会获得this也就是PrintStream对象的锁(System.out)
     * 在本例中run()方法中含有System.out.println()方法
     * 当调用suspend()方法时该线程暂停并且未释放PrintStream对象锁
     * 导致main线程无法获得PrintStream对象锁，一直无法输出"main"字符串
     */
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
