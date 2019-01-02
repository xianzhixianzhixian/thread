package pipbuffer.inputoutput;

import pipbuffer.inputoutput.ReadData;

import java.io.PipedReader;

/**
 * 使用PipedReader和PipedWriter实现线程间通信
 * @author: xianzhixianzhixian
 * @date: 2019-01-02 19:45
 */
public class ThreadRead extends Thread {

    private ReadData read;
    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        super.run();
        read.readMethod(input);
    }
}
