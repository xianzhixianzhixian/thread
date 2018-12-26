package as.parameter;

/**
 * @author: xianzhixianzhixian
 * @date: 2018/11/6 7:35 PM
 */
public class Run {

    public static void main(String[] args){
        //图一
        //CountOperate c = new CountOperate();
        //System.out.println("main start t isAlive="+c.isAlive());
        //c.start();
        //System.out.println("main end t isAlive="+c.isAlive());

        //图二
        CountOperate c = new CountOperate();
        Thread t = new Thread(c);
        System.out.println("main start t isAlive="+t.isAlive());
        t.setName("A");
        t.start();
        System.out.println("main end t isAlive="+t.isAlive());
    }
}
