import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reader implements Runnable {

    private String readerName;

    private static final Random random = new Random();

    private static final int GET_BOOK = 0;
    private static final int OUT_LIBRARY = 1;

    private List<Book> lstBooksLibrary;

    private List<Book> lstBooksByReady = new ArrayList<>();
    private List<Thread> threadsBooksByReady = new ArrayList<>();


    public Reader(String peopleName, List<Book> lstBooksLibrary) {
        this.readerName = peopleName;
        this.lstBooksLibrary = lstBooksLibrary;

        System.out.println("Create new people reader: name = " + peopleName);
    }


    public String getPeopleName() {
        return readerName;
    }


    private int getActionReader(int actionValuesCount) {
        return random.nextInt(actionValuesCount);
    }


    private Book getBookForReady() {
        Book book = null;

        if (lstBooksLibrary.size() > 0) {
            int indexBook = random.nextInt(lstBooksLibrary.size() + 1);

            int i = 0;
            for (Book bookChose : lstBooksLibrary) {
                if (i == indexBook) {
                    book = bookChose;
                    break;
                }

                i++;
            }
        }


        if (book != null && !lstBooksByReady.contains(book)) {
            lstBooksByReady.add(book);
        } else {
            book = null;
        }

        if (book != null)
            System.out.println(this.readerName + " chose the book = " + book.getBookName());

        return book;
    }


    @Override
    public void run() {
        try {
            System.out.println(this.readerName + " came to library");
            int action = -1;

            while (action != OUT_LIBRARY) {
                action = getActionReader(2);

                if (action ==GET_BOOK) {
                    Book book = getBookForReady();

                    if (book != null) {
                        if (book.getLstPeoplesReader().isEmpty()) {
                            book.addToQueueForReady(this);

                            Thread thread = new Thread(book);
                            threadsBooksByReady.add(thread);
                            thread.start();
                        } else {
                            book.addToQueueForReady(this);
                        }
                    }

                    Thread.sleep(random.nextInt(100));

                    continue;
                }

                if (action == OUT_LIBRARY) {
                    int countThreads = threadsBooksByReady.size();

                    while (countThreads > 0) {
                        for (Thread thd : threadsBooksByReady) {
                            if (thd.getState() == Thread.State.TERMINATED) {
                                countThreads --;
                            }

                            Thread.sleep(200);
                        }
                    }

                    System.out.println(this.readerName + " left library");
                    return;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

            System.out.println(e.getMessage());
        }
    }
}
