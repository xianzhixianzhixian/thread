package singleton.lazyloadsafe.enumclassperfect;

/**
 * 使用枚举类实现线程安全的单例模式
 * 枚举enum和静态代码块类似，在使用枚举类时，构造方法会被自动调用
 * @author: xianzhixianzhixian
 * @date: 2019-02-26 22:03
 */
public class MyObject {
    public enum MyEnumSingleton {
        connectionFactory;
        private Object object;

        private MyEnumSingleton() {
            try {
                System.out.println("调用了MyObject的构造");
                String url = "jdbc:sqlserver://localhost:1079;databaseName=testdb";
                String username = "root";
                String password = "";
                object = new Object();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public Object getConnection() {
            return object;
        }
    }

    public static Object getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}
