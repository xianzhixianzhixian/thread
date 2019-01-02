package pipstream.inputoutput;

import java.io.PipedInputStream;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-02 19:45
 */
public class ThreadRead extends Thread {

    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        super.run();
        read.readMethod(input);
    }
}
