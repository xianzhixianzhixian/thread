package pipstream.inputoutput;

import java.io.PipedInputStream;

/**
 * 使用PipedInputStream和PipedOutputStream实现线程间通信
 * @author: xianzhixianzhixian
 * @date: 2019-01-02 19:39
 */
public class ReadData {

    public void readMethod(PipedInputStream input){
        try {
            System.out.println("read：");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray);
            while (readLength != -1){
                String newData = new String(byteArray, 0, readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
