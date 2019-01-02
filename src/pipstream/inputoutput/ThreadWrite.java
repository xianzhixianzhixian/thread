package pipstream.inputoutput;

import java.io.PipedOutputStream;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-02 19:43
 */
public class ThreadWrite extends Thread {

    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        write.writeMethod(out);
    }
}
