package singleton.lazyloadsafe.dlc;

import java.io.*;

/**
 * 使用序列化与反序列化实现单例模式
 * @author: xianzhixianzhixian
 * @date: 2019-02-22 23:03
 */
public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObjectSerializable myObject = MyObjectSerializable.getInstance();
            FileOutputStream fosRef = new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
            oosRef.writeObject(myObject);
            oosRef.close();
            fosRef.close();
            System.out.println(myObject.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fisRef = new FileInputStream("myObjectFile.txt");
            ObjectInputStream iosRef = new ObjectInputStream(fisRef);
            MyObjectSerializable myObject = (MyObjectSerializable) iosRef.readObject();
            iosRef.close();
            fisRef.close();
            System.out.println(myObject.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
