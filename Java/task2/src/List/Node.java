package List;

class MyList {
    class Node {
        Object number;
        Node next;
        Node previous;
        Node(Object number) {
            this.number = number;
        }
    }
    Node head, tail;
    int size;
    public void addLast(Object number) {
        Node current = new Node(number);
        if (tail == null) {
            tail = current;
            head = current;
            size++;
        } else {
            tail.next = current;
            current.previous = tail;
            tail = current;
            size++;
        }
    }
    public String toString(){
        if(head==null){
            return null;
        }
        Node tmp = head;
        String tmpString = "[" + tmp.number.toString();
        while (tmp != tail){
            tmp = tmp.next;
            tmpString = tmpString.concat(", " + tmp.number.toString());
        };
        tmpString = tmpString.concat("]");

        return tmpString;
    }
}
