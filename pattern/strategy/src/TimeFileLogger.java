import java.io.*;
import java.util.Scanner;
import java.util.Date;

class TimeFileLogger implements ILogger {
    private Date date = new Date();

    @Override
    public void write(String data) {
        System.out.println("Введите имя файла ");
        Scanner in = new Scanner(System.in);
        String fileName = in.next() + ".txt";

        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(new File(fileName)))) {
            out.writeUTF(data + " " + date.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}