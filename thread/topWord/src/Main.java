import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       MyWorker worker = new MyWorker();
        try {
            worker.readFile(new File("text.txt"));
            TreeSet<Word> topHundred = worker.getTopHundredWordSet();
            int i=0;
            for(Word word:topHundred){
                System.out.println(++i + " " + word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}