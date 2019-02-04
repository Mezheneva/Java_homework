import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Application started");

        //параметры запуска
        int booksFreeCount =  4;
        int booksByReadyRoomCount = 2;
        int peoplesCount = 14;

        Library bookLibrary = new Library(booksFreeCount, booksByReadyRoomCount, peoplesCount);

        try {
            bookLibrary.startWorkLibrary();

        }   catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("Application stopped");
    }
}