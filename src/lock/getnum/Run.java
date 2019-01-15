package lock.getnum;

/**
 * getHoldCount()、getQueueLength()和getWaitQueueLength()区别
 * @author: xianzhixianzhixian
 * @date: 2019-01-15 21:20
 */
public class Run {
    public static void main(String[] args) throws Exception {
        ServiceGetHoldCount serviceGetHoldCount = new ServiceGetHoldCount();
        serviceGetHoldCount.serviceGetHoldCount1();



        final ServiceGetQueueLength serviceGetQueueLength = new ServiceGetQueueLength();
        Runnable runnableGetQueueLength = new Runnable() {
            @Override
            public void run() {
                serviceGetQueueLength.serviceGetQueueLength();
            }
        };
        Thread[] threadArrayGetQueueLength = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArrayGetQueueLength[i] = new Thread(runnableGetQueueLength);
        }
        for (int i = 0; i < 10; i++) {
            threadArrayGetQueueLength[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数："+ serviceGetQueueLength.lock.getQueueLength()+"在等待获取锁！");



        final ServiceGetWaitQueueLength serviceGetWaitQueueLength = new ServiceGetWaitQueueLength();
        Runnable runnableGetWaitQueueLength = new Runnable() {
            @Override
            public void run() {
                serviceGetWaitQueueLength.awaitMethod();
            }
        };
        Thread[] threadArrayGetWaitQueueLength = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArrayGetWaitQueueLength[i] = new Thread(runnableGetWaitQueueLength);
        }
        for (int i = 0; i < 10; i++) {
            threadArrayGetWaitQueueLength[i].start();
            //serviceGetWaitQueueLength.notifyMethod();
        }
        Thread.sleep(2000);
        serviceGetWaitQueueLength.notifyMethod(); //只唤醒一个处于await状态的线程
    }
}
