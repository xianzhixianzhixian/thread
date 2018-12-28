package producer.consumer.manytomany.value;

/**
 * 多生产者对应多消费者操作值
 * @author: xianzhixianzhixian
 * @date: 2018-12-28 21:28
 */
public class C {

    private Object lock;

    public C(Object lock) {
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock) {
                //if (VauleObject.value.equals("")){ //这里一定不能用if
                while (VauleObject.value.equals("")){
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName()+" get value="+ VauleObject.value);
                VauleObject.value = "";
                lock.notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
