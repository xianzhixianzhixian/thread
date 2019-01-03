package pipstream.inputoutput;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-02 19:46
 */
public class Run {

    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

            inputStream.connect(outputStream);
            //outputStream.connect(inputStream);

            /**
             * 在代码中首先启动的是threadRead，由于当时没有数据被写入，所以线程阻塞在
             * int readLength=input.read(byteArray);直到有数据写入后，才继续向下运行。
             */
            ThreadRead threadRead = new ThreadRead(readData, inputStream);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
