// package assignment.lab8;

/**
 * ques4
 */
public class ques4 {

  public static void main(String[] args) {
    // Arithmetic Exception
    try {
      int x = 10/0;
    }
    catch(ArithmeticException e) {
      System.out.println("Arithmetic Exception: " + e);
    }

    // Array index out of bound Exception
    try {
      int arr[] = {1, 2, 3};
      int y = arr[5];
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Exception: " + e);
    }

    // Null Pointer Exception
    try {
      String s = null;
      s.length();
    }
    catch(NullPointerException e) {
      System.out.println("Null Pointer Exception: " + e);
    }

    // Number format Exception
    try {
      int num = Integer.parseInt("ABC");
    }
    catch(NumberFormatException e) {
      System.out.println("Number format Exception: " + e);
    }
  }
}
