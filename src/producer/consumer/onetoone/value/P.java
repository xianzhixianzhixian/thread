package producer.consumer.onetoone.value;

/**
 * 一生产者对应一消费者操作值
 * @author: xianzhixianzhixian
 * @date: 2018-12-28 21:23
 */
public class P {

    private Object lock;

    public P(Object lock) {
        this.lock = lock;
    }

    public void setValue(){
        try {
            synchronized (lock){
                if (!VauleObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("set的值是"+value);
                VauleObject.value = value;
                lock.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
