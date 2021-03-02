package src.main.java;

import org.w3c.dom.Node;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> extends AbstractSequentialList<T> implements Cloneable {
    private int size = 0;
    private transient Node<T> first;
    private transient Node<T> last;

    public DoublyLinkedList() {
    }


    @Override
    public ListIterator<T> listIterator(int i) {
        return new ListIterator<T>() {

            @Override
            public boolean hasNext() {
                return size > i;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                } else {
                    return (T) null;
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
                    return null;
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
            public void set(T t) {

            }

            @Override
            public void add(T element) {
                if (i < 0 && i > size) {
                    throw new ArrayIndexOutOfBoundsException();
                } else if (size == 0) {
                    Node newNode = new Node(null, element, null);
                    first = newNode;
                    last = newNode;
                    size++;
                }
            }
        };
    }

    public static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
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
