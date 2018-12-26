package wait.notify;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-26 23:11
 */
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                super.run();
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5){
                        System.out.println("已发出通知！");
                        lock.notify();
                    }
                    System.out.println("添加了"+(i+1)+"个元素！");
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
