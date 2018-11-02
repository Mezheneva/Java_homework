import java.lang.reflect.Array;
import java.util.Arrays;

public class List {
    private Node head;
    private Node tail;
    private int size;

    public List() {
        this.size = 0;
    }

    //добавляет элемент в конец списка
    void add (int data){
        Node node = new Node();
        node.setData(data);

        if (tail == null){
            this.head = node;
            this.tail = node;
        }
        else {
            tail.setNext(node);
            this.tail = node;
        }
        this.size++;
    }

    //удаляет элемент по номеру
    void remove(int num){
        if (head == null || num >= size){
            return;
        }
        if(num == 0){
            this.head = head.getNext();
            this.size--;
            return;
        }

        Node t = new Node();
        int r = 1;
        t = head;
        while(t.getNext() != null){
            if(r == num){
                t.setNext(t.getNext().getNext());
                this.size--;
                return;
            }
            t = t.getNext();
            r++;

        }
    }

    void print(){
        Node t = new Node();
        int [] dataArr = new int [this.size];
        t = head;
        for (int i = 0; i < this.size; i++){
            dataArr[i] = t.getData();
            t = t.getNext();
        }

        System.out.println(Arrays.toString(dataArr));
    }

}
