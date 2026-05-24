// package assignment.lab14;

import java.util.Vector;

/**
 * VectorDemo
 */
public class VectorDemo {

  public static void main(String[] args) {
    Vector<String> vector = new Vector<>();

    vector.add("java");
    vector.add("python");
    vector.add("c++");

    System.out.println("Vector elements: ");
    for (String lang : vector) {
      System.out.println(lang);
    }
  }
}
