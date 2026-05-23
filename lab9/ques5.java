// package assignment.lab9;

import java.util.Scanner;

/**
 * ques5
 */
public class ques5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      rev += str.charAt(i);
    }
    System.out.println(rev);

    if (str.equalsIgnoreCase(rev)) {
      System.out.println("Palindrome");
    }
    else {
      System.out.println("Not Palindrome");
    }
  }
}
