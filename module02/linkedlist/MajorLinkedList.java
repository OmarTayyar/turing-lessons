package module02.linkedlist;

public class MajorLinkedList<T> implements LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MajorLinkedList() {
        this.head = null;
        this.size = 0;
        this.tail = null;
    }

    @Override

    public void addHead(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(T element) {
        if (head == null) return;
        if (head.data.equals(element)) {
            head = head.next;
            size--;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(element)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }


    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public T getHead(int index) {
        if (head == null) return null;
        Node<T> current = head;
        return current.data;
    }

    @Override
    public void addTail(T element) {
        if (tail == null) {
            tail = new Node<>(element);
        }
    }

    @Override
    public void addIndex(T element, int index) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T getTail() {
        if (tail == null) return null;
        else return tail.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void delete(int index) {
        if (head == null) return;
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(index)) {
                remove(current.data);
            }

        }
    }

    @Override
    public void delete(T element) {
        if (head == null) return;
        Node<T> current = head;
        while (current.data.equals(element)) {
            remove(current.data);
        }
    }

    public String toString() {
        StringBuilder write = new StringBuilder();
        Node curent = head;
        write.append("[");
        while (curent != null) {
            write.append(curent.data);
            if (curent.next != null) {
                write.append(",");
            }
            curent = curent.next;
        }
        write.append("]");
        return write.toString();
    }
}
