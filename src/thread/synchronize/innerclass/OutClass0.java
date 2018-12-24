package thread.synchronize.innerclass;

/**
 * 内置静态类使用不同的对象锁异步第二种情况，内置静态类使用相同对象锁同步的情况
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 20:08
 */
public class OutClass0 {
    static class InnerClass0{
        public void method0(InnerClass1 class1){
            String threadName = Thread.currentThread().getName();
            synchronized (class1){
                System.out.println(threadName+" 进入InnserClass0类中的method0方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i="+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName+" 离开InnserClass0类中的method0方法");
            }
        }

        public synchronized void method1(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" 进入InnserClass0类中的method1方法");
            for (int j = 0; j < 10; j++) {
                System.out.println("j="+j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName+" 离开InnserClass0类中的method1方法");
        }
    }

    static class InnerClass1{
        public synchronized void method0(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" 进入InnserClass1类中的method0方法");
            for (int k = 0; k < 10; k++) {
                System.out.println("k="+k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName+" 离开InnserClass0类中的method0方法");
        }
    }
}
