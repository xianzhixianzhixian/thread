package producer.consumer.onetomany;

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
            if (list.size() == 1){
                this.wait();
            }
            list.add("anyString="+Math.random());
            this.notify();
            System.out.println(" push="+list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String returnValue = "";
        try {
            if (list.size() == 0){
                System.out.println("pop操作中的："+Thread.currentThread().getName()+" 线程呈wait状态");
                this.wait();
            }
            System.out.println("pop操作中的："+Thread.currentThread().getName()+" "+System.nanoTime()+" 正在pop");
            returnValue += list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop="+list.size());
            System.out.println("pop操作中的："+Thread.currentThread().getName()+" "+System.nanoTime()+" 完成pop");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
