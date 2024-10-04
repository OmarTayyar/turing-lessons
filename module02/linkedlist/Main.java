package module02.linkedlist;


public class Main {
    public static void main(String[] args) {
        MajorLinkedList<Integer> list = new MajorLinkedList<>();
        list.addHead(1);
        list.addHead(2);
        list.addHead(3);
        list.addIndex(5 , 3 );
        System.out.println(list);

    }
}
