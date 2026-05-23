// package assignment.lab9;

/**
 * ques1
 */
public class ques1 {

  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");

    System.out.println("Compare using == :");
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    
    System.out.println("Compare using compartTo():");
    System.out.println(str1.compareTo(str2));
    System.out.println(str1.compareTo(str3));

    System.out.println("Compare using equals():");
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));

    return;
  }
}
