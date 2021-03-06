import src.main.java.DoublyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
  /**
   * Проверяет работу классов, созданных
   * в рамках выполнения задания.
   *
   * @param args аргументы командной строки.
   */
  public static void main(String[] args) {
    DoublyLinkedList<String> list = new  DoublyLinkedList<>();
    list.add("a1");
    list.add("b2");
    list.add("c3");
    list.add(1,"d4");
    list.add("e5");
    list.set(4, "a6");
    list.add("f5");
    String collection = list.toString(list);
    System.out.println("collection = " + collection);
    if (!list.toString(4).equals("a6"))
    {
      System.err.println("Некорректная работа позитивного использования DoublyLinkedList.set");
    }
    if (list.size() != 6) {
      System.err.println("Некорректная работа позитивного использования DoublyLinkedList.size()");
    }
  }
}