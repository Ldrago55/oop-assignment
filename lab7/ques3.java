// package assignment.lab7;
import java.util.Scanner;

abstract class Shape {
  abstract void area();
}

class Rectangle extends Shape {
  int l, b;
  Rectangle(int l, int b) {
    this.l = l;
    this.b = b;
  }
  void area() {
    System.out.println("Area of Rectangle = " + (l * b));
  }
}
class Square extends Shape {
  int s;
  Square(int s) {
    this.s = s;
  }
  void area() {
    System.out.println("Area of Square = " + (s * s));
  }
}
class Triangle extends Shape {
  int b, h;
  Triangle(int b, int h) {
    this.b = b;
    this.h = h;
  }
  void area() {
    System.out.println("Area of Triangle = " + (0.5 * b * h));
  }
}

/**
 * ques3
 */
public class ques3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length & breadth: ");
    int l = sc.nextInt();
    int b = sc.nextInt();
    Rectangle r = new Rectangle(l, b);
    r.area();

    System.out.print("Enter side: ");
    int side = sc.nextInt();
    Square s = new Square(side);
    s.area();

    System.out.print("Enter base & height: ");
    int base = sc.nextInt();
    int h = sc.nextInt();
    Triangle t = new Triangle(base, h);
    t.area();

    return;
  }
}
