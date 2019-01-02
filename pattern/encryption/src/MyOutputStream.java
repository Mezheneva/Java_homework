import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyOutputStream extends FilterOutputStream {
    private byte[] key;
    private int byteNum = 0;

    protected MyOutputStream(OutputStream out, byte[] password) {
        super (out);
        this.key = password;
    }
    @Override
    public void write(int outByte) throws IOException {
        outByte = outByte ^ key[byteNum++ % key.length];
        super.write (outByte);
    }

    @Override
    public void write(byte[] b) throws IOException {

        for (int i = 0; i < b.length; i++) {
            write(b[i]);
        }
    }

}
