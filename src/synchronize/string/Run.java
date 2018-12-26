package synchronize.string;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 20:35
 */
public class Run {

    public static void main(String[] args) {
        StringTest testStr = new StringTest();
        ThreadA threadA = new ThreadA(testStr);
        threadA.setName("a");
        ThreadB threadB = new ThreadB(testStr);
        threadB.setName("b");
        ThreadC threadC = new ThreadC(testStr);
        threadC.setName("c");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
