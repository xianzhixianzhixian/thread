package thread.synchronize.static_;

/**
 * 1、Class锁和对象锁是两种不同类型的锁，而synchronized static和synchronized(Class)是对类的所有对象实例起作用的
 * 2、关键字synchronized还可以用在static静态方法上，如果这样写是对当前的*.java文件对应的Class类进行持锁
 * 3、同步synchronized(Class)代码块的作用和sunchronized static方法的作用一样，都是对当前的*.java文件对应的Class类进行持锁，都是Class锁
 * 4、Class锁和对象锁不一样，对象锁是锁定当前对象，Class锁是对类的所有对象实例起作用
 * 5、synchronized(Class)、sunchronized static和synchronized(object)是不同的锁，Class锁锁定的是Class类所有的对象实例，synchronized(object)锁定的是Class的某一个对象
 * 6、当多个线程同时占用Class锁和对象锁时，占有Class锁的线程和占有对象锁的线程是异步运行的
 * @author: xianzhixianzhixian
 * @date: 2018-12-18 19:41
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        Service service1 = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");
        ThreadC threadC = new ThreadC(service1);
        threadC.setName("c");
        ThreadD threadD = new ThreadD(service1);
        threadD.setName("d");
        ThreadE threadE = new ThreadE(service);
        threadE.setName("e");

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
    }
}
