class Node {
    public Object data;
    public Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

public class MyList
        implements List, Stack, Queue {

    private Node head;
    private Node tail;

    public MyList() {
        this.head = null;
        this.tail = null;
    }

    void printList() {
        Node t = this.head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println("\n");
    }

    @Override
    public void add(Object obj, int index) {
        Node a = new Node(obj);
        if(this.head == null) {
            this.head = a;
            this.tail = a;
            return;
        }
        if(index == 0){
            a.next = this.head;
            this.head = a;
            return;
        }
        int i = 0;
        Node t = this.head;
        while(t.next != null) {
            if (i == index-1) {
                a.next = t.next;
                t.next = a;
                return;
            }
            t = t.next;
            i++;
        }
        this.tail.next = a;
        this.tail = a;
    }

    @Override
    public void remove(int index) {
        if(this.head == null) {
            return;
        }
        if (index == 0) {
            this.head = this.head.next;
            return;
        }
        int i = 1;
        Node t = this.head;
        while (t.next != null) {
            if (index == i) {
                if(tail == t.next)
                {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            i++;
            t = t.next;
        }
    }

    @Override
    public Object get(int index) {
        Node t = this.head;
        int i = 0;
        while(t.next != null){
            if(i == index){
                return t.data;
            }
            t = t.next;
            i++;
        }
        return null;
    }

    @Override
    public int size() {
        int size = 0;
        if(this.head == null){
            return size;
        }

        Node t = this.head;
        size++;
        while (t.next != null){
            size++;
            t = t.next;
        }
        return size;
    }

    @Override
    public void shift(Object obj) {
        Node a = new Node(obj);

        if(this.head == null) {
            this.head = a;
            this.tail = a;
        }
        else {
            a.next = this.head;
            this.head = a;
        }
    }

    @Override
    public void unshift() {
        if(this.head == null){
            return;
        }
        this.head = this.head.next;
    }

    @Override
    public void push(Object obj) {
        Node a = new Node(obj);

        if (this.tail == null) {
            this.head = a;
            this.tail = a;
        } else {
            this.tail.next = a;
            this.tail = a;
        }
    }

    @Override
    public void pop() {
        if(this.head == null){
            return;
        }
        Node t = this.head;
        while (t.next != tail){
            t =  t.next;
        }
        t.next = null;
        this.tail = t;
    }
}
