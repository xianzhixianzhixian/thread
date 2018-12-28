package producer.consumer.onetomany;

/**
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
