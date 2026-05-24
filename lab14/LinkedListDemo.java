// package assignment.lab14;

import java.util.LinkedList;;

/**
 * LinkedListDemo
 */
public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();

    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println("LinkedList elements: ");
    for (Integer num : list) {
      System.out.println(num);
    }
  }
}
