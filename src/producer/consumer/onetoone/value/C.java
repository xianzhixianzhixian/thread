package producer.consumer.onetoone.value;

/**
 * 一生产者对应一消费者操作值
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
                if (VauleObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get value="+VauleObject.value);
                VauleObject.value = "";
                lock.notify();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
