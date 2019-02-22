package singleton.lazyloadsafe.dlc;

/**
 * 使用volatile和DLC双检查锁机制来实现单例
 * @author: xianzhixianzhixian
 * @date: 2019-02-22 22:07
 */
public class MyObjectVolatile {
    private volatile static MyObjectVolatile myObject;

    public MyObjectVolatile() {
    }

    //使用双检测机制来解决问题，既保证了不需要同步代码块的异步执行性
    //又保证了单例效果
    public static MyObjectVolatile getInstance() {
        try {
            if (myObject != null) {
            } else {
                //模拟在创建对象之前做的一些准备性工作
                Thread.sleep(3000);
                synchronized (MyObjectVolatile.class) {
                    if (myObject == null) {
                        myObject = new MyObjectVolatile();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
        //此版本的代码称为双重检查Double-Check Locking
    }
}

/**
这样的双重检查锁是错的
if (myObject == null) { A
    synchronized(myObject.class) {
        if(myObject == null) {
            myObject = new MyObject(); //这行可能会出问题 B
        }
    }
}
**/