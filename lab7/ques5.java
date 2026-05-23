// package assignment.lab7;

/**
 * A
 */
interface A {
  void show();
}
/**
 * B
 */
interface B {
  void display();
}

class C implements A, B {
  public void show() {
    System.out.println("Show method");
  }

  public void display() {
    System.out.println("Display method");
  }
}

/**
 * ques5
 */
public class ques5 {

  public static void main(String[] args) {
    C c = new C();
    c.display();
    c.show();

    return;
  }
}
