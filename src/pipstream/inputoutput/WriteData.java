package pipstream.inputoutput;

import java.io.PipedOutputStream;

/**
 * 使用PipedInputStream和PipedOutputStream实现线程间通信
 * @author: xianzhixianzhixian
 * @date: 2019-01-02 19:36
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out){
        try {
            System.out.println("write：");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
