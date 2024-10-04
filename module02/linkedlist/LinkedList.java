package module02.linkedlist;

public interface LinkedList<T> {
    void addHead(T element);
    void remove(T element);
    void clear();
    void addTail(T element);
    void addIndex(T element, int index);
    T getHead(int index);
    T getTail();
    int getSize();
    void delete(int index);
    void delete(T element);
    String toString();

}
