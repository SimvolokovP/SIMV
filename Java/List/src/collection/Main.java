package collection;


public class Main {
    public static void main(String[] args) {
        MyLinkedList lst = new MyLinkedList();
        lst.add(0,3);
        System.out.println(lst.getSize());
        lst.add(1,4);
        lst.clear();
        lst.add(0,3);
        System.out.print(lst);
    }
}
