// package assignment.lab9;

/**
 * ques4
 */
public class ques4 {

  public static void main(String[] args) {
    char[] ch = {'h', 'e', 'l', 'l', 'o'};
    String str = new String(ch);
    System.out.println("Character array to String: " + str);

    String str2 = "hello";
    char arr[] = str2.toCharArray();
    System.out.print("String to Character array: ");
    for (char c : arr) {
      System.out.print(c + " ");
    }
  }
}
