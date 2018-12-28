package producer.consumer.onetomany.stack;

/**
 * 一生产者对应多消费者操作栈
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 22:46
 */
public class P {

    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
