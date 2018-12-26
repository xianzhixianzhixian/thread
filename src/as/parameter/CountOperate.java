package as.parameter;

/**
 * 举例说明线程对象以构造参数的方式传递给Thread对象进行start()启动时的差异
 * @author: xianzhixianzhixian
 * @date: 2018/11/6 7:25 PM
 */
public class CountOperate extends Thread {

    public CountOperate(){
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        //当线程对象以构造参数的方式传递给Thread对象进行start()启动时，注意这里的this和Thread.currentThread()的不同
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("run---end");
    }
}
