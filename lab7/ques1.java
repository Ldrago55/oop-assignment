import java.util.Scanner;

abstract class NumberOperation {
  abstract void square(int n);
  abstract void squareRoot(int n);
  abstract void cube(int n);
}

class Calculate extends NumberOperation {
  void square(int n){
    System.out.println("Square: " + (n * n));
  }
  void squareRoot(int n) {
    System.out.println("Square root: " + Math.sqrt(n));
  }
  void cube(int n) {
    System.out.println("Cube: " + (n * n * n));
  }
}

class ques1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    Calculate calc = new Calculate();
    calc.square(n);
    calc.squareRoot(n);
    calc.cube(n);

    return;
  }
}
