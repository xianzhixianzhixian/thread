package pipbuffer.inputoutput;

import java.io.PipedWriter;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-02 19:43
 */
public class ThreadWrite extends Thread {

    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write, PipedWriter out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        write.writeMethod(out);
    }
}
