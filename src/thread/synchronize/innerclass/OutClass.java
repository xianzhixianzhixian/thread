package thread.synchronize.innerclass;

/**
 * 内置静态类使用不同的对象锁异步第一种情况
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 20:01
 */
public class OutClass {
    static class Inner{
        public void method1(){
            synchronized ("其它锁"){
                for (int i = 0; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public synchronized void method2(){
            for (int i = 11; i <= 20; i++) {
                System.out.println(Thread.currentThread().getName()+" i="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
