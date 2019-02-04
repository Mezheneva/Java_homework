import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Library {

    private static final int TIME_BY_READY = 2000; // среднее время для чтения книги

    private int booksToHomeCount;
    private int booksToLibraryCount;
    private List<Book> lstBooksLibrary = new ArrayList<>();

    private int readersCount;

    private List<Reader> lstPeoplesReader = new ArrayList<>();
    private List<Thread> threadsPeoplesReader = new ArrayList<>();


    public Library(int booksFreeCount, int booksByReadyRoomCount, int readersCount) {
        this.booksToHomeCount = booksFreeCount;
        System.out.println("Add books by free ready to library...");
        fillBooksLibrary(false, booksFreeCount);


        this.booksToLibraryCount = booksByReadyRoomCount;
        System.out.println("Add books by ready room to library...");
        fillBooksLibrary(true, booksByReadyRoomCount);


        System.out.println("Add peoples readers to library...");
        for (int i = 0; i < readersCount; i++) {
            Reader people = new Reader("People" + i, lstBooksLibrary);
            lstPeoplesReader.add(people);
        }
    }

    // геттеры
    public List<Book> getLstBooksLibrary() {
        return lstBooksLibrary;
    }

    public List<Reader> getLstPeoplesReader() {
        return lstPeoplesReader;
    }


    private void fillBooksLibrary(boolean byReadyRoom, int count) {
        int firstIndex = lstBooksLibrary.size();

        for (int i = firstIndex; i < (firstIndex) + count; i++) {
            Book book = new Book("Book" + i, byReadyRoom, new Random().nextInt(TIME_BY_READY));
            lstBooksLibrary.add(book);
        }
    }


    public void startWorkLibrary() throws InterruptedException {
        for (Reader people : lstPeoplesReader) {
            Thread thread = new Thread(people);
            threadsPeoplesReader.add(thread);
            thread.start();
        }

        int countThreads = threadsPeoplesReader.size();

        while (countThreads > 0) {
            for (Thread thd : threadsPeoplesReader) {
                if (thd.getState() == Thread.State.TERMINATED) {
                    countThreads --;
                }

                Thread.sleep(200);
            }
        }
    }

}
