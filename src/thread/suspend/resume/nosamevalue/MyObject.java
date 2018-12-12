package thread.suspend.resume.nosamevalue;

/**
 * 检验suspend和resume使用不同步的例子
 * thread1线程设置username的值后暂停，但是thread2读取了此过程中的值，导致读取只赋值到一半的值，出现不同步问题
 * @author: xianzhixianzhixian
 * @date: 2018-12-12 20:17
 */
public class MyObject {

    private String username = "0";
    private String password = "2";

    public void setValue(String u, String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("暂停a线程！");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public  void  printUsernamePassword(){
        System.out.println(username+" "+password);
    }
}
