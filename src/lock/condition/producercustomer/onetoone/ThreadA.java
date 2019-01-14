package lock.condition.producercustomer.onetoone;

/**
 * 用await()和signal()实现一生产者一消费者交替打印
 * @author: xianzhixianzhixian
 * @date: 2019-01-14 20:40
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            myService.set();
        }
    }
}
