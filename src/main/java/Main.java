import src.main.java.DoublyLinkedList;

public class Main {
  /**
   * Проверяет работу классов, созданных
   * в рамках выполнения задания.
   *
   * @param args аргументы командной строки.
   */
  public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();
    list.add(1, 1);
    System.out.printf(String.valueOf(list));
  }
}