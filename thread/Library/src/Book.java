import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;


public class Book implements Runnable {

    private String bookName;
    private int timeReady = 2000;
    private boolean byReadyRoom = false;


    private Queue<Reader> lstPeoplesReader = new ConcurrentLinkedQueue<Reader>();


    public Book(String bookName, boolean byReadyRoom, int timeReady) {
        this.bookName = bookName;
        this.byReadyRoom = byReadyRoom;
        this.timeReady = timeReady;

        System.out.println("Create new book: name = " + bookName +
                        ", byReadyRoom = " + byReadyRoom + ", timeReady = " + timeReady);
    }


    public String getBookName() {
        return bookName;
    }

    public Queue<Reader> getLstPeoplesReader() {
        return lstPeoplesReader;
    }

    public boolean isByReadyRoom() {
        return byReadyRoom;
    }


    public void addToQueueForReady(Reader peopleReader) {
        lstPeoplesReader.offer(peopleReader);
    }


    @Override
    public void run() {
        try {
            while (!lstPeoplesReader.isEmpty()) {
                Reader peopleReader = lstPeoplesReader.poll();

                readyBook(new Random().nextInt(this.timeReady), peopleReader.getPeopleName());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    public void readyBook(int timeReady, String peopleName) throws InterruptedException{
        System.out.println(peopleName + ": " + this.bookName + " start is reading...");
        Thread.sleep(timeReady);
        System.out.println(peopleName + ": " + this.bookName + " stop reading...");
    }
}

