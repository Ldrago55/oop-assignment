// package assignment.lab7;

import java.util.Scanner;

/**
 * Shape
 */
interface Shape {
  void volume();
}

class Sphere implements Shape {
  double radius;

  Sphere(double r){
    this.radius = r;
  }

  public void volume() {
    double v = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    System.out.println("Volume of Sphere = " + v);
  }
}
class Cone implements Shape {
  double radius, height;

  Cone(double r, double h) {
    this.radius = r;
    this.height = h;
  }

  public void volume() {
    double v = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    System.out.println("Volume of Cone = " + v);
  }
}

/**
 * ques4
 */
public class ques4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter radius of Sphere: ");
    double radius = sc.nextDouble();
    Sphere s = new Sphere(radius);
    s.volume();

    System.out.print("Enter radius & height of Cone: ");
    double r = sc.nextDouble();
    double h = sc.nextDouble();
    Cone c = new Cone(r, h);
    c.volume();
    
    return;
  }
}
