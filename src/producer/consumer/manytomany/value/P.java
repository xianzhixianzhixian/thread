package producer.consumer.manytomany.value;

/**
 * 多生产者对应多消费者操作值
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
                //if (!VauleObject.value.equals("")){ //这里一定不能用if
                while (!VauleObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println(Thread.currentThread().getName()+" set的值是"+value);
                VauleObject.value = value;
                lock.notifyAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
