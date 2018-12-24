package inner.staicclass;

/**
 * 静态内置类
 * @author: xianzhixianzhixian
 * @date: 2018-12-24 19:46
 */
public class PublicStaticClass {

    static private String username;
    static private String password;
    static class PrivateStaticClass{
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        PublicStaticClass.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        PublicStaticClass.password = password;
    }
}
