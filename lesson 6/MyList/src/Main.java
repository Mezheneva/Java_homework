/**
 * Реализовать односвязный (или двусвязный) список.
 * Класс Связного списка должен реализовать следующие интерфейсы:
 * List и его методы:
 * add(Object obj, int index); - добавляет объект на указанную позицию (index)
 * remove(int index); - удаляет элемент с указанной позиции (index)
 * get(int index); - находит и возвращает элемент по индексу (index)
 * int size(); - возвращает размер списка
 *
 * Stack и его методы:
 * push(Object obj); - добавляет объект в конец списка
 * pop(); - удаляет элемент из конца списка
 *
 * Queue и его методы:
 * shift(Object obj); - добавляет объект в начало списка
 * unshift(); - удаляет элемент из начала списка
 */

public class Main {
    public static void main(String[] args) {

        MyList newList = new MyList();

        System.out.println(newList.size());

        newList.pop();
        newList.unshift();

        newList.push(2);
        newList.shift(6);
        newList.shift(1);
        newList.push(3);

        newList.printList();

        newList.remove(2);
        newList.printList();

        System.out.println(newList.size());

        System.out.println(newList.get(1));

        newList.add(4, 1);

        newList.printList();
    }
}
