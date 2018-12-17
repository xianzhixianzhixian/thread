package thread.sync.lock.in;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-17 20:07
 */
public class Sub extends Main {

    synchronized public void opreateISubMethod() {
        try {
            while (i>0){
                i--;
                System.out.println("sub print i="+i);
                Thread.sleep(100);
                this.opreateIMainMethod();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
