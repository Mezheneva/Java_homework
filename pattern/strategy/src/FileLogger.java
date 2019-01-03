import java.io.*;
import java.util.Scanner;

public class FileLogger implements ILogger{
    @Override
    public void write(String data) {

        System.out.println("Введите имя файла ");
        Scanner in = new Scanner(System.in);
        String fileName = in.next() + ".txt";

        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(new File(fileName)))) {
            out.writeUTF(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
