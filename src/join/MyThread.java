package join;

/**
 * join()方法的简单使用，join()方法的作用是等待线程对象销毁
 * @author: xianzhixianzhixian
 * @date: 2019-01-03 22:23
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            super.run();
            int secondValue = (int)(Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue); //int可以隐式转换为long，但是反之则不行
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
