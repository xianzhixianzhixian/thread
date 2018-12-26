package stop.exception;

/**
 * 通过抛异常法来停止线程
 * @author: xianzhixianzhixian
 * @date: 2018-12-10 21:05
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i=0;i<500000;i++){
                if (this.isInterrupted()){
                    System.out.println("线程已停止，即将退出！");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
        } catch (InterruptedException e) {
            //在此处添加throw即可跳出正在运行的线程
            System.out.println("进入MyThread.java中的异常捕获块了！");
            e.printStackTrace();
        }
    }
}
