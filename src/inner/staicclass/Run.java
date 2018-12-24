package inner.staicclass;

/**
 * 内置类和静态内置类的使用
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 19:49
 */
public class Run {

    public static void main(String[] args) {
        //内置类的使用
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("0u");
        publicClass.setPassword("0p");
        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());
        //内置类实例化方法
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("0a");
        privateClass.setAddress("0ad");
        System.out.println(privateClass.getAge()+" "+privateClass.getAddress());

        //静态内置类的使用
        PublicStaticClass publicStaticClass = new PublicStaticClass();
        publicStaticClass.setUsername("0us");
        publicStaticClass.setPassword("0ps");
        System.out.println(publicStaticClass.getUsername()+" "+publicStaticClass.getPassword());
        PublicStaticClass.PrivateStaticClass privateStaticClass = new PublicStaticClass.PrivateStaticClass();
        privateStaticClass.setAge("0as");
        privateStaticClass.setAddress("0ads");
        System.out.println(privateStaticClass.getAge()+" "+privateStaticClass.getAddress());
    }
}
