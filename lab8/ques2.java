// package assignment.lab8;

/**
 * ques2
 */
public class ques2 {

  public static void main(String[] args) {
    try {
      try {
        int x = 10/0;
      }
      catch(ArithmeticException e) {
        System.out.println("Nested try exception : " + e);
      }

      int a[] = new int[5];
      a[10] = 50;
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Array exception: " + e);
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
