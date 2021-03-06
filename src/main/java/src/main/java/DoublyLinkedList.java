package src.main.java;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> extends AbstractSequentialList<T> implements Cloneable {
    private int size = 0;
    private transient Node<T> first;
    private transient Node<T> last;

    public DoublyLinkedList() {
    }

    public String toString(DoublyLinkedList<T> coll) {
        Node<T> current = first;
        String list = "";
        while (current != null) {
            list += current.item  + ",";
            current = current.next;
        }
        return list;
    }

    public String toString(int index) {
        Node newNode = first;
        for (int j = 0; j < index; j++) {
            newNode = first.next;
        }
        return newNode.item.toString();
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        return new ListIterator<>() {

            @Override
            public boolean hasNext() {
                return size > i;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                } else {
                    Node newNode = first;
                    for (int j = 0; j < (i + 1); j++) {
                        newNode = newNode.next;
                    }
                    return (T) newNode;
                }
            }


            @Override
            public boolean hasPrevious() {
                return i > 1;
            }

            @Override
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                } else {
                    Node newNode = first;
                    for (int j = 0; j < (i - 1); j++) {
                        newNode = newNode.next;
                }
                    return (T) newNode;
                }
            }


            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(T element) {
                Node newNode = first;
                for (int j = 0; j < i; j++) {
                    newNode = newNode.next;
                }
                newNode.item = element;
                int a = 0;
            }

            @Override
            public void add(T element) {
                if (i < 0 && i > size) {
                    throw new ArrayIndexOutOfBoundsException();
                } else if (first == null) {
                    Node newNode = new Node(element);
                    first = newNode;
                    last = newNode;
                } else  if (i > 0 && i < size) {
                    Node newNode = new Node(element);
                    Node x = first;
                    for (int j = 0; j < i; j++) {
                        x = x.next;
                    }
                    newNode.next = x.next;
                    newNode.prev = x.prev;
                    x.next = newNode;
                } else if (last.next == null && size != 1) {
                    Node newNode = new Node(element);
                    last.prev = last;
                    newNode.prev = last;
                    last = newNode;
                    newNode.prev.next = newNode;
                } else if (size == 1) {
                    Node newNode = new Node(element);
                    first.next = newNode;
                    newNode.prev = first;
                    last = newNode;
                }
                size++;
            }
        };
    }

    public static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(T item) {
            this.item = item;
            Node next;
            Node prev;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
