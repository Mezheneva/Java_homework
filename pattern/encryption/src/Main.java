import java.io.*;

public class Main {
    public static void main(String[] args) {
        byte[] password = {'1','s','3','a'};

        try(InputStream in = new MyInputStream(new FileInputStream(new File("file.txt")), password);
            OutputStream out = new MyOutputStream(new FileOutputStream("file2.txt"), password))
        {
            byte[] buff = new byte[in.available()];

            in.read(buff);
            out.write(buff);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
