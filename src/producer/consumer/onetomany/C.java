package producer.consumer.onetomany;

/**
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 22:47
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService(){
        System.out.println("pop="+myStack.pop());
    }
}
