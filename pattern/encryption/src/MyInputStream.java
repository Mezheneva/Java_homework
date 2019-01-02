import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyInputStream extends FilterInputStream {

    private byte[] key;
    private int byteNum = 0;

    protected MyInputStream(InputStream in, byte[] password) {
        super(in);
        this.key = password;
    }

    public int read() throws IOException {
        int inByte = super.read();

        inByte = inByte^key[byteNum++ % key.length];

        return inByte;
    }

    @Override
    public int read(byte[] b) throws IOException {

        int i;
        for (i = 0; i < b.length ; i++) {
            int inByte = read();
            b[i] = (byte)inByte;
        }
        return i;
    }
}
