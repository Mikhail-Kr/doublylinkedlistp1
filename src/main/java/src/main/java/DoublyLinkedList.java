package src.main.java;

import org.w3c.dom.Node;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class DoublyLinkedList<T> extends AbstractSequentialList<T> implements Cloneable {
    private int size;
    Node<T> first;
    Node<T> last;

    public DoublyLinkedList() {
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        if (!(index >= 0 && index <= size)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return listIterator();
    }


    @Override
    public int size() {
        return size;
    }

    /**
     * Класс узла списка.
     *
     * @param <T> тип элемента списка.
     */
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

    /**
     * Конструктор узла списка.
     *
     * @param data элемент.
     * @param prev предыдущий.
     * @param next селдующий.
     */
    Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
}
