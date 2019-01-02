package pipbuffer.inputoutput;

import java.io.PipedReader;

/**
 * 使用PipedReader和PipedWriter实现线程间通信
 * @author: xianzhixianzhixian
 * @date: 2019-01-02 19:39
 */
public class ReadData {

    public void readMethod(PipedReader input){
        try {
            System.out.println("read：");
            char[] charArray = new char[20];
            int readLength = input.read(charArray);
            while (readLength != -1){
                String newData = new String(charArray, 0, readLength);
                System.out.print(newData);
                readLength = input.read(charArray);
            }
            System.out.println();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
