package producer.consumer.onetomany.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产者消费者模式栈一生产者多消费者
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 22:39
 */
public class MyStack {
    private List<String> list = new ArrayList<>();

    synchronized public void push(){
        try {
            //if (list.size() == 1){ 这里一定要用while不能用if
            while (list.size() == 1){
                this.wait();
            }
            list.add("anyString="+Math.random());
            //这里由于是一个生产者，所以可以用notify()函数，因为只会唤醒消费者线程
            //如果是多消费者，则应使用notifyAll()函数，因为notify()函数可能会唤醒同类生产者线程造成假死
            this.notifyAll();
            System.out.println(" push="+list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String returnValue = "";
        try {
            //if (list.size() == 0){ 这里一定要用while不能用if
            while (list.size() == 0){
                System.out.println("pop操作中的："+Thread.currentThread().getName()+" 线程呈wait状态");
                this.wait();
            }
            System.out.println("pop操作中的："+Thread.currentThread().getName()+" "+System.nanoTime()+" 正在pop");
            returnValue += list.get(0);
            list.remove(0);
            //这里是多生产者，应使用notifyAll()函数，因为notify()函数可能会唤醒同类消费者线程造成假死
            this.notifyAll();
            System.out.println("pop="+list.size());
            System.out.println("pop操作中的："+Thread.currentThread().getName()+" "+System.nanoTime()+" 完成pop");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
