package pipbuffer.inputoutput;

import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-02 19:46
 */
public class Run {

    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader inputReader = new PipedReader();
            PipedWriter outputReader = new PipedWriter();

            //inputReader.connect(outputReader);
            outputReader.connect(inputReader);

            /**
             * 在代码中首先启动的是threadRead，由于当时没有数据被写入，所以线程阻塞在
             * int readLength=input.read(byteArray);直到有数据写入后，才继续向下运行。
             */
            ThreadRead threadRead = new ThreadRead(readData, inputReader);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, outputReader);
            threadWrite.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
