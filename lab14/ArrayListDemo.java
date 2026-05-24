// package assignment.lab14;
import java.util.ArrayList;

/**
 * ArrayListDemo
 */
public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add("apple");
    list.add("banana");
    list.add("orange");

    System.out.println("ArrayList elements: ");
    for (String fruit : list) {
      System.out.println(fruit);
    }
  }
}
