package collection;

public class MyLinkedList implements MyList {
    private int size;
    Node head;
    Node tail;

    @Override
    public void add(int index, int number){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range!(((");
        }
        if (index == 0)
            this.addFirstElement(number);
        else if (index == this.size - 1 || index == size)
            this.addFirstElement(number);
        else {
            Node prev = head;
            for (int i = 0; i < index; i++)
                prev = prev.next; // shift at index position
            Node next = prev.next;

            Node current = new Node(number);
            current.prev = prev;
            prev.next = current;
            current.next = next;
            next.prev = current;

            size++;
        }
    }
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range!(((");
        }
        if (index == 0)
            this.deleteFirst();
        else if (index == this.size - 1)
            this.deleteLast();
        else {
            Node current = head;
            for (int i = 0; i < index; i++)
                current = current.next; // shift at index position
            Node prev = current.prev;
            Node next = current.next;
            prev.next = next;
            next.prev = prev;
            size--;
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }


    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    private void addFirstElement(int value) {
        Node current = new Node(value);
        if (tail == null) {
            tail = current;
            head = current;
            size ++;
        }
        else {
            tail.next = current;
            current.prev = tail;
            tail = current;
            size ++;
        }
    }
    private void deleteLast() {
        if (tail != null) {
            if (tail.prev == null) {  // if only one node
                tail = head = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }
    }

    private void deleteFirst() {
        if (tail != null) {
            if (head.next == null) { //if only one node
                tail = head = null;
            }
            else {
                head = head.next;
                head.prev = null;
            }
            size --;
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return null;
        }
        Node current = head;
        String str = "[" + current.number;
        while (current != tail) {
            current = current.next;
            str = str.concat(", " + current.number);
        }
        str = str.concat("]");
        return str;
    }
}
