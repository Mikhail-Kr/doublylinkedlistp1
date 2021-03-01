package src.main.java;

import org.w3c.dom.Node;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class DoublyLinkedList<T> extends AbstractSequentialList<T> implements Cloneable {
    private int size;

    public DoublyLinkedList() {
    }


    @Override
    public ListIterator<T> listIterator(int i) {
        return new ListIterator<T>() {
            @Override
            public boolean hasNext() {
                return size != i;
            }

            @Override
            public T next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return i <= 1;
            }

            @Override
            public T previous() {
                return null;
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
            public void add(T t) {

            }
        };
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
