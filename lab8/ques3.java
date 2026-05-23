// package assignment.lab8;

import java.util.Scanner;

class InvalidMarksException extends Exception {
  InvalidMarksException(String message) {
    super(message);
  }
}

/**
 * ques3
 */
public class ques3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[3];

    try {
      int sum = 0;
      for (int i = 0; i < 3; i++) {
        System.out.print("Enter marks for subject " + (i+1) + " : ");
        marks[i] = sc.nextInt();
        sum += marks[i];
        if (marks[i] > 100) {
          throw new InvalidMarksException("Marks cannot be greater than 100");
        }
      }

      float percent = sum / 3;
      System.out.println("Percentage: " + percent + "%");
    }
    catch(InvalidMarksException e) {
      System.out.println("Exception: " + e);
    }
  }
}
