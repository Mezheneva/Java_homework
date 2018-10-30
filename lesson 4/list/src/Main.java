import java.util.LinkedList;

/**
 * Реализовать однонаправленный (или двусвязный ) список, с методами add() и remove()
 */

public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.add(3);
        list.add(17);
        list.add(2);
        list.add(5);

        list.print();

        list.remove(2);
        list.remove(0);

        list.print();

        list.remove(1);

        list.print();


    }
}
